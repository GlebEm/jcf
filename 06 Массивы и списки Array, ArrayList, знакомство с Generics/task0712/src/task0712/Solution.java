package task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.*/

public class Solution {

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>(); //1. Объяви переменную типа список строк и сразу проинициализируй ee.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxStringSize = 0;
        String maxString;
        int countForMax = 0;
        int minStringSize;
        String minString;
        int countForMin = 0;
        for (int i = 0; i < 10; i++) {
            list.add(i, reader.readLine()); //2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
            if (list.get(i).length() > maxStringSize) {
                maxStringSize = list.get(i).length();
                countForMax = i;
            }
        }
        minStringSize = list.get(0).length();
        for (int i = 0; i < 10; i++) {
            if (minStringSize > list.get(i).length()) {
                minStringSize = list.get(i).length();
                countForMin++;
            }
        }
//        System.out.println(countForMax);
//        System.out.println(countForMin);
        if (countForMax < countForMin) {
            System.out.println("Самая длинная строка введена раньше, это строка: " + list.get(countForMax));
        } else if (countForMin < countForMax) {
            System.out.println("Самая короткая строка введена раньше, это строка: " + list.get(countForMin));
        } else {
            System.out.println("Длины всех введенных строк одинаковы");
        }

    }
}