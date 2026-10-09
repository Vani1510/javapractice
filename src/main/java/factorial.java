import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        a=sc.nextInt();
        int fact=1;
        for (int i = 1; i <= a; i++) {
            fact*=i;
        }
        System.out.println("Factorial="+fact);
        }
}
