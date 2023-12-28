public class Reverse {
	public static void main(String[] args) {
		String word = args[0];
		int n = word.length();
		for (int i = n - 1; i >= 0; i--) {
			char name = word.charAt(i);
			System.out.print(name);
		}
		System.out.println();

		if(n%2==0){
			char middle = (word.charAt ( (n/2) - 1) );
			System.out.println("The middle character is " + middle);

		}

		if(n%2!=0){
			char middle = (word.charAt( (n/2) ));
			System.out.println("The middle character is " + middle);

		}
	}
}
