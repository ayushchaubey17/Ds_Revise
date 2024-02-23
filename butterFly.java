public class butterFly {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <=20 ; j++) {
                if(j==1 || j==20 || ((j<=i || (20-j)<=i ) && i<11) ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }
}
