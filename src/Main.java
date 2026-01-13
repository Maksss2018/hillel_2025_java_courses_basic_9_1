/*
Створіть Java програму, яка виконує наступні завдання,
використовуючи двовимірний масив (матрицю):

   + Створіть двовимірний масив цілих чисел розмірністю 4x4.
   + Заповніть матрицю випадковими цілими числами в діапазоні від 1 до 50.
   + Виведіть матрицю на екран у вигляді таблиці.
   + Знайдіть суму всіх елементів в парних рядках (рядок 0, 2) та суму всіх елементів в непарних рядках (рядок 1, 3).
   + Знайдіть добуток всіх елементів в парних стовпцях (стовпцях 0, 2) та добуток всіх елементів в непарних стовпцях (стовпцях 1, 3).
    Виведіть результати сум та добутків для парних і непарних рядків та стовпців.
    Перевірте, чи матриця є магічним квадратом. Магічний квадрат - це квадратна матриця, в якій суми всіх рядків, стовпців та діагоналей рівні між собою.
    Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
 */
import java.util.StringJoiner;

void main() {
 int[][] numbersMatrix = new int [4][4];
 int sumOfNumbersInEvenColumn = 0;
 int sumOfNumbersInOddColumn = 0;
 int sumOfNumbersInEvenRow = 0;
 int sumOfNumbersInOddRow = 0;
    StringJoiner rowJoiner = new StringJoiner(" ", " ", "");
    for (int i =0; i < numbersMatrix.length;i++) {
        numbersMatrix[i] =  new Random().ints(4, 1, 51).toArray();
        for (int j = 0; j < numbersMatrix[i].length; j++) {
            if(i % 2 == 0) {
            sumOfNumbersInEvenRow = sumOfNumbersInEvenRow + numbersMatrix[i][j];
            } else {
            sumOfNumbersInOddRow = sumOfNumbersInOddRow + numbersMatrix[i][j];
            }
            if(j % 2 == 0) {
                sumOfNumbersInEvenColumn = sumOfNumbersInEvenColumn + numbersMatrix[i][j];
            } else {
                sumOfNumbersInOddColumn = sumOfNumbersInOddColumn + numbersMatrix[i][j];
            }
            rowJoiner.add(" " + numbersMatrix[i][j] + " ");
        }
        rowJoiner.add(System.lineSeparator());
    }
    IO.println(rowJoiner);
    IO.println("парних стовпцях (рядок 0, 2) = "+sumOfNumbersInEvenColumn+" та суму всіх елементів в непарних стовпцях (рядок 1, 3) = "+sumOfNumbersInOddColumn);
    IO.println("парних рядках (рядок 0, 2) = "+sumOfNumbersInEvenRow+" та суму всіх елементів в непарних рядках (рядок 1, 3) = "+sumOfNumbersInOddRow);
    //IO.println("there is no " + targetNumber+" in this array");

}
