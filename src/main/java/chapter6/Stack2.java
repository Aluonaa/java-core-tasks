package chapter6;
//Еще раз реализуйте обобщенный класс Stack<E>, используя массив для хранения элементов.
//Если требуется, нарастите массив в методе push (). Предоставьте два решения этой задачи:
//одно — с массивом типа Е [ ], другое — с массивом типа Object [ ]. Оба решения должны
//компилироваться без всяких предупреждений. Какое из них вы предпочтете сами и почему?

/** 6.2 **/

public class Stack2 <E> {
    E[] mass;
// ЕЩЕ В ПРОЦЕССЕ РАБОТЫ
    public Stack2(E[] mass){
        this.mass = mass;
    }

    public E[] getMass() {
        return mass;
    }

    public void setMass(E[] mass) {
        this.mass = mass;
    }

//    public void push(E element){
//        mass[mass.length] = element;
//    }
//
//    public void push(Object element){
//
//    }
}
