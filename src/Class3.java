public class Class3 {
    public static void main(String[] args) {


        int[] intArray = {1, 2, 3, 4, 5, 6};
        double[] doubArray = {.5, 6.5, 9.0, 23.8, 76.2};

        for (int i = 0; i < intArray.length; i++) {
            doubArray[i] = doubArray[i] * intArray[i];
        }
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i] + ": " + doubArray[i]);
        }
    }
}