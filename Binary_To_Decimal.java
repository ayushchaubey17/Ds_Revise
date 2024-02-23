

public class Binary_To_Decimal {
    public static void main(String[] args) {
      change(111);
    }
    public static void change(int bn){
        int pow =0;
        int decVal = 0;


        while(bn>0){
            int ld = bn % 10;

            decVal = decVal + (ld* (int)Math.pow(2,pow));

            pow++;
            bn/=10;
        }
        System.out.println(decVal);
    }
}
