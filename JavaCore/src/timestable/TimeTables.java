package timestable;

/**
 * @Company: {The Dream Inc.}
 * @Author: {urunov}
 * @Project: {ClassJava}
 * @Date: {2022/02/01 && 8:53 PM}
 */
public class TimeTables {
    public static void main(String[] args) {
        System.out.println("Таблица умножения");
        System.out.println("Ученики и ученицы!\n" +
                "Чтоб было проще вам считать,\n" +
                "Мы Пифагорову таблицу\n" +
                "В стихах решили написать.\n");

        for (int i = 2; i <= 10; i++){
            for (int j = 2; j <= 10; j++){
                int number = j * i;

                System.out.print(j + " * " + i + " = " + number + "\t");
            }
            System.out.println();
        }}}
    //
    /**
     *  2 x 1 = 2
     *  2 x 2 = 4
     *
     *
     *  //--------
     *  3 x 2 = 6
     *
     *
     *  ---
     *  9 x 1 = 9
     * */

