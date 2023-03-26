package stringPrograms;
import java.util.Scanner;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IllegalFormatPrecisionException;
import java.util.List;
public class StringPrograms {


	public static void main(String[] args) {
		//			reverseWordOnposition();
		//	toReverseFirstAndLast();
		arangementAsAlphabetical();
		//	everyWordOccurance1();
		//	palindrome();
		//			reverse();
		//	stringProblem();
		//	wordInAlphabetical();
		//	removeSpace();
		//	countVowels();
		//	getcommonelement();
		//  primitivePalindrome(1221);
		//	maxMin();
		//reverseNxtWord();
		//		anagramString();

	}



	public static void replaceStringWithNext() {
		
		String word="Rohita";  //oRihat
		String reverse="";
		char[] a=word.toCharArray();
		
		for( int i=0; i<word.length(); i=i+2) {
			reverse=reverse+a[i+1];
			reverse=reverse+a[i];
		}
		System.out.print(reverse);
	}


	public static void anagramString() {
		String s="ravish".toLowerCase().replace(" ", "");
		String s1="varish".toLowerCase().replace(" ", "");

		ArrayList a=new ArrayList();
		a.add(3);
		a.add(5.7);
		a.add('y');
		a.add(true);
		a.add("rishilesh");
		System.err.println(a.size());
		for (Object object : a) {
			System.out.println(object);
		}




		if(s.length()==s1.length()) {


		}

		//		Arrays.sort(s);
		//		Arrays.sort(s1);
		if(s.equals(s1)) {
			System.out.println("Given elements is an anagram");
		}else {
			System.out.println("Given elements are not a anagram");
		}

	}




	public static void reverseNxtWord() {
		String toSplitST= "I LOVE MY INDIA";
		String[] st=toSplitST.split(" ");
		for (int i=0; i<st.length; i++) {
			if(i%2==0) {
				System.out.print(st[i]+" ");
			}

			if(i%2!=0) {
				char[] cr=st[i].toCharArray();
				String str="";
				for(int j=cr.length-1; j>=0; j--) {
					str=str+cr[j];
				}
				System.out.print(str+" ");


			}








			//			if(i%2!=0) { 
			//
			//				String sf="";
			//				for(int j=st[i].length()-1;j>=0;j--) {
			//					char []ch=st[i].toCharArray()	;
			//					sf=sf+ch[j];
			//					System.out.print(sf);
			//				}
			//
			//			}
		}
	}



	public static void maxMin() {

		int[]numbers= {4,6,18,7,9,4};
		int max= numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		System.out.println(max);

		int min=numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]<min) {
				min=numbers[i];
			}
		}
		System.out.println(min);
	}



	public static void primitivePalindrome(int noToCheck) {
		Integer num=noToCheck;
		int userNumber= num;
		int reversedNumber=0;
		String str=num.toString();
		for(int i=str.length()-1; i>=0; i--) {
			reversedNumber=reversedNumber*10+num%10;
			num=num/10;

		}
		if(userNumber==reversedNumber) {
			System.out.println("given input number is an palindrome.");
		}else {
			System.err.println("given input number is not an palindrome.");
		}
	}





	public static void getcommonelement() {


		String a="abhishek";
		String b="vivekananda";

		for(int i=0; i<a.length(); i++) {
			char charecter=a.charAt(i);
			int count=0;
			for(int j=0; j<b.length(); j++) {
				char charecter1=b.charAt(j);
				if(charecter==charecter1) {
					count++;
				}


			}
			if(count>0) {
				System.out.println(charecter+"  : is a common charecter");
			}
		}

	}

	public static void toUpperCase() {

		String name="AbhiShek".toUpperCase();





	}





	public static void toLowerCase() {




	}




	public static void countVowels() {

		Scanner userInputAs=new Scanner(System.in);
		System.out.println("Please write any paragraph to count the Vowels....");
		String paragraph=userInputAs.nextLine();

		int totalVowels=0;
		for(int i=0; i<paragraph.length(); i++) {

			if(paragraph.charAt(i)=='a'|| paragraph.charAt(i)=='e'|| paragraph.charAt(i)=='i'|| paragraph.charAt(i)=='o'|| paragraph.charAt(i)=='u'|| 
					paragraph.charAt(i)=='A'|| paragraph.charAt(i)=='E'|| paragraph.charAt(i)=='I'|| paragraph.charAt(i)=='O'|| paragraph.charAt(i)=='U')
			{
				totalVowels++;

			}
		}
		System.out.println("The paragraph given by the user has " + totalVowels+" Vowels");





		//...1...........containing all Vowels in a String;
		//		String vowels="aeiouAEIOU";
		//		int noOfVowels=0;
		//		for(int i=0; i<vowels.length(); i++) {
		//			int count=0;
		//			for(int j=0; j<paragraph.length(); j++) {
		//				if(vowels.charAt(i)==paragraph.charAt(j)) {
		//					noOfVowels++;
		//					count++;
		//				}
		//			}
		//			if(count>0) {
		//				System.out.println(vowels.charAt(i)+" = "+count);
		//			}
		//		
		//		}
		//System.out.println("Total number of Vowels is:  "+noOfVowels);


	}



	public static void countSpecialCharecter() {




	}



	public static void removeSpace() {

		String sentence="Who is the guy to eat meat instead of chicken";
		String spacelessWord="";

		//		 //WITH STRING'S SPLIT() METHOD 
		//		String []s=sentence.split(" ");
		//		
		//		for(int i=0; i<s.length; i++) {
		//			spacelessWord=spacelessWord+s[i];
		//		}
		//		System.out.println(spacelessWord);


		//
		for(int i=0; i<sentence.length(); i++) {
			if(sentence.charAt(i)==' ') {
				spacelessWord=spacelessWord+"";
			}else {
				spacelessWord=spacelessWord+sentence.charAt(i);
			}
		}
		System.out.println(spacelessWord);

	}




	public static void stringObj() {

		String s2=new String("abhi");
		String s3=new String("abhi");
		String s4="abhi";
		String s5=new String();
		String s6=new String();
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s2.equals(s3));


	}



	public static void stringProblem() {
		//		String s1='h'+7+"s"; 
		//		String s="s"+'h'+7;         //..........program will be execute from top  to bottom &
		//		System.out.println(s+"  "+s1);      //                                       left to right 

	}



	public static void wordInAlphabetical() {
		String originalWord="shivashek";
		String[] shortedWord=new String[originalWord.length()];
		for(int a=0; a<originalWord.length(); a++) {
			for(int b=a; b<originalWord.length(); b++) {
				char cr=originalWord.charAt(a);
				char cr1=originalWord.charAt(b);

				if(cr1<cr) {
					;

				}

			}
		}
		System.out.println("shortedWord: "+shortedWord);
	}


	public static void everyWordOccurance1() {
		Scanner takeInput=new Scanner (System.in);
		System.out.println("Give charecter to count the repeatation....");
		String word=takeInput.nextLine();                    //.........."this@_/'.:\".<? Is The methOd";

		for(char ab=0;ab<=256;ab++) {
			int count =0;
			for(int i=0;i<word.length();i++) {
				if(ab==word.charAt(i)) {
					count++;

				}

			}
			if(count>0) {
				System.out.println(ab+" "+count);
			}
		}
	}




	public static void reverse() {
		String ab= "hi i am vikas";
		String[] d=	ab.split(" ");

		for(int i=0;i<d.length;i++) {
			char abc[]=d[i].toCharArray();   //abc[] ={'v','i','k','a','s'};
			for (int j = d[i].length()-1; j>=0; j--) {

				System.out.print(abc[j]);
			}

			System.out.print(" ");
			{

			}


		}

	}

	public static void palindrome() {
		String ab="nitin";
		String reverse="";
		for(int i=ab.length()-1;i>=0;i--) {
			reverse=reverse+ab.charAt(i);
			System.out.print(ab.charAt(i));

		}
		if(ab.equals(reverse)) {
			System.out.println("\ngiven word is palindrome");
		}else
			System.out.println("\ngiven word is not palindrome");
	}



	public static void everyWordOccurance() {
		//		occurrence of each character in a string using ARRAY

		String str;  
		int i, len;  
		int counter[] = new int[256];  
		Scanner scanner = new Scanner(System.in);  
		System.out.print("Please enter a string: ");  

		//reading a string from the user  
		str = scanner.nextLine();  

		//finds the length of the string  
		len = str.length();  

		// loop through the string and count frequency of every character and store it in counter array  
		for (i = 0; i < len; i++)   
		{  
			counter[(int) str.charAt(i)]++;  
		}  

		//print Frequency of characters  
		for (i = 0; i < 256; i++)   
		{  
			if (counter[i] != 0)   
			{  

				//prints frequency of characters      
				System.out.println((char) i + " is :" + counter[i]+" Times");  
			}  
		}  


	}



	public static void arangementAsAlphabetical() {
		String word="abhishek";
		String temp="";
		for (int i = 0; i < word.length(); i++) {
			int cr=word.charAt(i);
			for (int j = i+1; j < word.length(); j++) {
				if(word.charAt(i)<word.charAt(j)) {
					temp=temp+word.charAt(i);
					//					word.charAt(i)=word.charAt(j);
				}
			}
		}                                                                                                                    /* the quick brown fox jumpes over the lazy dog */
		System.out.println(temp);
	}








	public static void toReverseFirstAndLast() { 

		String word="hey i am vikas yadav";
		String []a	=word.split(" ");

		for (int i = 0; i<a.length; i++) {
			char []worde=a[i].toCharArray();

			if(i==0||i==a.length-1) {
				for (int j = a[i].length()-1; j>=0; j--) {
					System.out.print(worde[j]);
				}
			}else{
				System.out.print(a[i]);
			}
			{
				System.out.print(" ");

			}
		}

	}

	public static void reverseWordOnposition() {
		String paragraph="The quick brown fox jumps over the lazy dog";
		String[] splitedparagraph=paragraph.split(" ");

		for (int i = 0; i < splitedparagraph.length; i++) {
			char[]singleWord=splitedparagraph[i].toCharArray();
			for (int j =splitedparagraph[i].length()-1; j >=0; j--) {
				System.out.print(singleWord[j]);
			}
			System.out.print(" ");
		}
	}



}
