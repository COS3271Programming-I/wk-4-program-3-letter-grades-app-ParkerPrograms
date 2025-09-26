package Week_4;
import java.util.Scanner;
public class Letter_Grades_APP {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter a test score: ");
        int testscore = userinput.nextInt();
        //note that in ASCII ... A is 65, B is 66, C is 67, etc. 
        //this converts from grade to ASCII value ... the higher the grade the lower the ASCII value
        int ascii = 74 - (testscore / 10);
        if (ascii > 68) {ascii = 70;}
        if (ascii == 64) {ascii = 65;}
        
        String plus_or_minus;
        if (testscore %10 > 6 && testscore > 59 && testscore < 93) {plus_or_minus = "+";}
    	else if (testscore %10 < 3 && testscore > 59 && testscore < 93) {plus_or_minus = "-";}
    	else {plus_or_minus = "";}
    	System.out.println("Grade = " + (char)ascii + plus_or_minus);
		
	}

}
