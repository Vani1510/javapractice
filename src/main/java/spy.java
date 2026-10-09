import java.util.Scanner;

public class spy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to Check");
        int n=sc.nextInt();
        int rem=0,sum=0,prod=1;
        while(n>0){
            rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        if(sum==prod){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }

    }
}
