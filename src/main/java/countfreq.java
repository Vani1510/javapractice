import java.util.Scanner;

public class countfreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number and digit to count");
        int num=sc.nextInt();
        int dig=sc.nextInt();
        int rem=0,count=0;
        while(num>0){
            rem=num%10;
            if(rem==dig){
                count++;
            }
            num/=10;
        }
        System.out.println("Frequency="+count);
    }
}
