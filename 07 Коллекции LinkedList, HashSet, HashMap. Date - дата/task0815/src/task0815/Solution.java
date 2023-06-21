package task0815;

import com.sun.jdi.Value;

import javax.swing.*;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.security.Key;
import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Requirements:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Олегов", "Иван");
        map.put("Иванов", "Олег");
        map.put("Иванов", "Петр");
        map.put("Олегов", "Петр");
        map.put("Алексашов", "Дмитрий");
        map.put("Перов", "Дмитрий");
        map.put("Непомнящий", "Ян");
        map.put("Третьяков", "Иван");
        map.put("Олегов", "Иван");
        map.put("Потапов", "Иван");//напишите тут ваш код
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countFN = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                countFN++;
            }
        }
        return countFN;//напишите тут ваш код
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countLN = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                countLN++;
            }
        }
        return countLN;

    }

    public static void main(String[] args) {
        System.out.println("Количество людей с заданным именем: " + getCountTheSameFirstName(createMap(), "Иван"));
        System.out.println("Количество людей с заданной фамилией: " + getCountTheSameLastName(createMap(), "Олегов"));
        System.out.println("Размер мапы: "+createMap().size());
    }
}
