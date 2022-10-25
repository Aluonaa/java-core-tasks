package chapter4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Chapter4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /** ТЕКСТ ЗАДАНИЙ **/
//        1. Определите класс Point с конструктором Point(d o u b le х, d o u b le у)
//        и методами доступа g e t X (), g e t Y ( ) . Определите также подкласс L a b e le d P o in t
//        с конструктором L a b e l e d P o i n t ( S t r i n g l a b e l , d o u b le x , d o u b le y) pi методом
//        доступа g e t L a b e l ().

//        2. Определите методы t o S t r i n g ( ), e q u a ls () и h a sh C o d e ()
//        для классов из предыдущего упражнения.

//        3. Объявите как protected переменные экземпляра х и у из класса P o i n t в
//        упражнении 1. Продемонстрируйте, что эти переменные доступны классу
//        LabeledPoint только в его экземплярах.

//        4. Определите абстрактный класс Sh a p e с переменной экземпляра класса P o in t ;
//        конструктором и конкретным методом p u b l i c v o i d moveBy (d o u b le d x, d o u b le
//        d y ), перемещающим точку на заданное расстояние;
//        а также абстрактным классом p u b l i c P o in t g e t C e n t e r ().
//        Предоставьте конкретные подклассы C i r c l e ,
//        R e c t a n g le , L i n e с конструкторами p u b l i c C i r c l e ( P o i n t c e n t e r , d o u b le
//                r a d i u s ) ,
//        p u b l i c R e c t a n g l e ( P o in t t o p L e f t , d o u b le w id t h , d o u b le h e i g h t ) и
//        p u b l i c L in e ( P o in t from , P o in t t o ).

//        5. Определите методы c lo n e () в классах из предыдущего упражнения.

//        6. Допустим, что в методе I tern, e q u a l s (), представленном в разделе 4.2.2,
//        используется проверка с помощью операции i n s t a n c e o f . Реализуйте метод
//        D is c o u n t e d lt e m . e q u a ls () таким образом, чтобы выполнять в нем сравнение
//        только с суперклассом, если его параметр o t h e r O b j e c t относится к типу Item ,
//        но с учетом скидки, если эго тип D is c o u n t e d lt e m . Продемонстрируйте, что
//        этот метод сохраняет симметричность, но не транзитивность, т.е. способность
//        обнаруживать сочетание товаров по обычной цене и со скидкой, чтобы делать
//        вызовы х. e q u a ls (у) и у . e q u a ls (z ), но не х . e q u a ls ( z ) .

//        7. Определите перечислимый тип для восьми комбинаций основных цветов —
//        BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, W H ITE — с методами g e t R e d ( ) ,
//                g e t G r e e n ( ) n g e t B l u e ( ) .

//        8. В классе C l a s s имеются шесть методов, возвращающих строковое представление типа,
//        описываемого объектом типа C la s s . Чем отличается их применение
//        к массивам, обобщенным типам, внутренним классам и примитивным типам?

//        9. Напишите "универсальный" метод t o S t r i n g (), в котором применяется
//        рефлексия для получения символьной строки со всеми переменными экземпляра
//        объекта. В качестве дополнительного задания можете организовать обработку
//        циклических ссылок.

//        10. Воспользуйтесь примером кода из раздела 4.5.1 для перечисления всех
//        методов из класса типа i n t [ ] . В качестве дополнительного задания можете выявить
//        один метод, обсуждавшийся в этой главе, как неверно описанный.

//        11. Напишите программу, выводящую сообщение " H e l l o , W o r ld ", воспользовавшись
//        рефлексией для поиска поля o u t в классе j a v a . l a n g . S y s t e m и методом
//        in v o k e ( ) для вызова метода p r i n t l n ().

//        12. Определите отличие в производительности обычного вызова метода от его вызова через рефлексию.

//        13. Напишите метод, выводящий таблицу значений из любого объекта типа M et
//        hod, описывающего метод с параметром типа d o u b le или D o u b le .
//        Помимо объекта типа M e th o d , этот метод должен принимать нижний и верхний предел,
//        а также величину шага. Продемонстрируйте свой метод, выведя таблицы для
//        методов M a t h . s q r t ( ) и D o u b l e . t o H e x S t r i n g ( ). Напишите еще один вариант
//        данного метода, но на этот раз воспользуйтесь объектом типа D o u b le F u n c t io n
//        < 0 b j e c t > вместо объекта типа M e th o d (см. раздел 3.6.2).
//        Сопоставьте безопасность, эффективность и удобство обоих вариантов данного метода.


        //Выбор задания главы 4
        System.out.println("Введите номер задания (в данный момент выполнены: (1,2 и 3) - вызываются вместе как 1, (4 и 5) " +
                "- вызываются вместе как 4, отдельно 7, 8):");
        int numberOfExercise = scanner.nextInt();

        switch (numberOfExercise) {

            case (1):
                Point point = new Point(3, 8);
                Point point1 = new Point(3, 8);
                Point point2 = new Point(12, 9);
                System.out.println(point.getX());
                System.out.println(point.getY());
                System.out.println(point.equals(point1));
                System.out.println(point.equals(point2));

                LabeledPoint labeledPoint = new LabeledPoint( 0, 0, " Начало");
                labeledPoint.getX();
                labeledPoint.getY();

                break;

            case (4):
                Point pointForShapes = new Point(1, 1);

                Point from = new Point(0, 0);
                Point to = new Point(0, 15);

                Circle circle = new Circle(pointForShapes, 8);
                Circle cloneCircle = circle.clone();

                Line line = new Line(from, to);
                Line cloneLine = line.clone();

                Rectangle rectangle = new Rectangle(pointForShapes, 10, 10);
                Rectangle cloneRectangle = rectangle.clone();

                System.out.println(cloneCircle);
                System.out.println(cloneLine);
                System.out.println(cloneRectangle);



                break;

            case (7):
                Colors colors = Colors.RED;
                System.out.println(colors.getBlue());
                System.out.println(colors.getGreen());
                System.out.println(colors.getRed());

                break;

            case (8):
                System.out.println(void.class.getName());
                System.out.println(int.class.getName());
                System.out.println(double.class.getName());
                System.out.println(double[].class.getName());
                System.out.println(byte[].class.getName());
                System.out.println(boolean[].class.getName());
                System.out.println(String.class.getName());
                System.out.println(Object[].class.getName());
                System.out.println(int[][][][][][][].class.getName());
                System.out.println(Set.class.getName());
                System.out.println(Set.class);
                System.out.println(HashSet.class.getName());
                System.out.println(Rectangle.class.getName());
        }
    }
}
