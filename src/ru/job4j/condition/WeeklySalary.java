package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int payWorkBefore8 = 10;
        int payWorkAfter8 = 15;
        int rslWork = 0;
        int rslWeek = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i < 5) {
                rslWork = hours[i] < 8 ? rslWork + payWorkBefore8 * hours[i] : rslWork + ((hours[i] - 8) * payWorkAfter8 + (payWorkBefore8 * 8));
            } else {
                rslWeek = hours[i] < 8 ? rslWeek + payWorkBefore8 * 2 * hours[i] : rslWeek + ((hours[i] - 8) * payWorkAfter8 * 2 + (payWorkBefore8 * 2 * 8));
            }
        }
                return rslWeek + rslWork;
    }
}
