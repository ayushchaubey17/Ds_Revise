public class zero_One_Triangle {
    public static void main(String[] args) {
        for (int i = 1; i < 12; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(((i+j)%2==0)? " 1 " : " 0 ");

            }
            System.out.println();

        }

    }

}
