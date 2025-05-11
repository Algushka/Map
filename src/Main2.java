//Дана Map<String:String> - получить список строк вида “параметр:значение”
//
//Например:
//Map:{
//        “jack” = ”qwer13”
//        “john” = ”zxc45”
//        }
//Список :
//        “jack:qwer13”, “john:zxc45”


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>(Map.of("John", 20, "Bob", 15, "Kate", 60));
        System.out.println(map);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        printMapSet(set);
    }
    public static void printMapSet(Set<Map.Entry<String, Integer>> set) {
       int sizeCurrent=0;
        for (Map.Entry<String,Integer> element: set) {
            sizeCurrent++;
            System.out.printf(" \"%s : %s\"", element.getKey(), element.getValue());
            //System.out.println("размер сета"+ set.size());
            if (sizeCurrent<set.size()) System.out.print(",");
//в конце запятую не ставим
        }

    }
}
