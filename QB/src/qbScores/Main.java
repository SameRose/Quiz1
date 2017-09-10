package qbScores;

import java.util.Scanner;

public class Main {

public static void main(String [ ] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter Number of Touchdowns:" );
double TD = sc.nextInt();
System.out.println("Enter Total Yards:" );
double YDS = sc.nextInt();
System.out.println("Enter Number of Completions:" );
double COMP = sc.nextInt();
System.out.println("Enter Number of Passes Attempted:" );
double ATT = sc.nextInt();
System.out.println("Enter Number of Interceptions:" );
double INT = sc.nextInt();

double A = 5*((COMP/ATT)-0.3);
if (A > 2.375) {
	A = 2.375;
}
if (A < 0) {
	A = 0;
}
double B = (0.25)*((YDS/ATT)-3);
if (B > 2.375) {
	B = 2.375;
}
if (B < 0) {
	B = 0;
}
double C = ((TD/ATT)*20);
if (C > 2.375) {
	C = 2.375;
}
if (C < 0) {
	C = 0;
}
double D = 2.375-((INT/ATT)*25);
if (D > 2.375) {
	D = 2.375;
}
if (D < 0) {
	D = 0;
}
double Final = (A + B + C + D)*100/6;

System.out.println(Final);


}





}
