public class OneOfEachStats1 {
	public static void main(String[] args) {
		int countGirl = 0;
		int countBoy = 0;
		int sum = 0;

		int sumOfAll=0;

		double T=Double.parseDouble(args[0]);
		double trial = T;

		int numberOf2children=0;
		int numberOf3children=0;
		int numberOf4childrenOrMore=0;
		int mod=0;

		for (int j = 0; j <trial ; j++) {
			int number=(int) (Math.random()*2);
			if(number==0) {
				while(number==0){
					countGirl++;
					number=(int) (Math.random()*2);
				}

				countBoy++;
				sum=countGirl+countBoy;
				sumOfAll=sumOfAll+sum; //total number of children

				countBoy=0;
				countGirl=0;
			}
			else{
				while(number==1){
					countBoy++;
					number=(int) (Math.random()*2);
				}


				countGirl++;
				sum=countGirl+countBoy;
				sumOfAll=sumOfAll+sum; //total number of children

				countBoy=0;
				countGirl=0;
			}
			if(sum==2){
				numberOf2children++;
			}
			else if(sum==3){
				numberOf3children++;
			}
			else {
				numberOf4childrenOrMore++;
			}

		}

		if(numberOf2children>numberOf3children && numberOf2children>numberOf4childrenOrMore) {
			mod = 2;
		} else if(numberOf3children>numberOf2children && numberOf3children>numberOf4childrenOrMore){
			mod=3;
		} else {
			mod=4;
		}


		double average=sumOfAll/trial;
		System.out.println("Average: "+ average + " children to get at least one of each gender." );
		System.out.println("Number of families with 2 children: "+numberOf2children);
		System.out.println("Number of families with 3 children: "+numberOf3children);
		System.out.println("Number of families with 4 or more children: "+numberOf4childrenOrMore);
		if(mod<4){
			System.out.println("The most common number of children is "+mod+ ".");
		}

		else {
			System.out.println("The most common number of children is: "+mod+ " or more.");
		}

	}
}
