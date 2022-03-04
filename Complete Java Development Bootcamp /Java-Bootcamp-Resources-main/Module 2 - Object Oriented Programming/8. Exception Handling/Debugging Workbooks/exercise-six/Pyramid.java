public class Pyramid {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= 1; j--) {
                if (i == j){

                    System.out.print("* ");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}
