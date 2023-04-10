package sortbylambda;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	

	
	public List<Book> getBooks()
	{
		List<Book> books= new ArrayList<Book>();
		books.add(new Book(1, "gameofthrones", "sdckvus",100 ));
		books.add(new Book(2, "harrypotter", "vgsdss",100 ));
		books.add(new Book(6, "fiftyshadesofgray", "epofuf",100 ));
		books.add(new Book(5, "wingsoffire", " nxcbhv",100 ));
		books.add(new Book(3, "brokenheart", "vbfdsivy",100 ));
		return books;
	}

}
