import java.util.Scanner;

public class oddevevnstatic {
     int oddeve(int num){
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        oddevevnstatic n1=new oddevevnstatic();
        n1.oddeve(num);


    }
}
