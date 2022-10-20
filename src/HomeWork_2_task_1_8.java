import java.util.Scanner;

public class HomeWork_2_task_1_8 {
    public static void main(String[] args) {
        /*  start   HomeWork    29 сентября 2022 года.                                                  */

        /* task 1.8
                    (Площадь и периметр круга) Напишите программу, которая отображает площадь и периметр круга с
                    радиусом 5,5, используя следующие формулы:
                        perimeter = 2 * radius * pi
                        area = radius * radius * pi                                                     */

        Scanner input = new Scanner(System.in);

        System.out.println("Введите радиус: ");
        double radius = input.nextDouble();

        final double PI = 3.1415;

        double area = radius * radius * PI;
        double perimeter = 2 * radius * PI;

        // вывод результата
        System.out.println("Радиус круга составляет: " +radius+ "\n"+
                           "Площадь круга равна: " +area+ "\n"+
                           "Периметр равен: " +perimeter);
        /*  end     HomeWork    29 сентября 2022 года.                                                  */
    }
}

