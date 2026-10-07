import java.util.Scanner;

public class relop {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("a==b "+(a==b));
        System.out.println("a>=b "+(a>=b));
        System.out.println("a<=b "+(a<=b));
        System.out.println("a!=b "+(a!=b));
        System.out.println("a>b "+(a>b));
        System.out.println("a<b "+(a<b));
    }
}
