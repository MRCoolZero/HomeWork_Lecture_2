package ru.rick_Sanchez.company.homework;

import java.util.Arrays;

public class Main_multiplication_3 {
    public static void main(String[] args) {

        //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        // написать метод, принимающий на вход массив и умножающий
        // числа меньше 6 на 2;

        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8 , 9 ,1};
        System.out.println(Arrays.toString(array));
        multiplicNumberInArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void multiplicNumberInArray(int[] array){
        for(int i = 0; i < array.length; i++) {
            if(array[i] < 6) array[i] *= 2;
        }
    }
}
