package lambda;
interface Applicable{
	
	void m1();
	
}

interface Predictable{
	void predict();
}

interface Returnable
{
	
	String supplySomething() ;
}

interface Additional{
	int sum(int a, int b);
}
public class PracticeLambada{
	public static void main(String[] args) {
		
		Applicable applicable= ()-> System.out.println("application is applicable now");
		applicable.m1();
//		if single line then no need to write in {}
		
		Predictable predictable =()->{
			System.out.println("I");
			System.out.println("am ");
			System.out.println("Unpredictable (*>*)  ");
		};
		predictable.predict();
		
//		compulsory to use{} for curly braces
		
		Returnable returnable= () -> "I am giving ur money back";
		
		System.out.println(returnable.supplySomething());
//		 if ur return something using lambada and there is only single line then no need to use return statement
		
		Returnable returnable1= () ->{
			
			return "I am giving ur money back 500 rs";
		};
		System.out.println(returnable1.supplySomething());
		
//		 if your return something using lambda and there is statement inside bracket {} then you should need to use return statement
					
		Additional additional = (a,b)-> a+b;
		System.out.println(additional.sum(10,23));
		
	}

}
