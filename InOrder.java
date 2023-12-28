public class InOrder {
	public static void main(String[] args) {
		int firstNum = (int) (Math.random() * 10); //[0,10)
		System.out.print(firstNum + " ");

		do {
			int secondNum = (int) (Math.random() * 10);
			if (secondNum >= firstNum) {
				System.out.print(secondNum + " ");
				firstNum = secondNum;
			} else {
				break;
			}
		} while (true);
	}
}
