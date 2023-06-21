package task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки.


Requirements:
1. Программа должна выводить текст на экран.
2. Внутри класса Solution должны быть созданы public static классы Cat, Dog.
3. Метод createCats() класса Solution должен возвращать множество (Set) содержащее 4 кота.
4. Метод createDogs() класса Solution должен возвращать множество (Set) содержащее 3 собаки.
5. Метод join() класса Solution должен возвращать объединенное множество всех животных - всех котов и собак.
6. Метод removeCats() должен удалять из множества pets всех котов, которые есть в множестве cats.
7. Метод printPets() должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки.*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println("Удаляем котов, остаются: ");
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> resultC = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            Cat cat = new Cat();
            resultC.add(cat);
        }
        //3. Метод createCats() класса Solution должен возвращать множество (Set) содержащее 4 кота.
        return resultC;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> resultD = new HashSet<Dog>();
        resultD.add(new Dog());
        resultD.add(new Dog());
        resultD.add(new Dog());
        //4. Метод createDogs() класса Solution должен возвращать множество (Set) содержащее 3 собаки.
        return resultD;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);
        //Метод join() класса Solution должен возвращать объединенное множество всех животных - всех котов и собак.
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
        //6. Метод removeCats() должен удалять из множества pets всех котов, которые есть в множестве cats.
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets) {
            System.out.println(pet);
        }
        //7. Метод printPets() должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки.
    }

    public static class Cat { //1. Внутри класса Solution создать public static клас Cat без конструктора или с конструктором без параметров.
        public Cat() {
        }

        public String toString() {
            return "Cat";
        }
    }

    public static class Dog { //1. Внутри класса Solution создать public static клас Dog без конструктора или с конструктором без параметров.
        public Dog() {
        }

        public String toString() {
            return "Dog";
        }
    }
}
