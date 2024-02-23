public class printM {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 20 ; j++) {

                if(j==0 || j==20 || (i==j && i<10) || (j+i)==19 && i<10 ){
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
