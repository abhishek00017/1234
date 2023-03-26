package stringPrograms;
import java.util.Scanner;
public class RemoveDuplicacy {

	public static void main(String[] args) {
		//...FOR SHORTED ARRAY	
		//	    forShortedArray();
		//		usingExistingArray();

		//...FOR UNSHORTED ARRAY
		//		unShortedArray(); //...not Solved

		//		arrayComparision();
				switchCase();
	}

	public static void switchCase() {
		System.out.println("Execution of swichCase() method...\n");
		Scanner sc=new Scanner(System.in);
		String tryAgain="";
		do {
			System.out.println("Enter any word/number...");
			String a=sc.next();
			switch (a) 
			{
			case "a":System.out.println("Apple");
			break;
			case "b":System.out.println("Boll");
			break;
			case "c":System.out.println("Cat");
			break;
			case "d":System.out.println("Dog");
			break;
			default:System.out.println("wrong input");
			}
			System.out.println("Want to try again...yes/no");
			tryAgain=sc.next();
		}while(tryAgain.contains("y"));
		System.out.println("OK!...finished");

	}
	public static void arrayComparision() {
		int[]a= {1,2,3,4,5};
		int[]b= {1,2,7,4,5,9,0};
		for(int i=0; i<a.length;i++) {
			if(a[i]==b[i]) {
				System.out.println("Element of index no: ["+i+"] of array a and array b matched"+"(Element of array a ,Element of array b)=("+a[i]+","+b[i]+")");

			}else {
				System.err.println("Element of index no: ["+i+"] of array a and array b didn't matched"+"(Element of array a ,Element of array b)=("+a[i]+","+b[i]+")");
			}
		}
	}











	public static void unShortedArray() {
		int[] numbers= {2,4,2,3,4,3};
		int k=0;
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=0; j<numbers.length-1; j++) {
				if(numbers[i]==numbers[j]) {

					numbers[k]=numbers[i];
					System.out.println(numbers[k]);
					if(numbers[i]!=numbers[j]) {
						k++;
					}
				}
			}

		}
		//		numbers[k]=numbers[numbers.length];

	}


	public static void usingExistingArray(){

		int[]numbers= {1,1,2,3,3,4,4,5,6,6,7,8,8};
		int j=0;

		for(int i=0; i<numbers.length-1; i++) {
			if(numbers[i]!=numbers[i+1]) {
				numbers[j]=numbers[i];
				System.out.print(numbers[j]+" ");
				j++;
			}
		}
		numbers[j]=numbers[numbers.length-1];
		System.out.println(numbers[j]);
	}


	public static void forShortedArray(){
		int [] listOfNumbers= {1,1,1,1,2,2,2,3,3,3,3,4,4,5,5,5,5,6,6,7,7,8,8,9,9,9,9,9};
		int []temp=new int[listOfNumbers.length];
		int j=0;
		for(int i=0; i<listOfNumbers.length-1; i++) {

			if(listOfNumbers[i]!=listOfNumbers[i+1]) {
				temp[j]=listOfNumbers[i];
				System.out.print(temp[j]+" ");
				j++;
			}
		}
		temp[j]=listOfNumbers[listOfNumbers.length-1];
		System.out.println(temp[j]);
	}

}
