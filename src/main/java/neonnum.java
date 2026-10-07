import java.util.Scanner;

public class neonnum {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number");
            int n=sc.nextInt();
            int sqnum=n*n;
            int rem=0,sum=0;
            while(sqnum>0){
                rem=sqnum%10;
                sum+=rem;
                sqnum=sqnum/10;
            }
            if(sum==n){
            System.out.println("neon number");
        }
            else{
                System.out.println("not neon");
            }
    }
}
