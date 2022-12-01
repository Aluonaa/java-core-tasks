package com.digdes.crp.javacoretasks.chapter6;

public class Exercise23 {
    /** Во врезке "Внимание!" из раздела 6.6.7 упоминается вспомогательный метод throwAs(),
    применяемый для "приведения" типа исключения ех к типу
    RuntimeException и его генерирования. Почему для этой цели нельзя воспользоваться
    обычным приведением типов, т.е. throw(RuntimeException) ex

    public class Exceptions {
    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwAs(Throwable e) throws T {
    throw (T) e; // Приведение обобщенного типа
    // стирается в тип (Throwable) е
    }

    Решение:
    для этой цели можно воспользоваться обычным приведением типов
    **/

    private static <T extends Throwable>
    void throwAs(Throwable e) throws T {
        throw (RuntimeException) e;
    }
}
