import java.util.Scanner;

public class studentgrade {
        public static void main(String[] args){
            int mark1,mark2,mark3,mark4,mark5;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 5 marks");
            mark1=sc.nextInt();
            mark2=sc.nextInt();
            mark3=sc.nextInt();
            mark4=sc.nextInt();
            mark5=sc.nextInt();
            int total=(mark1+mark2+mark3+mark4+mark5);
            double avg=total/5.0;
            System.out.println("Total="+total);
            System.out.println("Average Marks="+avg);
            if(mark1<40 || mark2<40||mark3<40||mark4<40||mark5<40){
                System.out.println("Fail");
            }
            else if (avg>=90.0) {
                System.out.println("A");
            }
            else if(avg>=80){
                System.out.println("B");
            }
            else if (avg>=70) {
                System.out.println("C");
            }
            else if (avg>=60) {
                System.out.println("D");
            }
            else if (avg>=50) {
                System.out.println("E");
            }
            else{
                System.out.println("F");
            }
        }
}
