package co.cg;
import java.util.Scanner;

class Perform{
	public void AddString(String str) {
		String str2 = str+str;
		System.out.println(str2);
		}
	
	
		public void Replace(String str) {
			for(int i=1;i<str.length();i++) {
				if(i%2!=0) {
					str = str.substring(0,i-1) + '#' + str.substring(i,str.length());
				}
			}
			System.out.println(str);
		}
		
//		public void RemoveDuplicates(String str){
//			String res="";
//			int ind=0;
//			for(int i=0;i<str.length();i++) {
//				for(int j=i+1;j<str.length();j++) {
//					if(str.charAt(i)==str.charAt(j))
//					{
//						break;
//					}
//					if(j==str.length()) {
//						res[ind] = str.charAt(i);
//						ind++;
//					}
//				}
//			}
//			System.out.println(res);
//		}
		
		
		public void OddCharacterToUpperCase(String str) {
			for(int i=0;i<str.length();i++) {
				if(i%2!=0) {
					str = str.substring(0,i) + str.substring(i,i+1).toUpperCase() + str.substring(i+1);
				}
			}
			System.out.println(str);
		}
		
		public boolean isPositive(String str) {
			for(int i=0;i<str.length()-1;i++) {
				if(str.charAt(i)>str.charAt(i+1)) {
					return false;
				}
			}
			return true;
		}
}
public class Class1 {
	
		public static void main(String args[]) {
			
			System.out.println("Enter choice");
			System.out.println("1. Add the String to itself");
			System.out.println("2. Replace odd positions with #");
			System.out.println("3. Remove duplicate characters in the String");
			System.out.println("4. Change odd characters to upper case");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			Perform p = new Perform();
			
			switch(choice) {
				case 1: p.AddString("string");
						break;
				case 2: p.Replace("string");
						break;
//				case 3: p.RemoveDuplicates("stringsg");
//						break;
				case 4: p.OddCharacterToUpperCase("string");
						break;
			}
			
			if(p.isPositive("ant")) {
				System.out.println("Positive String");
			}
			else {
				System.out.println("Not a Positive String");
			}
			
		}
		

}
