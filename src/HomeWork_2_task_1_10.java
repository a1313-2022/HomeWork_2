public class HomeWork_2_task_1_10 {
    public static void main(String[] args) {
        /*  start   HomeWork    29 сентября 2022 года.                                                  */

        /* #2 task 1.10
                        (Средняя скорость в милях) Предположим, что бегун пробегает 14 километров за 45 минут
                        и 30 секунд. Напишите программу, которая отображает среднюю скорость в милях в час.
                        (Примечание: 1 миля равна 1,6 километрам.)
                                                                                                        */
        double kilometers = 14;
        double miles = kilometers / 1.6;
        double seconds = 2730;                  // 45 минут и 30 секунд.
        double rate = (seconds) / (60.0 * 60.0);
        double milesPerHour = miles / rate;
        System.out.println("Средняя скорость в милях в час составляет = " + (milesPerHour));
        /*  end     HomeWork    29 сентября 2022 года.                                                  */
    }
}
