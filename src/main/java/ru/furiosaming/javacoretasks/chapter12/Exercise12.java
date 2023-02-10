package main.java.ru.furiosaming.javacoretasks.chapter12;

import java.time.*;

public class Exercise12 {
    /** Напишите программу, разрешающую затруднение, описанное в начале раздела 12.5.
    Проанализируйте ряд назначенных мероприятий в разных часовых
    поясах и предупредите пользователя о тех из них, которые должны состояться
    в течение следующего часа по местному времени.

    Ситуация: При переходе на летнее время стрелки часов переводятся на один час вперед. Что
    же произойдет, если рассчитать время, приходящееся на пропущенный час?
    Например, в 2013 году переход на летнее время в Центральной Европе произошел 31 марта
    в 2:00. Если попытаться рассчитать время в несуществующий момент 2:30 31 марта
    2013 года, то на самом деле будет получено время 3:30:

     ZonedDateTime ambiguous = ZonedDateTime.of(
     LocalDate.of(2013, 10, 27), // Переход на зимнее время
     LocalTime.of(2, 30),
     Zoneld.of("Europe/Berlin"));
     // 2013-10-27T02:30+02:00[Europe/Berlin]
     ZonedDateTime anHourLater = ambiguous.plusHours(1);
     // 2013-10-27T02:30+01:00[Europe/Berlin]

     Час спустя время будет показывать те же самые часы и минуты, но часовой пояс
     уже будет смещен. Следует также уделить внимание коррекции даты при пересечении
     границ перехода на летнее и зимнее время. Так, если требуется назначить
     совещание на следующей неделе, то не нужно вводить промежуток в семь дней, как в
     следующем примере кода:
     ZonedDateTime nextMeeting = meeting.plus(Duration.ofDays(7));
     // Внимание! Этот код неверен при переходе на летнее время
     **/

    public static void main(String[] args) {
        /** 1 **/
        /** В таком случае необходимо уведомлять пользователя о переводе времени **/
        ZonedDateTime ambiguous = ZonedDateTime.of(
                LocalDate.of(2013, 10, 27), // Переход на зимнее время
                LocalTime.of(2, 30),
                ZoneId.of("Europe/Berlin"));
        // 2013-10-27T02:30+02:00[Europe/Berlin]
        ZonedDateTime anHourLater = ambiguous.plusHours(1);
        System.out.println(anHourLater + " Время переведено на летнее");
        // 2013-10-27T02:30+01:00[Europe/Berlin]



        /** 2 **/
        ZonedDateTime meeting = ZonedDateTime.of(
                LocalDate.of(2013, 10, 27), // Переход на зимнее время
                LocalTime.of(2, 30),
                ZoneId.of("Europe/Berlin"));
        ZonedDateTime nextMeeting1 = meeting.plus(Duration.ofDays(7));
        // Внимание! Этот код неверен при переходе на летнее время

        // Вместо него можно использовать класс Period:
        ZonedDateTime nextMeeting2 = meeting.plus(Period.ofDays(7));

        System.out.println();
        System.out.println(nextMeeting1);
        System.out.println(nextMeeting2);


    }


}
