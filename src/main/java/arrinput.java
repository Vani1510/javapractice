import java.util.Scanner;

public class arrinput {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter  elements");
    int odd=0,even=0;
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int a:arr){
       if(a%2==0){
           even++;
       }
       else{
           odd++;
       }
    }
        System.out.println("Even="+even);
        System.out.println("Odd="+odd);
    }
}
