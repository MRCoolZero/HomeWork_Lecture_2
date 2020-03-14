package ru.rick_Sanchez.company.homework;

import java.util.Arrays;

public class Main_swap_1 {

    public static void main(String[] args) {
        //1 Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод,
        // заменяющий в принятом массиве 0 на 1, 1 на 0;
	    int[] arrayZero_One = new int[]{1,0,1,0,1,0,1,0};
        System.out.println(Arrays.toString(arrayZero_One));
        swap(arrayZero_One);
        System.out.println(Arrays.toString(arrayZero_One));

    }

    public static void swap(int[] array){
        for(int i = 0; i < array.length ; i++) {
            if(array[i] == 1){
                array[i] = 0;
            }else array[i] = 1;
        }
    }
}
