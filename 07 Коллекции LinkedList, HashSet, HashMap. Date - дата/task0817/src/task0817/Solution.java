package task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
��� ������� �� �����
������� ������� (Map<String, String>) ������� � ���� ������ ������� �� �������� "�������" - "���".
������� �����, ������� ���������� �����.


Requirements:
1. ��������� �� ������ �������� ����� �� �����.
2. ��������� �� ������ ��������� �������� � ����������.
3. ����� createMap() ������ ��������� � ���������� ������� Map � ����� ��������� String, String ��������� �� 10 �������.
4. ����� removeTheFirstNameDuplicates() ������ ������� �� ������� ���� �����, ������� ���������� �����.
5. ����� removeTheFirstNameDuplicates() ������ �������� ����� removeItemFromMapByValue().*/

public class Solution {
    public static Map<String, String> createMap() { //3. ����� createMap() ������ ��������� � ���������� ������� Map � ����� ��������� String, String ��������� �� 10 �������.
        Map<String, String> map = new HashMap<>();
        map.put("������", "����");
        map.put("�������", "����");
        map.put("������", "����");
        map.put("������", "����");
        map.put("���������", "�������");
        map.put("�����", "�������");
        map.put("����������", "��");
        map.put("���������", "����");
        map.put("���������", "����");
        map.put("�������", "����");
        return map;//�������� ��� ��� ���

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> name = new HashMap<String, String>(map);
        for (Map.Entry pair : name.entrySet()) {
            int count = 0;
            String a = (String) pair.getValue();

            for(Map.Entry pair2: name.entrySet()){
                if(pair2.getValue().equals(a))
               count++;
            }

            if (count>1){
                for(int i =0;i<count;i++)
                    removeItemFromMapByValue(map, String.valueOf(a));
            }
        }
//        for(Map.Entry<String,String> entry: map.entrySet()){   //�������� �����������������
//            System.out.println(entry.getKey()+" - "+entry.getValue());
//        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
