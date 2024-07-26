import java.util.Scanner;
public class practical2part1{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println("Enter your first name:");
		String str1=scanner.nextLine();

		System.out.println("Enter your middle name:");
		String str2=scanner.nextLine();

		System.out.println("Enter your last name:");
		String str3=scanner.nextLine();
		
		stringBuilder.append(str1);
		stringBuilder.append(" " + str2);
		stringBuilder.append(" " + str3);

		String result= stringBuilder.toString();
		
        System.out.println("" +result);

		System.out.println("Again Enter your first name:");
		String str4=scanner.nextLine();

		System.out.println("Again Enter your middle name:");
		String str5=scanner.nextLine();

		System.out.println("Again Enter your last name:");
		String str6=scanner.nextLine();

		if(str1.equalsIgnoreCase(str4)){
			System.out.println("Correct");
		}
		else{
			System.out.println("Incorrect");
		}
		
		String replacedStr = result.replace("a","@");
		String replacedStr = result.replace("e","3");


		

	
	
	
	
	
	
	}


}
