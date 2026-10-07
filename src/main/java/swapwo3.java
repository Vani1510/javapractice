import java.util.Scanner;

public class swapwo3 {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A and b");
        a = in.nextInt();
        b = in.nextInt();
        a = a + b;
        b = a - b;
        a= a - b;
        System.out.println("A=" + a);
        System.out.println("B=" + b);
    }
}