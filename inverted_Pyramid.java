public class inverted_Pyramid {
    public static void main(String[] args) {


        for (int r = 1; r <= 10 ; r++) {
            for (int c = 1; c <= 10 ; c++) {
                if (r+c>=11){
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
