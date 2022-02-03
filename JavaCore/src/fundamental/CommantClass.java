package fundamental;

/**
 * @Company: {Dream Inc.}
 * @Author: {urunov}
 * @Project: {ClassJava}
 * @Date: {2022/02/01 && 8:03 PM}
 */
public class CommantClass {

    public static void main(String[] args) {

        System.out.println("Hello World");

        int sum = 0;
        int umnajeniya = 1;


        for (int i=1; i<=10; i++) {

            sum +=  i; // Adding sum;
            umnajeniya *=i;
            /***
             * Step-1:
             * sum = 0 + 1 = 1
             * step-2:
             * sum = 1 + 2 = 3
             *
             * */




//            sum +=i; // sum = sum + i;
//            System.out.println(" = " + i);
//            System.out.println("--------------");
//            System.out.println(" => " + sum);


        }
        System.out.println(sum);
        System.out.println(umnajeniya);

    }

}
