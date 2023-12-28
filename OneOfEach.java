public class OneOfEach {
	public static void main(String[] args) {
		boolean girl = false;
		boolean boy = false;
		int numOfChildren = 0;

		while (!(girl&&boy)) {
			int gender = (int) (Math.random()*2);
			if (gender == 0) {
				System.out.print("b ");
				boy = true;
			} else {
				System.out.print("g ");
				girl = true;
			}
			numOfChildren++;
		}

		System.out.println("\nYou made it... and you now have " + numOfChildren + " children.");
	}
}
