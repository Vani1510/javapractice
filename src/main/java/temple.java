import java.util.Scanner;

public class temple {
        public static void main(String[] args) {
            int age;char gender;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter age and gender(m/f)");
            age= sc.nextInt();
            gender=sc.next().charAt(0);
            if(age>=18 && ((gender=='m')||(gender=='M'))){
                System.out.println("Eligible to go to temple");
            }
            else{
                System.out.println("Not Eligible to go");
            }
        }
    }