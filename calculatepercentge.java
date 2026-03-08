import java.util.Scanner;

public class calculatepercentge {
    public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
System.out.println("enter the total maks of percent ");
int Total = sc.nextInt();
System.out.println("enter the marks in math");
int math = sc.nextInt();
System.out.println("eNTER THE MARKS in science");
int science = sc.nextInt();
System.out.println("enter the marks in nepali");
int nepali = sc.nextInt();
System.out.println("ente the marks in social");
int social = sc.nextInt();
int total = math + science + nepali + social;
float percentage = (total * Total)/(4 * 100) ;
System.out.println("the total percentage he got is = " + percentage + "%" );
    }
}
