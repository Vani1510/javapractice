import java.util.Scanner;

public class bigger {
        public static void main(String[] args){
            int a,b;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 2 numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println((a>b)?a:b);
        }
}
