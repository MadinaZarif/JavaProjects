public class Class6 {
    public static void main(String[] args) {
        String[] strArray = new String[5];
        String sep = "";

        for(int i = 0; i < strArray.length; i++){
            System.out.println(sep + strArray[i]);
            sep = ", ";
        }
    }
}
