package task0805;

import java.util.HashMap;
import java.util.Map;

/* 
���� ��������� Map<String, String> (���������� HashMap), ���� ������� 10 ��������� �����.
������� �� ����� ������ ��������, ������ ������� � ����� ������.


Requirements:
1. ��������� ������ ��������� ���������� ��������� Map � ����� ��������� String, String. ���������� ������ ���� ����� �������������������.
2. ��������� �� ������ ��������� �������� � ����������.
3. ��������� ������ ��������� � ��������� 10 ��������� �����, �������� �������.
4. ����� printValues() ������ �������� �� ����� ������ �������� ���������, ������ ������� � ����� ������.*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        Map<String, String> list = new HashMap<>();//1. ��������� ������ ��������� ���������� ��������� Map � ����� ��������� String, String. ���������� ������ ���� ����� �������������������. �������� ��� ��� ���
        for (Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
