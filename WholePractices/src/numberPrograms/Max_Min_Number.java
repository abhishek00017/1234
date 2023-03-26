package numberPrograms;

public class Max_Min_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max();
		min();
	}

	public static void max() {

		int[] a= {36,7,9,3,45,9};

		// if  any value will be found greater then the bellow  given variable value  
		//  then variable value will get changed automatically
		int max=0;

		// It will take out the one by one all  numbers from the given array
		for(int i=0; i<a.length; i++) {

			// in bellow line in IF condition it will check
			// whether elements are Greater or not then the given max value
			if(a[i]>max) {
				max=a[i];
			}
		}

		// It will print your Maximum find element
		System.out.println("Maximum number in given list of numbers= "+max);

	}




	public static void min() {
		int[] a= {56,41,9,24,65,8};
		// if  any value will be found small then the bellow variable value  
		//  then variable value will get changed automatically
		int min=45;
		// It will take out one by one all numbers from the given array
		for(int i=0; i<a.length; i++) {
			// in bellow line in IF condition it will check
			// whether elements are smaller or not then the given min value
			if(a[i]<min) {
				min=a[i];
			}
		}
		// It will print your minimum find element
		System.out.println("minimum number in given list of numbers = "+min);
	}
}
