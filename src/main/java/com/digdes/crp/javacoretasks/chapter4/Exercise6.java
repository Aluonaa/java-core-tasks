package com.digdes.crp.javacoretasks.chapter4;


public class Exercise6 {
    /** Допустим, что в методе Item.equals(), представленном в разделе 4.2.2,
    используется проверка с помощью операции instanceof. Реализуйте метод
    DiscountedItem.equals() таким образом, чтобы выполнять в нем сравнение
    только с суперклассом, если его параметр otherObject относится к типу Item,
    но с учетом скидки, если его тип DiscountedItem. Продемонстрируйте, что
    этот метод сохраняет симметричность, но не транзитивность, т.е. способность
    обнаруживать сочетание товаров по обычной цене и со скидкой, чтобы делать
    вызовы х.equals(у) и у.equals(z), но не х.equals(z). **/
    public static void main(String[] args) {

        DiscountedItem x = new DiscountedItem("item", 1, 0.1);
        Item y = new Item("item", 1);
        DiscountedItem z = new DiscountedItem("item", 1, 0.3);

        System.out.println("x.equals(y) = " + x.equals(y));
        System.out.println("y.equals(z) = " + y.equals(z));
        System.out.println("x.equals(z) = " + x.equals(z));
    }

}