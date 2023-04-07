package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max + 1; // Верхняя граница не включается в диапазон метода
        // ints(min, max) класса Random, так что расширим её
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                // Можно поставить условие - !(randomInt == 100), но смысла нет, т.к. break уже есть в main по заданию
                return true;
            }

            @Override
            public Integer next() {
                return new Random().ints(min, max)
                        .findFirst()
                        .orElseThrow();
            }
        };
    }
}
