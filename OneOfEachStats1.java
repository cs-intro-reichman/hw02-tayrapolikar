public class OneOfEachStats1 {
	public static void main(String[] args) {
		int countGirl = 0;
		int countBoy = 0;
		int sum = 0;

		int sumOfAll=0;

		boolean fact = false;
		double averageOfAverage=0;
		double T=Double.parseDouble(args[0]);
		double trial = T;

		int numberOf2children=0;
		int numberOf3children=0;
		int numberOf4childrenOrMore=0;
		int MoreThan4children=0;
		int mod=2;

		for (int j = 0; j <trial ; j++) {

			int number=(int)(Math.random()*2);;
			if(number==0) {
				while(number==0){
					countGirl++;
					number=(int)(Math.random()*2);

				}


				countBoy++;
				sum=countGirl+countBoy;
				sumOfAll=sumOfAll+sum; //total number of children

				countBoy=0;
				countGirl=0;
				sumOfAll=sumOfAll+sum;
			}
			else{
				while(number==1){
					countBoy++;
					number=(int)(Math.random()*2);
				}


				countGirl++;
				sum=countGirl+countBoy;
				sumOfAll=sumOfAll+sum; //total number of children

				countBoy=0;
				countGirl=0;
				sumOfAll=sumOfAll+sum;
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
		if(numberOf3children>mod){
			mod=3;
		}
		if(numberOf4childrenOrMore>mod){
			mod=4;
		}
		double average=sumOfAll/trial;
		System.out.println("Average: "+ average + " children to get at least one of each gender." );
		System.out.println("Number of families with 2 children: "+numberOf2children);
		System.out.println("Number of families with 3 children: "+numberOf3children);
		System.out.println("Number of families with 4 or more children: "+numberOf4childrenOrMore);
		if(mod<4){
			System.out.println("The most common number of children is: "+mod);
		}

		else {
			System.out.println("The most common number of children is: "+mod+ " more.");
		}

	}
}
