import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MAI {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество критериев (целое число) и нажмите Enter: ");
        String a = reader.readLine();
        int amount = Integer.parseInt(a);
        if (amount <= 0) {          //условие проверки для правильности ввода количества критериев
            System.out.println("Критериев не может быть 0 или меньше");
            System.exit(0);
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double[][] massive = new double[amount][amount];
        double[] sums = new double[amount];
        double fullSum = 0;
        double[] coeficcient = new double[amount];
        double coefSum = 0;
        for (int i = 0; i < amount; i++) { // цикл внесения значений в двумерный массив над главной диагональю
            for (int j = 0; j <= i; j++) {
                if (i==j) {
                    massive[i][j] = 1;
                }
                else {
                    System.out.println("Введите балл сравнения по качественной шкале критерия " + (i + 1) + " к критерию " + (j + 1) + ":");
                    String amo = reader.readLine();
                    double value = Double.parseDouble(amo);
                    if (value <= 0) {
                        System.out.println("Балл сравнения не может быть меньше, либо равен нулю! Перезапустите программу.");
                        System.exit(0);
                    }
                    massive[j][i] = value;
                }

            }
        }
        for (int i = 0; i < massive.length; i++) { //i - столбец
            for (int j = i+1; j < massive.length; j++) { //j - строка
                massive[j][i] = 1/massive[i][j];  // программа сама считает для нас значения под главной диагональю
            }

        }
        /* for (double[] ints : massive) {
            for (int j = 0; j < massive.length; j++) {                тут я делал вывод двумерного массива
                System.out.print(ints[j] + " ");                      (таблицы коэффициентов) на экран (проверка для себя)
            }
            System.out.println();
        } */
        for (int i = 0; i < massive.length; i++) { // i - строка
            for (int j = 0; j < massive.length; j++) { // j - столбец
                sums[i] = sums[i] + massive[i][j];     // цикл для подсчета суммы критериев по строкам
            }
        }
        for (double sum : sums) {     // цикл для подсчета полной суммы всех критериев по строкам
            fullSum += sum;
        }
        for (int i = 0; i < massive.length; i++) {  // цикл для подсчета весовых коэффициентов
            coeficcient[i] = sums[i]/fullSum;
        }
        for (int i = 0; i < coeficcient.length; i++) { // цикл для вывода значений весовых коэффициентов
            System.out.println("Весовой коэффициент " + (i+1) + " критерия: " + decimalFormat.format(coeficcient[i]));
        }
        for (double v : coeficcient) {  // цикл для посчета суммы весовых коэффициентов (должно быть равно 1 или же 100%)
            coefSum = coefSum + v;
        }
        System.out.println("Сумма коэффициентов: " + decimalFormat.format(coefSum));
    }
}
