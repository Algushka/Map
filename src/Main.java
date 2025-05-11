//Напишите метод, который принимает map<String,Integer>, и две строки key1 и key2
//        Если в map есть заданные ключи key1 и key2, то метод должен сформировать
//        в map новый ключ из строке (key1+”-”+key2) и положить туда сумму значений.
//        Если какого-то из ключей нет, map остается без изменения.
//        Примечание: Метод void, т.е. он не возвращает новый map а изменяет переданный
//        в параметрах.
//
//        Пример:
//        Map:{
//        “jack”,10
//        “john”,5
//        }
//        Вызываем метод с ключами “jack” и “john”, получаем:
//        Map:{
//        “jack”,10
//        “john”,5
//        “jack_john”:15

//https://github.com/Algushka/Map.git


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

       Map<String,Integer> map = new HashMap<>();
       map.put("Jack", 20);
       map.put("Bob", 16);
       map.put("Steve", 3);
       map.put("Pete", 15);
       map.put("Jackson", 25);
       map.put("Max", 5);
       map.put("Jim", 31);
        System.out.println(map);

        System.out.println("If there is Bob"+map.containsKey("Bob"));
        changeMapAddSumOfNames(map, "Bob", "Max");
        //System.out.println(map);
    }
    public static void changeMapAddSumOfNames(Map <String, Integer> map, String key1, String key2) {
        System.out.println(map.containsKey(key1));
        System.out.println(map.containsKey(key2));
        if (map.containsKey(key1) && map.containsKey(key2)) {

        Integer value1 = map.get(key1);
            System.out.println("Сколько лет Bob"+ value1);
        Integer value2 = map.get (key2);
            System.out.println("Сколько лет Max" + value2);
        map.put(key1+"_" +key2, value1+value2);
        }
        System.out.println(map);

    }
}