import java.util.Scanner;

public class HomeWork_2_task_1_13 {
    public static void main(String[] args) {
        /*  start   HomeWork    29 сентября 2022 года.                                                  */

        /* #2 task 1.13
                        (Алгебра: решите 2 * 2 линейных уравнения) Вы можете использовать правило Крамера для решения
                        следующей системы линейных уравнений 2 * 2 при условии, что ad – bc не равно 0:
                        cx + dy = f ;   ax + by = e ;   x = ed - bf / ad - bc  ;   y = af - ec / ad - bc

                        Напишите программу, которая решает следующее уравнение и отображает значение для x и y:
                        (Подсказка: замените символы в формуле числами для вычисления x и y).
                        3.4x + 50.2y = 44.5
                        2.1x + .55y = 5.9
                                                                                                        */
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        System.out.println("x = "+x+" y = "+y);

        /*  end     HomeWork    29 сентября 2022 года.                                                  */
    }
}
