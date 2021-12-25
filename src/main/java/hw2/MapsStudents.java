package hw2;

import java.util.HashMap;
import java.util.Map;

public class MapsStudents {
//    Дана карта студентов (Фамилия ⇒ средний балл). Вывести на экран фамилию студента с наивысшим средним баллом.
//    Если таких несколько, то вывести встречающегося в карте первым

    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("Ivanov A", 4.6);
        map.put("Petrov I", 3.8);
        map.put("Sidorov M", 4.6);

        maxScoreStudent(map);
    }

    public static void maxScoreStudent(Map<String, Double> map) {

        double maxScore = 0;

        for(Double value : map.values()) {
            if(value > maxScore) {
                maxScore = value;
            }
        }

        for(Map.Entry entry : map.entrySet()) {
            if(entry.getValue().equals(maxScore)) {
                System.out.print(entry.getKey());
                break;
            }
        }
    }
}
