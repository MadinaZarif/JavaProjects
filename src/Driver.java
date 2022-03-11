public class Driver {
    public static void main(String[] args) {
        double[] dbArray = {3.2, 6.0, 12.5, 20.0, 4.6};

        for (int i = 0; i < dbArray.length; i++) {
            dbArray[i] /= 2;
        }
        for (int i = dbArray.length - 1; i >= 0; i--) {
            System.out.println(dbArray[i]);
        }
    }
}
