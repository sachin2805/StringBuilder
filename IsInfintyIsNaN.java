package StringBuilder;
//isinfinity -> ans is infinty   , isNaN -> ans is not a numbrer
public class IsInfintyIsNaN {

	public static void main(String[] args) {
		Double d1=Double.valueOf(0/0.);
		Double d2=Double.valueOf(1/0.);
		Double d3=Double.valueOf(1*1.);
		
		
		System.out.println(d1+" :  "+d1.isInfinite()+", "+d1.isNaN());
		System.out.println(d2+" :  "+d2.isInfinite()+", "+d2.isNaN());
		System.out.println(d3+" :  "+d3.isInfinite()+", "+d3.isNaN());

	}

}
/*OUTPUT
NaN :  false, true
Infinity :  true, false
1.0 :  false, false
*/