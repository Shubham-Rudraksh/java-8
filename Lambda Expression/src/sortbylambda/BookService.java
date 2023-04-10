package sortbylambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	
	public List<Book> sortbyName() {
		List <Book> list= new BookDao().getBooks();
		Collections.sort(list, (b1, b2)-> b1.getName().compareTo(b2.getName()));
		return list;
	}
	
	public List<Book> sortbyAuthor(){
		List <Book> list= new BookDao().getBooks();
		Collections.sort(list, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				
				return o1.getAuthor().compareTo(o2.getAuthor());
			}
		});
		return list;
	}
	
	public List<Book> sortbyId(){
		List <Book> list= new BookDao().getBooks();
		Collections.sort(list,new MyComparator() );
		return list;
	}
	
	
	public static void main(String[] args) {
		System.out.println("sort by name");
		
	System.out.println(new BookService().sortbyName());
	System.out.println();
	System.out.println("sort by author");
	System.out.println(new BookService().sortbyAuthor());
	System.out.println();
	System.out.println("sort by Desc Id");
	System.out.println(new BookService().sortbyId());
	}

}

class MyComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		return o2.getId()-o1.getId();
	}
	
}
