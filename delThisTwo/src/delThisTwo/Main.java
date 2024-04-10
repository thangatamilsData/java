package delThisTwo;

import java.util.*;

class Main{
	public static void main(String[] args){
 
		int[] array = {6, 8, 59, 2, 43, 1};
		rev(array);

		System.out.println(Arrays.toString(array));

		First s = new Second();

		s.dis();
		s.fix();

		System.out.println(Second.dis(2, "hl"));

		int e = Enumerate.MONDAY.getVal();
		System.out.println(e + " ");

		System.out.println();

		for(Enumerate m : Enumerate.values()){
				System.out.println(m + " " + m.getVal());

		}

		boom b = new boo();
		System.out.println(b.look());


	}

	static void rev(int[] arr){
		int i = 0;
		int j = arr.length-1;

		while(i < j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

}
interface First{

	void fix();

	String name = "java";
	int age = 22;

	default void dis(){
		System.out.println("Hello " + name);
	}


}

class Second implements First{

  	public void fix(){
		System.out.println("From Second!");
	}

	static String dis(int a, String b){
		return (a + " " +b);
	 }


}

enum Enumerate{
	MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);

	int n;

	Enumerate(int N){
		this.n = N;
	}

	int getVal(){
		return this.n; 
	}

} 

interface boom{
	
	String look();

	default void show(){
		System.out.println("l");	
	}
}

class boo implements boom{
	
	public String look() {
		return "hel";
	}
	
}
	

