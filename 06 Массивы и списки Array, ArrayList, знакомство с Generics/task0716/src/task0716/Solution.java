package task0716;

import java.util.ArrayList;

/* 
– или Ћ
1. —оздай список слов, заполни его самосто€тельно.
2. ћетод fix должен:
2.1. удал€ть из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

ѕример:
роза
лира
лоза

¬ыходные данные:
лира
лоза
лоза


Requirements:
1. ѕрограмма не должна считывать данные с клавиатуры.
2. ћетод fix должен удал€ть из списка строк все слова, содержащие букву "р". »сключение: слова содержащие и букву "р" и букву "л" - их нужно оставить.
3. ћетод fix должен удваивать слова, содержащие букву "л" (добавл€ть еще один элемент с этим словом). »сключение: слова содержащие и букву "л" и букву "р" - их не нужно удваивать.
4. ћетод fix не должен ничего делать со словами, содержащими и букву "л" и букву "р".
5. ћетод fix не должен ничего делать со словами, которые не содержат ни букву "л", ни букву "р".
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
                 if (((strings.get(i).contains("р")) && !strings.get(i).contains("л"))) {
                    strings.remove(i);
                    i--;
                } else if (((!strings.get(i).contains("р")) && strings.get(i).contains("л"))) {
                    strings.add(strings.get(i));
                    i++;
                }

            }

            return strings;
        }
    }