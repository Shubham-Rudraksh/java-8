package infy;

public class JumpProgram {
	public static void main(String[] args) {
		
		int [] arr = {2,3,4,2,5,3,1,2,7,8,9};
		
		boolean b= true;
		int i=0;
		int jump =0;
		
		while (b) {
			System.out.println(arr[i]);
			i=i+ arr[i];
			jump++;
			if( i> arr.length) {
				b= false;
			}
		}
		
		System.out.println("jump "+ jump);
		
		
		
		int jump1=0;
		for (int j = 0; j < arr.length;) {
			System.out.println(arr[j]);
			j= j+ arr[j];
			jump1++;
			
		}
		System.out.println(jump1);
	}
	


}
