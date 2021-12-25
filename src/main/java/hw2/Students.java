package hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
//    Посчитать средний балл каждого студента на курсе. Дан лист, состоящий из листов.
//    Внутри каждого листа перечислены оценки студентов (может быть разное количество оценок).
//    Посчитать и вывести средний балл для каждого студента.
//    Например: {{5, 5, 4}, {4, 3, 5, 5}, {2, 3, 3, 4, 3}} ⇒ 4,666666 4.25 3

    public static void main(String[] args) {

        List<List<Integer>> list = createListOfStudentsScores();
        printLists(list);
        List<Double> average = getAverageScore(list);
        printList(average);
    }

    public static List<List<Integer>> createListOfStudentsScores() {

        List<List<Integer>> list = new ArrayList<>();
        System.out.println("Enter the number of students:");
        int size;

        Scanner in = new Scanner(System.in);
        size = in.nextInt();

        for(int i = 0; i < size; i++) {
            System.out.println("Enter the number of grades and grades, separated by a space:");
            int currentSize = in.nextInt();
            List<Integer> currentList = new ArrayList<>();
            for(int j = 0; j < currentSize; j++) {
                currentList.add(in.nextInt());
            }
            list.add(currentList);
        }

        in.close();

        return list;
    }

    public static void printLists(List<List<Integer>> lists) {

        for(var list : lists) {
            for(var item : list){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static List<Double> getAverageScore(List<List<Integer>> students) {

        List<Double> averageScore = new ArrayList<>();

        for(List<Integer> student : students) {
            int sum = 0;
            int count = 0;
            for(int index : student) {
                sum += index;
                count++;
            }

            averageScore.add((double)sum / count);
        }

        return averageScore;
    }

    private static void printList(List<Double> list) {

        for(var index : list) {
            System.out.print(index + " ");
            System.out.println();
        }
    }
}
