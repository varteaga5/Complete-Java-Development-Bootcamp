public class RuntimeException1 {
    public static void main(String[] args) {
        int[] array = new int[3];
      
        // DO NOT DO THIS
        // FIX THE CODE INSTEAD
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());

        }

    }
}
