public class OneOfEach {
	public static void main(String[] args) {
		int countGirl = 0;
		int countBoy = 0;
		int sum = 0;

		int number = (int) (Math.random() * 2);

		if (number == 0) { //girl
			while (number == 0) { //erkek doğana kadar tekrar
				countGirl++;
				number = (int) (Math.random() * 2);

			}
			for (int i = 0; i < countGirl; i++) { //erkek doğdu loop bitti k k e e yazıya geçirdik
				System.out.print("g ");
			}
			System.out.println("b ");
			countBoy++; //erkek 1 arttı
			sum = countGirl + countBoy;

			System.out.println("You made it...and you have " + sum + " children.");

		} else {
			while (number == 1) {
				countBoy++;
				number = (int) (Math.random() * 2);
			}
			for (int i = 0; i < countBoy; i++) {
				System.out.print("b ");
			}
			System.out.println("g ");
			countGirl++;
			sum = countGirl + countBoy;

			System.out.println("You made it...and you have " + sum + " children");


		}
	}
}
