import java.util.Scanner;

public class movingzero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter  elements");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int insertpos=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[insertpos]=nums[i];
                insertpos++;
            }
        }
        while(insertpos<n)
        {
            nums[insertpos]=0;
            insertpos++;
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(nums[i]+" ");

        }
    }
}

