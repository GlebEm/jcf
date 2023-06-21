package task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(); //1. Объяви переменную типа список строк и сразу проинициализируй ee.
        System.out.println("Считываем число строк N");
        int N = Integer.parseInt(reader.readLine());
        System.out.println("Считываем число переставляемых первых строк M");
        int M = Integer.parseInt(reader.readLine());
        System.out.println("Вводим строки, каждую с новой строки");
        for (int i = 0; i < N; i++) {
            list.add(i, reader.readLine());
        }
        for (int i = 0; i < M; i++) {
            String first = list.get(0);
            list.remove(0);
            list.add(first); //3. Переставить M первых строк в конец списка.

        }
        System.out.println("Результат");
        for (int i = 0; i < list.size(); i++) { //4. Выведи список на экран, каждое значение с новой строки.*/
            System.out.println(list.get(i));
        }
    }
}
