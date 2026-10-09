import java.util.Scanner;

public class add {
    static int add(int a,int b){
        for (int i = 1; i <=b; i++) {
            a++;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=add(a,b);
        System.out.println(result);
    }
}
