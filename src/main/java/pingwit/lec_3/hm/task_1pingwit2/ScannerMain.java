package pingwit.lec_3.hm.task_1pingwit2;


import java.util.Arrays;
import java.util.Scanner;

// +- код не отформатирован
public class ScannerMain {
        public static void main(String[] args) {
            int[] array = new int[3];
            int biggestOne = 0;
            int smallestOne = 0;
            int i;
            for (i = 0; i < array.length; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter any number: ");
                array[i] = scanner.nextInt(); // fullfillin an array w user entered
                smallestOne = array[0]; // на каждой итерации будет добавлять одно и то же значение в переменную - может быть вынесено после цикла

            }

            System.out.println(Arrays.toString(array)); // printin an array fullfilled by the user
            //проверь этот код на одинаковых наборах чисел в разной последовательности. если результат каждый раз разный - программа работает неверно
            for (i = 1; i < array.length; i++) {
                if (smallestOne > array.length) //сравнение значения с размером массива - не связано с проверкой, какой элемент минимальный
                    smallestOne = array[i];
                else biggestOne = array[i]; 
            }
            //в задании указано было еще вывести сумму всех
            System.out.println("The smallest number is: " + smallestOne);
            System.out.println("The biggest number is: " + biggestOne);
        }
    }
