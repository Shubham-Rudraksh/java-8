package functionalinterface;
@FunctionalInterface
public interface MuInterface {
	abstract void play();
	
//	abstract void game(;)
	
	default void playmusics(){
		System.out.print("aaai tuz deul sajatay");
	}

	public static void favoriteStreamer() {
		System.out.println("Shreeman legend");
	}
	
//	function Interface is interface which have only single abstract method
//	it allows multiple default static method.
	
	

}
