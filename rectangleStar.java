public class rectangleStar {
    public static void main(String[] args) {
//            int arr [][] = new int[4][5];
            //rows = 4
         // cols = 5

        for (int r=0;r<4;r++)
        {
            for (int c=0 ;c< 5 ;c++){
                if(r==0 || r==3 || c==0 || c==4){
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

