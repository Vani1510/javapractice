import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        int rem=0;
        int sum=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        temp=n;
        for(int i=0;i<count;i++){
            rem=temp%10;
            sum+=Math.pow(rem,count);
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong ");
        }
    }
}
