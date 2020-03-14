package ru.rick_Sanchez.company.homework;

import java.util.Arrays;

//5 * Создать квадратный целочисленный массив
// (количество строк и столбцов одинаковое),
// заполнить его диагональные элементы единицами,
// используя цикл(ы);
// В ДАННОЙ ЗАДАЧЕ Я ТАК ПОНЯЛ НУЖНО БЫЛО ЗАПОЛНИТЬ ВСЕ ДИАГОНАЛИ(СПРАВА НАЛЕВО и СЛЕВА НАПРАВО)
public class Main_diagonal_5 {
    public static void main(String[] args) {
        int size = 3;
        int[][] squareArray = new int[size][size];
        fillDiagonalInSquareArray(squareArray);
    }

    public static void fillDiagonalInSquareArray(int[][] array){
        int one = 1;
        int k=0;
        //хитрая задача. второй цикл не нужен
        for(int i = 0; i < array.length; i++) {
            array[i][i] = one;
        }
        for( int i = array.length-1; i >= 0; i--) {
            array[i][k] = one;
            k++;
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    }
}
