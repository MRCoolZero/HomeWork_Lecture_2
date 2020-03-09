package ru.rick_Sanchez.company.homework;

import java.util.Arrays;

// ** Написать метод, в который передается не пустой одномерный
// целочисленный массив, метод должен вернуть true если в массиве
// есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance
// ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true.
// Абстрактная граница показана символами ||, эти символы в массив не входят.
public class Main_compare_6 {
    public static void main(String[] args) {
        int[] array = new int[]{2,1,1,1};
        System.out.println(Arrays.toString(array)+" --> " + checkBalance(array));
    }

    public static boolean checkBalance(int[] array) {
        float sum = 0;
        float sumNumber = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        for(int j = 0; j < array.length; j++) {
            sumNumber += array[j];
            if(sumNumber == sum/2) {
                return true;
            }
        }
        return false;
    }
}
