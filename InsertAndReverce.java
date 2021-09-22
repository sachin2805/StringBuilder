package StringBuilder;

public class InsertAndReverce {

	public static void main(String[] args) {
		 StringBuilder sb= new StringBuilder("I You");
		 
		 System.out.println("Before insert() :\n"+sb);
		 sb.insert(2, "Love"+" ");
		 
		 System.out.println("After insert() :\n"+sb);
		 
		 StringBuilder sb1=new StringBuilder(40);//capacity
		 sb1.append("World Femous Lover");
		 
		 System.out.println("Before reverce() : \n"+sb1);
		 System.out.println("After reverce() : \n"+sb1.reverse());

	}

}
/*OUTPU
Before insert() :
I You
After insert() :
I Love You
Before reverce() : 
World Femous Lover
After reverce() : 
revoL suomeF dlroW
*/
