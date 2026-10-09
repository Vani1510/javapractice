import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        int sqa = a * a;
        int temp = a;
        while (temp > 0 && (temp % 10 == sqa % 10)) {
            temp = temp / 10;
            sqa = sqa / 10;
        }
        if (temp == 0) {
            System.out.println(a + " is an Automorphic number.");
        } else {
            System.out.println(a + " is NOT an Automorphic number.");
        }
    }
}