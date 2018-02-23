package com.lesson4;

public class Part2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int a = ~i;
            System.out.println("Состояние инвертированной гирлянды: " + Integer.toBinaryString(a));
        }
        for (int i = 0; i < 5; i++) {
            int b = i << 1;
            System.out.println("Мигающая гирлянда: " + Integer.toBinaryString(b));
        }

        int i = 5;
        int mask = 1;
        int c = i & mask;
        System.out.println("Включена ли первая лампочка: " + Integer.toBinaryString(c));
        System.out.println("Текущее состояние гирлянды: " + Integer.toBinaryString(i));
    }


}
