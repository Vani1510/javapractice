import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
        int result=0;
        int place=1;
        while(a>0){
            int rem=a%10;
            if(rem!=0){
                result+=rem*place;
                place*=10;
            }
            a/=10;
        }
        System.out.println(result);
    }
}
