public class OneOfEach {
	public static void main (String[] args) {
		boolean girl=false;
		boolean boy=false;
		int numbofchildren=0;
		while (!(girl||boy)){
			double gender=Math.random();
			if(gender<0.5){
				System.out.println("b");
				boy=true;
			} else {
				System.out.println("g");
				girl=true;
			}
			numbofchildren++;
			System.out.println("You made it... and now you have "+numbofchildren+" children.");

		}
	}
}
