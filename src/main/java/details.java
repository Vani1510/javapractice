import java.util.Scanner;

public class details {
    public static void main(String[] args) {
        String name, rollno;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Name ,roll no.,age");
        name = sc.nextLine();
        rollno = sc.nextLine();
        age = sc.nextInt();
        System.out.println(name +" " + rollno+" "+age);
    }
}
