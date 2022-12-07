public class Arrays2 {
    static int [] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int [] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println("Задание 1");

        int[] monthlyPayment = arr;
        for (int i = 0; i < monthlyPayment.length; i++) {
            System.out.println(monthlyPayment[i]);
        }
        int summaryPayment = 0;
        for (int i = 0; i < monthlyPayment.length; i++) {
            summaryPayment = summaryPayment + monthlyPayment[i];
        }
        System.out.println("Сумма трат за месяц составила " + summaryPayment + " рублей");

        System.out.println("Задание 2");
        monthlyPayment = arr;
        int minimalPayment = monthlyPayment[0];
        int maximalPayment = 0;
        for (int i = 0; i < monthlyPayment.length; i++) {
            if(monthlyPayment[i]>0 && monthlyPayment[i]<minimalPayment) {
                minimalPayment = monthlyPayment[i];
            }
            if (monthlyPayment[i]>0 && monthlyPayment[i]>maximalPayment) {
                maximalPayment = monthlyPayment[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimalPayment + " рублей. Максимальная сумма трат за день составила " + maximalPayment + " рублей");

        System.out.println("Задание 3");

        monthlyPayment = arr;

        int summaryPayment2 = 0;
        double averagePayment = 0;
        for (int i = 0; i < monthlyPayment.length; i++) {
            summaryPayment2 = summaryPayment2 + monthlyPayment[i];
        }
        averagePayment = (double) summaryPayment2 / monthlyPayment.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayment + " рублей");

        System.out.println("Задание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
        }
    }
