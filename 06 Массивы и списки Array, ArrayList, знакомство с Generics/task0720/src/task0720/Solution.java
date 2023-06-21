package task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
�������������� ���������
������ � ���������� 2 ����� N � M.
������ N ����� � ��������� ��� ������.
����������� M ������ ����� � ����� ������.
������� ������ �� �����, ������ �������� � ����� ������.

����������: ��������� ��������� ������ ������ ������.


Requirements:
1. ������ ���������� ���� ������ ����� � ����� ���������������� ee.
2. ������ c ���������� ����� N � M, ������ N ����� � ������ �� � ������.
3. ����������� M ������ ����� � ����� ������.
4. ������ ������ �� �����, ������ �������� � ����� ������.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(); //1. ������ ���������� ���� ������ ����� � ����� ���������������� ee.
        System.out.println("��������� ����� ����� N");
        int N = Integer.parseInt(reader.readLine());
        System.out.println("��������� ����� �������������� ������ ����� M");
        int M = Integer.parseInt(reader.readLine());
        System.out.println("������ ������, ������ � ����� ������");
        for (int i = 0; i < N; i++) {
            list.add(i, reader.readLine());
        }
        for (int i = 0; i < M; i++) {
            String first = list.get(0);
            list.remove(0);
            list.add(first); //3. ����������� M ������ ����� � ����� ������.

        }
        System.out.println("���������");
        for (int i = 0; i < list.size(); i++) { //4. ������ ������ �� �����, ������ �������� � ����� ������.*/
            System.out.println(list.get(i));
        }
    }
}
