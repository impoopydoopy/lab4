import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Какой класс хотите обработать?\n\t1. Triangle\n\t2. Circle\n\t3. Student\n\t4. Book");

        while (true)
        {
            switch (in.nextInt())
            {
                case 1:
                    System.out.println("Введите высоту, а затем основание треугольника: ");
                    RightTriangle triangle = new RightTriangle(in.nextDouble(), in.nextDouble());

                    System.out.println("Был создан треугольник с параметрами - высота: " + triangle.getHeight() + " основание: " + triangle.getBase());
                    System.out.println("Гипотенуза: " + triangle.getHypotenuse());
                    System.out.println("Площадь: " + triangle.getArea());
                    System.out.println("Периметр: " + triangle.getPerimeter());
                    break;
                case 2:
                    Circle circle;
                    System.out.println("Вы хотите создать: \n\t1) нулевую окружность \n\t2) окружность ");
                    int code = in.nextInt();
                    if(code == 1)
                    {
                        System.out.println("Введите координату центра по Х, а затем по У: ");
                        circle = new Circle(in.nextDouble(), in.nextDouble());
                    }
                    else if (code == 2)
                    {
                        System.out.println("Введите координату центра по Х, по У, а затем радиус: ");
                        circle = new Circle(in.nextDouble(), in.nextDouble(), in.nextDouble());
                    }
                    else{
                        System.out.println("try again");
                        break;
                    }

                    System.out.println("Балы создана окружность с параметрами - Х: " + circle.getxTransform() + " Y: " + circle.getyTransform() + " radius: " + circle.getRadius());
                    System.out.println("Площадь: " + circle.getArea());
                    System.out.println("Длинна окружности : " + circle.getLength());

                    break;
                case 3:
                    Student student = new Student("Elfman ", "Danny", "AD-211", 2, 89.5);
                    System.out.println(student.getSurname() + student.getName() + " Group: " + student.getGroup() + " Course: " + student.getCourse() + " Grants: " + student.getGrants());
                    student.upgradeCourse();
                    student.setAverageMark(90.0);
                    System.out.println(student.getSurname() + student.getName() + " Group: " + student.getGroup() + " Course: " + student.getCourse() + " Grants: " + student.getGrants());
                    break;
                case 4:
                    Book book = new Book("Пикник на обочине", "Братья Стругацкие", 1972, 2, 200);
                    System.out.println("Книга: " + book.getName() + " Количество: " + book.getQuantity() + " Цена за шт: " + book.getPrice() + "Цена за все экзамепялры: " + book.getSum());
                    book.setQuantity(50);
                    book.setPriceToQuantity(200);
                    System.out.println("Книга: " + book.getName() + " Количество: " + book.getQuantity() + " Цена за шт: " + book.getPrice() + "Цена за все экзамепялры: " + book.getSum());
                    break;
                default:
                    System.out.println("try again");
            }
        }


    }
}