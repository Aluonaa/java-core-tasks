package main.java.ru.furiosaming.javacoretasks.chapter2;

public class Exercise9 {
           /** 9. Реализуйте класс Саr, моделирующий передвижение автомобиля на бензиновом
            топливе по оси х. Предоставьте методы для передвижения автомобиля на
            заданное количество километров, заполнения топливного бака заданным количеством
            литров бензина, вычисления расстояния, пройденного от начала
            координат, а также уровня топлива в баке. Укажите расход топлива (в км/л)
            в качестве параметра конструктора данного класса.

            Должен ли этот класс быть неизменяемым и почему?

            Решение: если объявить класс как final, от него нельзя будет наследоваться,
            что в данном случае помешает воспользоваться принципами ООП, такими как наследование и
            полиморфизм. При создании класса Car создается абстракция и позже с помощью наследования
            можно будет создавать конкретные виды машин.
            Также иммутабельность класса подразумевает под собой исключение
            возможности изменения состояния после инстанцирования, в классе не должно быть сеттеров. И в таком случае
            мы не сможем изменять состояние машины, например количество бензина в бензобаке, а это уже противоречит
            идее класса. **/

    public static void main(String[] args){
        Car car = new Car(20);
        car.refueling(100);
        System.out.println(car.getFuelTank());
        car.ride(600);
        System.out.println(car.getDistance());
        System.out.println(car);
    }
}
