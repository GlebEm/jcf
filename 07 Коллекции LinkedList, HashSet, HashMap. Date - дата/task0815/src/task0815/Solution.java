package task0815;

import com.sun.jdi.Value;

import javax.swing.*;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.security.Key;
import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;

/* 
�������� ���������
������� ������� (Map<String, String>) ������� � ���� ������ ������� �� �������� "�������" - "���".
��������� ������� ����� ����� ����������� � �������� ������ ��� ��������.


Requirements:
1. ��������� �� ������ �������� ����� �� �����.
2. ��������� �� ������ ��������� �������� � ����������.
3. ����� createMap() ������ ��������� � ���������� ������� Map � ����� ��������� String, String ��������� �� 10 ������� �� �������� ��������� - �����.
4. ����� getCountTheSameFirstName() ������ ���������� ����� ����� � ������� ��������� ���.
5. ����� getCountTheSameLastName() ������ ���������� ����� ����� � ������� ��������� �������.*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("������", "����");
        map.put("������", "����");
        map.put("������", "����");
        map.put("������", "����");
        map.put("���������", "�������");
        map.put("�����", "�������");
        map.put("����������", "��");
        map.put("���������", "����");
        map.put("������", "����");
        map.put("�������", "����");//�������� ��� ��� ���
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countFN = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                countFN++;
            }
        }
        return countFN;//�������� ��� ��� ���
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countLN = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                countLN++;
            }
        }
        return countLN;

    }

    public static void main(String[] args) {
        System.out.println("���������� ����� � �������� ������: " + getCountTheSameFirstName(createMap(), "����"));
        System.out.println("���������� ����� � �������� ��������: " + getCountTheSameLastName(createMap(), "������"));
        System.out.println("������ ����: "+createMap().size());
    }
}
