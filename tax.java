import java.util.Scanner;

public class tax{
    public static void main(String[] args) {
        float tax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income");
        float income = sc.nextFloat();

        if (income < 2.5f)
        {
            tax = tax + 0;

        }
        else if (income > 2.5f && income <= 5f)
        {
            tax = tax + (income-2.5f) * 0.05f;
        }
        else if (income > 5f && income <= 10f)
        {
            tax = tax + 0.05f*(5f-2.5f);
            tax = tax + 0.2f*(income - 5f);

        }
        else if (income > 10f)
        {
            tax = tax + 0.05f*(5f-2.5f);
            tax = tax + 0.2f*(10f - 5f);
            tax = tax + 0.3f*(income - 5f);
            
        }

        System.out.println("the total tax you have to pay is "+ tax);


        
        
    }
}