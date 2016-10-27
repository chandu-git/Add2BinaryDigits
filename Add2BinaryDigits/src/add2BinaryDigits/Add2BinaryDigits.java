package add2BinaryDigits;

public class Add2BinaryDigits {
	public static int[] add2BinaryDigits(int[] a, int[] b){
		int[] c = new int[a.length+1];
		int carry = 0;
		int i=0;
		for(;i<a.length;i++){
			c[i]= (a[i] + b[i] + carry)%2; //reminder
			carry = (a[i] + b[i] + carry)/2; //quotient
		}
		c[i] = carry;
		return c;
	}
}
