import java.util.Scanner;

public class rangeprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        while (start <= end) {
            for (int i = 2; i < start / 2; i++) {
                count=0;
                if (start % i == 0) {
                    count++;
                    break;
                }
            }
            if (start > 1 && count == 0) {
                System.out.print(start+" ");
            }
            start++;
        }

    }
}

