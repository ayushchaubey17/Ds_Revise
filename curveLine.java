public class curveLine {
    public static void main(String[] args) {
        curveLine(12);
    }
    public static void  curveLine(int a){

        for (int i = 0; i <= a ; i++) {
            for (int j=0;j<=a ;j++){
                System.out.print((j==(i+1) )? "*" : " ");

            }
            System.out.println();

        }

    }
}
