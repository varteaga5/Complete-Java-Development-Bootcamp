
public class FindCommonElement {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {7,8,5,6,9};

        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++){
                System.out.println("i j");
                System.out.println(array1[i] + " " + array2[j]);

                if(array1[i] == array2[j]){
                    System.out.println("these two are equal: " + array1[i] + " " + array2[j]);
                    return;
                }
            }

        }
    }
}
