public class maximumSubArraySum {
    public static void main(String[] args) {

        int arr[] = {2,4,5,6,7,3,10};
        calMaxSubArray(arr);
    }

    public static void calMaxSubArray(int arr[]){

        int MaxSum = Integer.MIN_VALUE;

        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i; j < n; j++) {
                int curSum =0;
                for (int k = i; k <=j ; k++) {

                    curSum += arr[k];
                    System.out.print(arr[k]+" ");

                }
                System.out.println("----> cuurent sum is "+curSum);

                if(curSum> MaxSum){
                    MaxSum = curSum;
                }
            }

        }

        System.out.println(MaxSum);


    }


}
