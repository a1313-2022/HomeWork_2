import java.util.Scanner;

public class HomeWork_2_task_1_9 {
    public static void main(String[] args) {
        /*  start   HomeWork    29 сентября 2022 года.                                              */

        /* #2 task 1.9
                        (Площадь и периметр прямоугольника) Напишите программу, которая отображает площадь и периметр
                        прямоугольника шириной 4,5 и высотой 7,9, используя следующую формулу:
                        area = width * height                                                       */
        Scanner input = new Scanner(System.in);

        System.out.println("Введите ширину: ");
        double width = input.nextDouble();

        System.out.println("Введите высоту: ");
        double height = input.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Площадь прямоугольника = " +area+ "\n"+
                           "Периметр прямоугольника = " +perimeter);

        /*  end     HomeWork    29 сентября 2022 года.                                              */
    }
}