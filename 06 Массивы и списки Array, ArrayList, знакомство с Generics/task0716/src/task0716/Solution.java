package task0716;

import java.util.ArrayList;

/* 
� ��� �
1. ������ ������ ����, ������� ��� ��������������.
2. ����� fix ������:
2.1. ������� �� ������ ����� ��� �����, ���������� ����� "�"
2.2. ��������� ��� ����� ���������� ����� "�".
2.3. ���� ����� �������� � ����� "�" � ����� "�", �� �������� ��� ����� ��� ���������.
2.4. � ������� ������� ������ �� ������.

������:
����
����
����

�������� ������:
����
����
����


Requirements:
1. ��������� �� ������ ��������� ������ � ����������.
2. ����� fix ������ ������� �� ������ ����� ��� �����, ���������� ����� "�". ����������: ����� ���������� � ����� "�" � ����� "�" - �� ����� ��������.
3. ����� fix ������ ��������� �����, ���������� ����� "�" (��������� ��� ���� ������� � ���� ������). ����������: ����� ���������� � ����� "�" � ����� "�" - �� �� ����� ���������.
4. ����� fix �� ������ ������ ������ �� �������, ����������� � ����� "�" � ����� "�".
5. ����� fix �� ������ ������ ������ �� �������, ������� �� �������� �� ����� "�", �� ����� "�".
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("����");
        strings.add("����");
        strings.add("����");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
                 if (((strings.get(i).contains("�")) && !strings.get(i).contains("�"))) {
                    strings.remove(i);
                    i--;
                } else if (((!strings.get(i).contains("�")) && strings.get(i).contains("�"))) {
                    strings.add(strings.get(i));
                    i++;
                }

            }

            return strings;
        }
    }