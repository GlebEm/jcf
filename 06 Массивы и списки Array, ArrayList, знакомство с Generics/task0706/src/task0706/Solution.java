package task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
1. ������� ������ �� 15 ����� �����.
2. ������ � ���� �������� � ����������.
3. ������ ������ �������� ������� �������� ������� ����, � �������� - ������ �������, ����������� � ����.
���� � ��������� �������� ����������� �� ����� ������� �����, � ������� - �� ������. ��������, �� ����� ������� ����� ��������� ������ �������.
4. ������� �� ����� ���������: "� ����� � ��������� �������� ��������� ������ �������." ��� "� ����� � ������� �������� ��������� ������ �������."

����������:
��� � ���������� ������� 0 ������� ������.


Requirements:
1. ��������� ������ ��������� ������ �� 15 ����� �����.
2. ��������� ������ ��������� ����� ��� ������� � ����������.
3. ��������� ������ ������� ��������� "� ����� � ��������� �������� ��������� ������ �������.", ���� ����� �������� ��������� ������� ������ ����� ������.
4. ��������� ������ ������� ��������� "� ����� � ������� �������� ��������� ������ �������.", ���� ����� ������ ��������� ������� ������ ����� ��������.
5. ��������� �� ������ �������� ����� � �������, ���� ���������� ������� �� ������ ������� - ����������.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[6]; //1. ������� ������ �� 15 ����� �����.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine()); //2. ������ � ���� �������� � ����������.
            if (i % 2 == 0) {
                sumEven += arr[i];
            }
            if (i % 2 != 0) {
                sumOdd += arr[i];
            }
        }
        System.out.println("� ����� � ������ ������� ���������: " + sumEven + " �������" + "\n"
                + "� ����� � �������� ������� ���������: " + sumOdd + " �������");
        if (sumEven > sumOdd) {
            System.out.println("� ����� � ������� �������� ��������� ������ �������.");
        } else if (sumEven < sumOdd) {
            System.out.println("� ����� � ��������� �������� ��������� ������ �������.");
        } //5. ��������� �� ������ �������� ����� � �������, ���� ���������� ������� �� ������ ������� - ����������.*/
        //�������� ��� ��� ���
    }
}
