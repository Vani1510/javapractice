import java.util.Scanner;

public class majarray {
        static int maj(int arr[]){
        int count;
        for (int i = 0; i < arr.length; i++) {
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>arr.length/2){
                return arr[i];
            }

        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter  elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Majority Element="+maj(arr));
    }
}
