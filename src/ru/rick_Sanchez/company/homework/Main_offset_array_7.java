package ru.rick_Sanchez.company.homework;

import java.util.Arrays;
import java.util.Random;

//7 *** Написать метод, которому на вход подаётся одномерный массив
// и число n (может быть положительным, или отрицательным), при этом
// метод должен циклически сместить все элементы массива на n позиций.
public class Main_offset_array_7 {
    public static void main(String[] args) {
        int size = 10;
        int positionShift = 4;
        int[] arrayShift = new int[]{1, 2, 3, 4, 5, 6, 7};
        

//        Random random = new Random();
//        for(int i = 0; i < arrayShift.length; i++) {
//            arrayShift[i] = random.nextInt(10);
//        }
        for(int i : arrayShift) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        offsetArray(arrayShift,positionShift);

        
    }
    public static void offsetArray(int[] array, int positionShift) {
        int[] arrayForCopy = new int[array.length];
        
        for (int i = array.length-1; i >= 0; i--) {
            if(i+positionShift >= array.length){
                arrayForCopy[i+positionShift-array.length] = array[i];
            }
            else{
                arrayForCopy[i+positionShift] = array[i];
            }
        }
        for (int i : arrayForCopy) {
            System.out.print(i + " ");
        }
    }
}
//НЕ ДОДЕЛАЛ ПОЛНОСТЬЮ. НО Я НА ВЕРНОМ ПУТИ