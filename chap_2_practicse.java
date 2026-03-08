import java.util.Scanner;

public class chap_2_practicse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("value of v");
        float v = sc.nextFloat();
        System.out.println("value of u");
        float u = sc.nextFloat();
        System.out.println("value of a");
        float a = sc.nextFloat();
        System.out.println("value of s");
        float s = sc.nextFloat();

        float y = (v*v - u*u)/(2*a*s);
        System.out.println(y);
    }
}
