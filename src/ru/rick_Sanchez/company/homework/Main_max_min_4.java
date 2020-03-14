package ru.rick_Sanchez.company.homework;

import java.util.Arrays;
import java.util.Random;

public class Main_max_min_4 {
    public static void main(String[] args) {
        //4 Задать одномерный массив. Написать методы
        // поиска в нём минимального и максимального
        // элемента;
        int size = 15;
        int[] array = new int[size];
        Random random = new Random();

        //заполняем массив случайными чисоами
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30);
        }
        System.out.println(Arrays.toString(array));


        System.out.println("max number in array: "+ maxNumberInArray(array) + "\n"+
                            "min number in array: "+ minNumberInArray(array));
    }

    public static int maxNumberInArray(int[] array){
        int max = array[0];
        for(int value : array) {
            if(max < value) max = value;
        }
        return max;
    }

    public static int minNumberInArray(int[] array){
        int min = array[0];
        for(int value : array) {
            if(min > value) min = value;
        }
        return min;
    }
}
