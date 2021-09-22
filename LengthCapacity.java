package StringBuilder;

public class LengthCapacity {

	public static void main(String[] args) {
		String s1="Sachin";
		StringBuilder sb=new StringBuilder("Hello");
		StringBuilder sb1=new StringBuilder(s1);
		StringBuilder sb2=new StringBuilder(25); //pass capacity
		
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println("length of sb1 : \n"+sb1.length());
		System.out.println("Capacity of sb1 : \n"+sb1.capacity());//capasity initaily 16 
		
		System.out.println("Capacity of sb2 : \n"+sb2.capacity());
		
		sb2=sb2.append("Profound");
		
		System.out.println(sb2);
		

	}

}
/*OUTPUT
 * Hello
Sachin
length of sb1 : 
6
Capacity of sb1 : 
22
Capacity of sb2 : 
25
Profound
*/
