package task0801;

import java.util.HashSet;
import java.util.Set;

/* 
������� ��������� Set (���������� HashSet) � ����� ��������� String.
�������� � �� ��������� ������:
�����
�����
�����
�����
����
�������
��������
���������
����
���������

������� ���������� ��������� �� �����, ������ ������� � ����� ������.
����������, ��� ��������� ������� ����������� ���������.


Requirements:
1. ������ ���������� ��������� Set � ����� ��������� String � ����� ���������������� ee.
2. ��������� �� ������ ��������� ������ � ����������.
3. ��������� ������ ��������� � ��������� 10 �����, �������� �������.
4. ��������� ������ �������� 10 ����� �� ��������� �� �����, ������ � ����� ������.
*/

public class Solution {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>(); //1. ������ ���������� ��������� Set � ����� ��������� String � ����� ���������������� ee.
        stringSet.add("�����");
        stringSet.add("�����");
        stringSet.add("�����");
        stringSet.add("�����");
        stringSet.add("����");
        stringSet.add("�������");
        stringSet.add("��������");
        stringSet.add("���������");
        stringSet.add("����");
        stringSet.add("���������");
        for(String element:stringSet){
            System.out.println(element);
        }

        //�������� ��� ��� ���

    }
}
