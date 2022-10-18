public class HomeWork_2_task_1_12 {
    public static void main(String[] args) {
        /*  start   HomeWork    29 сентября 2022 года.                                                  */

        /* #2 task 1.12
                        (Средняя скорость в километрах) Предположим, что бегун пробегает 24 мили за 1 час, 40
                        минут и 35 секунд. Напишите программу, которая отображает среднюю скорость в
                        километрах в час. (Примечание: 1 миля равна 1,6 километрам).
                                                                                                        */

        double miles = 24;                                                                      //38.4 км
        double kilometers = miles * 1.6;                                                        //1миля = 1.6км
        double rate = (6035) / (60.0 * 60.0);                                                   //100 минут и 35 секунд.
        double kilometersPerHour = kilometers / rate;
        System.out.println("Средняя скорость в километрах в час составляет = " + (kilometersPerHour));
        /*  end     HomeWork    29 сентября 2022 года.                                                  */
    }
}
