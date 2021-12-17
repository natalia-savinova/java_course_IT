public class Time {
//    Написать функцию, внутрь которой передается 3 переменных текущего времени (часы, минуты, секунды)
//    и имя пользователя. В результате вызова этой функции на экран выводится:
//    Если время от 5 до 12 -> "Доброе утро, {username}"
//    Если время от 12 до 16 -> "Добрый день, {username}"
//    Если время от 16 до 23 -> "Добрый вечер, {username}"
//    Если время от 23 до 5 -> "Доброй ночи, {username}"

    public static void timeIs(int hour, int minute, int sec, String username) {

        if(hour >= 5 && hour < 12) {
            System.out.println("Доброе утро, " + username);
        }

        if(hour >= 12 && hour < 16) {
            System.out.println("Добрый день, " + username);
        }

        if(hour >= 16 && hour < 23) {
            System.out.println("Добрый вечер, " + username);
        }

        if(hour >= 23 || hour < 5) {
            System.out.println("Доброй ночи, " + username);
        }
    }
}
