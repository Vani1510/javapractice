import java.util.Scanner;

public class swap {
    public static void  main(String[] args){
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter A and b");
        a=in.nextInt();
        b=in.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
}
