package task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
��������, ������� ������� �������� 10 ����� ������� ��� ������� ������.
����� getInsertTimeInMs ������ ������� ����� ������ ���������� � �������������.


Requirements:
1. ��������� ������ �������� ����� �� �����.
2. ����� main ������ �������� ����� getInsertTimeInMs ������ ��� ����.
3. ����� insert10000(List list) ������ ��������� 10 ����� ��������� � ������.
4. ����� getInsertTimeInMs ������ �������� ����� insert10000 ������ ���� ���.
5. ����� getInsertTimeInMs ������ ������� ����� � �������������, ������� �������� 10 ����� ������� � ������.*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("����� � ������������� �����: " + getInsertTimeInMs(new ArrayList()) + " ��.");
        System.out.println("����� � ������������� �����: " + getInsertTimeInMs(new LinkedList()) + " ��.");
    }

    public static long getInsertTimeInMs(List list) {
        // �������� ��� ��� ���
        long before = System.currentTimeMillis();
        insert10000(list);
        long after = System.currentTimeMillis();
        long time = after - before;
        return time;
        // �������� ��� ��� ���

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
