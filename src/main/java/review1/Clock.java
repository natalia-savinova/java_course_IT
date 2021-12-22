package review1;

public class Clock {
//    Есть часы. Они показывают только время (без даты) в формате часы:минуты:секунды.
//    Написать функцию, которая принимает 4 числа:
//      - текущее количество часов
//      - текущее количество минут
//      - текущее количество секунд
//      - интервал в секундах;
//    и возвращает в текстовом формате время, которое будет отображаться на часах по прошествии
//    указанного кол-ва секунд от текущего времени

    public static void currentTime(int hour, int min, int sec, int interval) {

        int allSec = hour * 3600 + min * 60 + sec + interval;
        int newHour = allSec / 3600 % 24;
        int newMin = allSec / 60 % 60;
        int newSec = allSec % 60;

        System.out.println(newHour + ":" + newMin + ":" + newSec);

//        Вариант через Локал тайм
//        LocalTime.of(hour, minute, second)
//                .plusSeconds(interval)
//                .toString();

    }
}
