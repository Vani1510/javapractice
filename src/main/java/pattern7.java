public class pattern7 {
    public static void main(String[] args) {
        int ch=1;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
