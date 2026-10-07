import java.util.Scanner;

public class oddeven {
    public static void main(String[] args){
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        r=sc.nextInt();
        System.out.println((r%2==0)?"Even":"Odd");
    }
}
