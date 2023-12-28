public class Perfect {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int sum = 0;
		boolean IsPerfect = false;

		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				sum = sum + i;
			}
		}

		if (x == sum) {
			IsPerfect = true;
		}

		if (IsPerfect) {
			System.out.print(x+" is a perfect number since " + x + " = 1");
			for (int j = 2; j < x; j++) {
				if (x % j == 0) {
					System.out.print(" + " + j);
				}
			}
		} else{
			System.out.println(x+" is not a perfect number");
		}

	}
}
