import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        int r;float p=3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        r=sc.nextInt();
        System.out.println("Area="+(p*r*r));
        System.out.println("Circumference="+(2*p*r));

    }

}
