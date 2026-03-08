import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        //  System.out.println("hey,what is your name");
        //  String name = sc.next();
        //  System.out.println("hii " + name + " how can i help you");

        System.out.println("hello");
        
        System.out.println("can i know your name ");
        String name = sc.next();

        System.out.println("can i know your AGE");
        byte age = sc.nextByte();

        System.out.println("where do you live ");
        String adddress = sc.next();

        System.out.println("now your full info is listting bellow:-");

        System.out.println("NAME:-" + name);
        System.out.println("AGE:-" + age);
        System.out.println("ADDRESS:-" + adddress);


        
    }
}
