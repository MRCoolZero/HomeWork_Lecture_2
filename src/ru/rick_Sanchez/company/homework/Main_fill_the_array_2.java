package ru.rick_Sanchez.company.homework;

import java.util.Arrays;

public class Main_fill_the_array_2 {
//2 Задать пустой целочисленный массив размером 8.
// Написать метод, который помощью цикла заполнит
// его значениями 1 4 7 10 13 16 19 22;
    public static void main(String[] args) {
        int size = 8;
        int[] array = new int[size];
        fillTheArray(array);
        System.out.println(Arrays.toString(array));

    }
    public static void fillTheArray(int[] array){
        int number = 1;
        int increase = 3;
        for(int i = 0; i < array.length; i++) {
            array[i] = number;
            number += increase;
        }
    }
}
