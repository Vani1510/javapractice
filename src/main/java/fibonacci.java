public class fibonacci {
    public static void main(String[] args) {
        int a=0;int b=1;
        int temp;
        for (int i = 1; i <=10 ; i++) {
            temp=a+b;
            System.out.print(a+" ");
            a=b;
            b=temp;
        }
    }
}
