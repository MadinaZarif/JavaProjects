public class Class3 {
    public static void main(String[] args) {


        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubArray = {.5, 1, 1.5, 2, 2.5};

        for (int i = 0; i < intArray.length-1; i++) {
            doubArray[i] = doubArray[i] * intArray[i];
        }
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i] + ": " + doubArray[i]);
        }
    }
}