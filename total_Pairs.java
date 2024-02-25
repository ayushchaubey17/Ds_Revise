public class total_Pairs {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        calPairs(arr);
    }
    public static  void  calPairs(int [] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.print("[");
            for (int j = i+1; j < arr.length  ; j++) {

                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println("]");
        }
    }
}

