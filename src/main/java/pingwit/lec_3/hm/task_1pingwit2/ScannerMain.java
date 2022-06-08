package pingwit.lec_3.hm.task_1pingwit2;


import java.util.Arrays;
import java.util.Scanner;

//+- Код не отформатирован
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
                smallestOne = array[0]; //можно вынести после цикла, потому что каждый раз одно и то же значение перезаписывается

            }

            System.out.println(Arrays.toString(array)); // printin an array fullfilled by the user
            //перепроверь эту часть, пожалуйста, на одних и тех же числах в разном порядке. если ответ разный, то программа работает некорректно
            for (i = 1; i < array.length; i++) {
                if (smallestOne > array.length) //проверка значения с длинной массива - что-то не так
                    smallestOne = array[i];
                else biggestOne = array[i];
            }
            //в задании указано вывести еще сумму элементов
            System.out.println("The smallest number is: " + smallestOne);
            System.out.println("The biggest number is: " + biggestOne);
        }
    }
