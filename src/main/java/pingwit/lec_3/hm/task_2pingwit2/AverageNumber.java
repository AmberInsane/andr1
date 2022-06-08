package pingwit.lec_3.hm.task_2pingwit2;

import java.util.Arrays;

//+ Код не отформатирован
public class AverageNumber {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sumOfAllNumbers = 0;
        int average = 0;
        for ( int i = 0; i < array.length; i++) {
            array[i] = i + 3;
            sumOfAllNumbers = sumOfAllNumbers + array[i];
            average = sumOfAllNumbers / array.length; //average лучше вынести после цикла, так как нас интересует только последнее значение, когда сумма всех подсчитана
                                                      //сейчас считаются промежуточные значения, которые не используются
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sumOfAllNumbers);
        System.out.println((average));
    }
}
