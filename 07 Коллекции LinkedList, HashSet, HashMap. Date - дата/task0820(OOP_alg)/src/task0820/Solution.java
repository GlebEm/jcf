package task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
��������� ���� ��������
1. ������ ������ Solution ������� public static ������ Cat, Dog ��� ������������ ��� � ������������� ��� ����������.
2. ����������� ����� createCats, ������� ������ ���������� ��������� � 4 ������.
3. ����������� ����� createDogs, ������� ������ ���������� ��������� � 3 ��������.
4. ����������� ����� join, ������� ������ ���������� ������������ ��������� ���� �������� - ���� ����� � �����.
5. ����������� ����� removeCats, ������� ������ ������� �� ��������� pets ���� �����, ������� ���� � ��������� cats.
6. ����������� ����� printPets, ������� ������ �������� �� ����� ���� ��������, ������� � ��� ����.
������ �������� � ����� ������.


Requirements:
1. ��������� ������ �������� ����� �� �����.
2. ������ ������ Solution ������ ���� ������� public static ������ Cat, Dog.
3. ����� createCats() ������ Solution ������ ���������� ��������� (Set) ���������� 4 ����.
4. ����� createDogs() ������ Solution ������ ���������� ��������� (Set) ���������� 3 ������.
5. ����� join() ������ Solution ������ ���������� ������������ ��������� ���� �������� - ���� ����� � �����.
6. ����� removeCats() ������ ������� �� ��������� pets ���� �����, ������� ���� � ��������� cats.
7. ����� printPets() ������ �������� �� ����� ���� ��������, ������� � ��� ����. ������ �������� � ����� ������.*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println("������� �����, ��������: ");
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> resultC = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            Cat cat = new Cat();
            resultC.add(cat);
        }
        //3. ����� createCats() ������ Solution ������ ���������� ��������� (Set) ���������� 4 ����.
        return resultC;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> resultD = new HashSet<Dog>();
        resultD.add(new Dog());
        resultD.add(new Dog());
        resultD.add(new Dog());
        //4. ����� createDogs() ������ Solution ������ ���������� ��������� (Set) ���������� 3 ������.
        return resultD;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);
        //����� join() ������ Solution ������ ���������� ������������ ��������� ���� �������� - ���� ����� � �����.
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
        //6. ����� removeCats() ������ ������� �� ��������� pets ���� �����, ������� ���� � ��������� cats.
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet);
        }
        //7. ����� printPets() ������ �������� �� ����� ���� ��������, ������� � ��� ����. ������ �������� � ����� ������.
    }

    public static class Cat { //1. ������ ������ Solution ������� public static ���� Cat ��� ������������ ��� � ������������� ��� ����������.
        public Cat() {
        }

        public String toString() {
            return "Cat";
        }
    }

    public static class Dog { //1. ������ ������ Solution ������� public static ���� Dog ��� ������������ ��� � ������������� ��� ����������.
        public Dog() {
        }

        public String toString() {
            return "Dog";
        }
    }
}
