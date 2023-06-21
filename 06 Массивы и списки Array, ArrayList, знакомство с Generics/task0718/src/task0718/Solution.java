package task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String>list = new ArrayList<String>(); //1. Объяви переменную типа список строк и сразу проинициализируй ee.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i =0;i<10;i++){
            list.add(i, reader.readLine()); //2. Считай 10 строк с клавиатуры и добавь их в список.
            for(int j =0;j<i;j++){
                if(list.get(i).length()>list.get(j).length()){
                    continue;} //3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
                    if ((list.get(i).length()<list.get(j).length())){
                        System.out.println(i); //4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
                        break;
                    }
                }
            }
        }
        //напишите тут ваш код
    }

