package task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудь учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Requirements:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Calendar parseDate = new GregorianCalendar();
        parseDate.setTime(formatter.parse(date));
        int days = parseDate.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);
        if (days%2!=0){
        return true;}
        return false;
    }
}
