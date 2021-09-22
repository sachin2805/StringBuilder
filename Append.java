package StringBuilder;

public class Append {

	public static void main(String[] args) {
		String s;
		int a=21;
		StringBuilder sb=new StringBuilder(30); //30->capacity
		
		s=sb.append("Age of Sachin = ").append(a).append(" !!!").toString();
		
		System.out.println("Using append in different data :\n"+s);

	}

}
/*OUTPUT
Using append in different data :
Age of Sachin = 21 !!!
*/