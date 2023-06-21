package task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
�����-�����
1. ������ ������ �����.
2. ������ � ���� 10 ������� � ����������.
3. �����, ����� ������ � ������ ���������� ������: ����� �������� ��� ����� �������.
���� ����� ����� ���������, �� ������ ���� ������ ����� ������ �� ���.
4. ������ �� ����� ������ �� �.3. ������ ���� �������� ���� ������.


Requirements:
1. ������ ���������� ���� ������ ����� � ����� ���������������� ee.
2. ��������� ������ ��������� 10 ����� � ���������� � ��������� �� � ������.
3. ��������� ������ �������� �� ����� ����� �������� ������, ���� ��� ���� ������ ����� �������.
4. ��������� ������ �������� �� ����� ����� ������� ������, ���� ��� ���� ������ ����� ��������.
5. ������ ���� �������� ������ ���� ������.*/

public class Solution {

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>(); //1. ������ ���������� ���� ������ ����� � ����� ���������������� ee.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxStringSize = 0;
        String maxString;
        int countForMax = 0;
        int minStringSize;
        String minString;
        int countForMin = 0;
        for (int i = 0; i < 10; i++) {
            list.add(i, reader.readLine()); //2. ��������� ������ ��������� 10 ����� � ���������� � ��������� �� � ������.
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
            System.out.println("����� ������� ������ ������� ������, ��� ������: " + list.get(countForMax));
        } else if (countForMin < countForMax) {
            System.out.println("����� �������� ������ ������� ������, ��� ������: " + list.get(countForMin));
        } else {
            System.out.println("����� ���� ��������� ����� ���������");
        }

    }
}