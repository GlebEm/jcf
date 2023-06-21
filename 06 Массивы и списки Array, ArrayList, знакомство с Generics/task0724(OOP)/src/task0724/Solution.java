package task0724;

/* 
�������� ��������
������ ����� Human � ������ ���(String), ���(boolean), �������(int), ����(Human), ����(Human). ������ ������� � �������
�� ���, ����� ����������: ��� �������, ��� �������, ����, ����, ���� �����. ������� ������� �� �����.

����������:
���� �������� ���� ����� String toString() � ������ Human, �� ������ �� ����� �������������� ��� ������ ������� �� �����.

������ ������:
���: ���, ���: �������, �������: 21, ����: �����, ����: ����
���: ����, ���: �������, �������: 55
���: �����, ���: �������, �������: 2, ����: ������, ����: ���
...


Requirements:
1. ��������� �� ������ ��������� ������ � ����������.
2. �������� � ����� Human ����: ���(String), ���(boolean), �������(int), ����(Human), ����(Human).
3. �������� � ����� ����������� public Human(String name, boolean sex, int age).
4. �������� � ����� ����������� public Human(String name, boolean sex, int age, Human father, Human mother).
5. ������ 9 ������ �������� ���� Human (4 ������� ��� ���� � ������ � 5 �������� � ����)).
6. ������ ��������� ������� �� �����.*/

public class Solution {
    public static void main(String[] args) {
        Human human1 = new Human("�������", true, 69);
        Human human2 = new Human("�������",false,65);
        Human human3 = new Human("���������",true,74);
        Human human4 = new Human("��������",false,70);
        Human human5 = new Human("�����",true,45,human1,human2);
        Human human6 = new Human("��������",false,39,human3,human4);
        Human human7 = new Human("������",true,3,human5,human6);
        Human human8 = new Human("��������",false,14,human5,human6);
        Human human9 = new Human("ϸ��",true,16,human5,human6);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());

        // �������� ��� ��� ���
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) { //3. �������� � ����� ����������� public Human(String name, boolean sex, int age).
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) { //4. �������� � ����� ����������� public Human(String name, boolean sex, int age, Human father, Human mother).
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        // �������� ��� ��� ���

        public String toString() {
            String text = "";
            text += "���: " + this.name;
            text += ", ���: " + (this.sex ? "�������" : "�������");
            text += ", �������: " + this.age;

            if (this.father != null) {
                text += ", ����: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", ����: " + this.mother.name;
            }

            return text;
        }
    }
}