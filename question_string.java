public class question_string {
    public static void main(String[] args) {
         String name = "Prashant   saud";
         System.out.println(name.replace(" ", "_"));
String letter = "Dear <name>, Thanks a lot!";
letter = letter.replace("<name>", "prashant");
System.out.println(letter);
System.out.println("double space position: " + name.indexOf("  "));
System.out.println("tiple space position: "+name.indexOf("   "));
    }
}
