import java.util.Scanner;

public class vehicle {
    public static void main(String[] args) {
        int v, w;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of vehicles and number of wheels");
        v = sc.nextInt();
        w = sc.nextInt();
        int fourw=(w/2)-v;
        int twow=v-fourw;
        if(w<2|| (w%2!=0)|| v>w){
            System.out.println("Invalid");
            return;
        }
        System.out.println("Two Wheeler " + twow);
        System.out.println("Four Wheeler " + fourw);
    }
}
