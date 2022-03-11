public class Driwer {

    public static void main(String[] args) {
        //
        String[] str = new String[10];

        for(int i = str.length-1; i>=0; i--){
            str[i] = "a" + (i-1);

        }
        System.out.println("Value: " + str[2] + str[4]);
    }
}
