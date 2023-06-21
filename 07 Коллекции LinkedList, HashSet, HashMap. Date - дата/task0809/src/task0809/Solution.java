package task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
»змерить, сколько времени занимает 10 тыс€ч вставок дл€ каждого списка.
ћетод getInsertTimeInMs должен вернуть врем€ своего исполнени€ в миллисекундах.


Requirements:
1. ѕрограмма должна выводить числа на экран.
2. ћетод main должен вызывать метод getInsertTimeInMs только два раза.
3. ћетод insert10000(List list) должен вставл€ть 10 тыс€ч элементов в список.
4. ћетод getInsertTimeInMs должен вызывать метод insert10000 только один раз.
5. ћетод getInsertTimeInMs должен вернуть врем€ в миллисекундах, которое занимает 10 тыс€ч вставок в список.*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("¬рем€ в миллисекундах равно: " + getInsertTimeInMs(new ArrayList()) + " мс.");
        System.out.println("¬рем€ в миллисекундах равно: " + getInsertTimeInMs(new LinkedList()) + " мс.");
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        long before = System.currentTimeMillis();
        insert10000(list);
        long after = System.currentTimeMillis();
        long time = after - before;
        return time;
        // напишите тут ваш код

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
