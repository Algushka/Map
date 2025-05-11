//a)
//        Допустим,каждый раз,когда студент не приходит на лекцию,преподаватель
//        заносит его в список.Таким образом,у вас есть список студентов,т.е.
//        List<Student>,в котором одно и то же имя может встречаться несколько раз.
//        Напишите метод,который сформирует Map<Student,Integer>где ключ-это студент
//        из списка,а значение-сколько раз данный студент встретился в списке
//        b)
//        сформируйте список из 3студентов,которые прогуляли больше всего занятий
import java.util.*;
import java.util.stream.Stream;
public class Main3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(List.of(new Student("John", "Jackson", 18),
                new Student("Nastya", "Roy", 20), new Student("Mike", "Tison", 66),
                new Student("Nastya", "Roy", 20), new Student("John", "Jackson", 18),
                new Student("John", "Jackson", 18), new Student("Maxim", "Fedotkin", 30),
                new Student("Olga", "Naumova", 30), new Student("Olga", "Naumova", 30),
                new Student("Olga", "Naumova", 30), new Student("Olga", "Naumova", 30)));
        System.out.println(listOfStudents(list));
        Map<Student, Integer> map = listOfStudents(list);
        // сформируем set из entries:
        Set<Map.Entry<Student, Integer>> entries = map.entrySet();
        //entries.stream().sorted((p1, p2)->(p1.getValue()-p2.getValue());
        //Идея предложила в автомате такой вариант:вместо предыдущей строки:
        List<Map.Entry<Student, Integer>> list1 = entries.stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).toList();
        //печать всего сортированного листа
        for (Map.Entry<Student, Integer> element : list1) System.out.println(element);
        printListINumbers(list1, 3);
    }
    //формирование map студентов по key: Student, value: количество посещений
    public static Map<Student, Integer> listOfStudents(List<Student> list) {
        Map<Student, Integer> maplist = new HashMap<>();
        for (Student element : list) {
            Integer value = maplist.get(element);
            if (value == null) {
                maplist.put(element, 1);
            } else maplist.put(element, ++value);
        }
        return maplist;
    }
    //печать первых i элементов листа
    public static <T> void printListINumbers(List<T> list, int i) {
        System.out.println(" Printing the first" + i + " Students that have the least number of visiting:");
        for (T element : list) {
            if (i - 1 >= 0) System.out.println(element);
            i--;
        }

    }

}