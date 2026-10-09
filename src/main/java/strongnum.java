import java.util.Scanner;

public class strongnum {
        public static void main(String[] args){
            int a;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number");
            a=sc.nextInt();
            int temp=a;
            int fact=1;
            int rem=0,sum=0;
            while(temp>0){
                rem=temp%10;
                fact=1;
            for (int i = 1; i <= rem; i++) {
                fact*=i;
            }
            sum+=fact;
            temp/=10;
            }
            if(sum==a){
            System.out.println("Strong Number");
        }
            else{
                System.out.println("Not strong");
            }
    }

}
