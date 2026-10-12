import java.util.Scanner;

public class dupstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int uniqueIndex = 0;
        for (int i = 0; i < c.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (c[i] == c[j]) {
                    break;
                }
            }
            if (j == i) {
                c[uniqueIndex++] = c[i];
            }
        }
        System.out.println("Result: " + new String(c, 0, uniqueIndex));
    }
}
