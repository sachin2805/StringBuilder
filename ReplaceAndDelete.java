package StringBuilder;

public class ReplaceAndDelete {

	public static void main(String[] args) {
		 StringBuilder sb= new StringBuilder("I Like You");
		
		 System.out.println("Before replace() : "+sb);
		 System.out.println("After replace() : "+sb.replace(2,6, "Love"));//(startIndex , endIndex,Replacestring)

		 System.out.println("After delete(startIndex,EndIndex) : "+sb.delete(0, 2));//(startIndex,EndIndex)
		 System.out.println("After deleteCharAt(Index) : "+sb.deleteCharAt(1));
		 
		 
	}

}
/*OUTPUT
Before replace() : I Like You
After replace() : I Love You
After delete(startIndex,EndIndex) : Love You
After deleteCharAt(Index) : Lve You

*/