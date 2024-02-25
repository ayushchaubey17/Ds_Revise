public class prefixSum {
    public static void main(String[] args) {
        int arr[] = {1,4,2,-2,3,-8,4,-6,3};
        calSum(arr);

    }


    public static void calSum(int arr []){
        int n = arr.length;
        int [] preArr = new int[n];
int sum =0;
        for (int i = 0; i <n ; i++) {
            sum += arr[i];
            preArr[i]  = sum;

 }

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int start =i;
            for (int j = i; j <n ; j++) {
                int end = j;

                curSum = (start == 0) ? preArr[end] :  preArr[end] -  preArr[start] ;

                if(curSum >maxSum)maxSum = curSum;



            }


        }


        System.out.println(maxSum);




    }

}
