public class arrdup {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8};
        int count=0;
        int sumn=(arr[arr.length-1]*(arr[arr.length-1]+1))/2;
        for (int i = 0; i < arr.length; i++) {
            count+=arr[i];
            }
        System.out.print("Missing="+(sumn-count));
    }
}

