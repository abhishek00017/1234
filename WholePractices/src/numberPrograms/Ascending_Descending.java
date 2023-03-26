package numberPrograms;

public class Ascending_Descending {

	public static void main(String[] args) {

		// ascendingShorting();
		// descendingShorting();
	}


	public static void ascendingShorting() {
		int[] objects= {2,4,1,6,3,8,6,9,3};
		int temp=0;
		for(int i=0; i<objects.length; i++) {
			for(int j=i+1; j<objects.length; j++) {
				if(objects[i]>=objects[j]) {
					temp=objects[i];
					objects[i]=objects[j];
					objects[j]=temp;
				}
			}
			System.out.print(objects[i]+" ");
		}
	}


	public static void descendingShorting() {
		int[] elements= {3,2,5,4,7,5,9,8,1,6,9};
		int temp=0;
		System.out.print("\nNumbers in descending order = ");
		for(int i=0; i<elements.length; i++){
			for(int j=i+0; j<elements.length; j++) {
				if(elements[i]<=elements[j]) {
					temp=elements[i];
					elements[i]=elements[j];
					elements[j]=temp;
				}

			}
			System.out.print(elements[i]+" ");
		}
	}


}
