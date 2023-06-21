package task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/

public class Solution {
    public static Map<String, String> createMap() { //3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
        Map<String, String> map = new HashMap<>();
        map.put("Олегов", "Иван");
        map.put("Токарев", "Олег");
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Алексашов", "Дмитрий");
        map.put("Перов", "Дмитрий");
        map.put("Непомнящий", "Ян");
        map.put("Третьяков", "Иван");
        map.put("Дворецков", "Иван");
        map.put("Потапов", "Иван");
        return map;//напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> name = new HashMap<String, String>(map);
        for (Map.Entry pair : name.entrySet()) {
            int count = 0;
            String a = (String) pair.getValue();

            for(Map.Entry pair2: name.entrySet()){
                if(pair2.getValue().equals(a))
               count++;
            }

            if (count>1){
                for(int i =0;i<count;i++)
                    removeItemFromMapByValue(map, String.valueOf(a));
            }
        }
//        for(Map.Entry<String,String> entry: map.entrySet()){   //Проверка работоспособности
//            System.out.println(entry.getKey()+" - "+entry.getValue());
//        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
