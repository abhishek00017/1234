package numberPrograms;

public class Duplicacy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}





	public static void duplicacy() {
		int[] element= {5,7,4,3,9,1,4,6};

		// Bellow variable is for storing duplicate number
		int duplicate=0;

		// It will take out the one by one all  numbers from the given array
		for(int i=0; i<element.length; i++){

			// It will take out one by one all  numbers from the given array
			// and it will start from the second element because of i+1
			for(int j=i+1; j<element.length; j++) {

				//bellow condition will check whether both number are equal or not
				// if both will be equal then it will be replaced in duplicate variable
				if(element[i]==element[j]) {
					duplicate=element[j];
				}
			}
		}
		System.out.println(duplicate);	

	}

}
