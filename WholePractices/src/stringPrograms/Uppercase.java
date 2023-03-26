package stringPrograms;

public class Uppercase {

	
	public static void main(String[] args) {
		
		String name="abhishek kumar yadav";
		
		char []nameChar=name.toCharArray();
		for(int i=0; i<nameChar.length; i++) {
			
			if( i== 0 | i==9 | i==15 ) {
				
				int toUpper=(int)nameChar[i]-32;
				nameChar[i]=(char)toUpper;
				
			}
			
			
			
		}
		for(int i=0; i<nameChar.length; i++) {
			
			System.out.print(nameChar[i]);
		}
	}
}
