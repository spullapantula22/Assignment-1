
public class NativeAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "\u0C32\u0C32\u0C3F\u0C24\u0C4D";
		String hand = "\uD83D\uDC4B";
		
		System.out.println("Hi " + hand + ", my name is " + name);
		
		//The reason the length is five, is because there are 5 Unicode bits.
		System.out.println(name.length());

	}

}
