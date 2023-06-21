package task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String>list = new ArrayList<String>(); //     1. Создай список строк.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i =0;i<5;i++){
            list.add(i, reader.readLine()); //2. Программа должна считывать 5 строк с клавиатуры.
        }
        for(int i =0;i<13;i++){
            String last = list.get(4);
            list.remove(list.size()-1);
            list.add(0,last);
        }
        System.out.println(Arrays.toString(list.toArray())); //напишите тут ваш код
    }
}
