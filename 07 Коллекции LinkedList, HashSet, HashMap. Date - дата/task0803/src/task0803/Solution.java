package task0803;

import java.util.HashMap;
import java.util.Map;

/* 
���� ����� Cat � ����� ��� (name, String).
������� ��������� Map<String, Cat> (���������� HashMap).
�������� � ��������� 10 �����, � �������� ����� ������������ ��� ����.
������� ��������� �� �����, ������ ������� � ����� ������.


Requirements:
1. ��������� �� ������ ��������� �������� � ����������.
2. � ������ addCatsToMap() ������ ���������� ��������� Map � ����� ��������� String, Cat � ����� ���������������� ee.
3. ����� addCatsToMap() ������ ��������� � ��������� ���� ����� �� ������� String[] cats, �������� �������.
4. ��������� ������ �������� ���������� ��������� �� �����, ������ ���� ����� ����� � � ����� ������.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"������", "�����", "�����", "�����", "�����", "������", "����", "�����", "����", "�����"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> map = new HashMap<>();
        for (int i =0;i<cats.length;i++){
            map.put(cats[i],new Cat(cats[i])); //3. ����� addCatsToMap() ������ ��������� � ��������� ���� ����� �� ������� String[] cats, �������� �������.
        }
        return map;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
