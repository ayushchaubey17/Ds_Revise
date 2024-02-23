public class factorial {



    public static void main(String[] args) {
        calculateFactorial(5);
    }


    public static  void  calculateFactorial(int n)
    {
        if(n== 0 || n ==1){
            System.out.println(1);
            return;
        } else if (n<0) {
            System.out.println("not exist");
            return;
        }

        int fact = 1;
        while(n!=1)
        {
            fact *= n--;

        }

        System.out.println(fact);

    }
}
