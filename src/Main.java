import java.util.StringJoiner;

void main() {
 int[][] numbersMatrix = new int [4][4];
 int sumOfNumbersInEvenColumn = 0;
 int sumOfNumbersInOddColumn = 0;
 int sumOfNumbersInEvenRow = 0;
 int sumOfNumbersInOddRow = 0;
 int sumOfAllRowsAndColumns = 0;
 int sumOfAllDiagonals = 0;
 int sumOfDiagonal = 0;
 int sumOfAntDiagonal = 0;
 int lengthOfArraysInMatrix = numbersMatrix.length;
    StringJoiner rowJoiner = new StringJoiner(" ", " ", "");
    for (int i =0; i < lengthOfArraysInMatrix;i++) {
        numbersMatrix[i] =  new Random().ints(4, 1, 51).toArray();
        sumOfDiagonal += numbersMatrix[i][i];
        sumOfAntDiagonal += numbersMatrix[i][(lengthOfArraysInMatrix-1)-i];
        for (int j = 0; j < numbersMatrix[i].length; j++) {
            sumOfAllRowsAndColumns = sumOfAllRowsAndColumns + numbersMatrix[i][j];
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
        sumOfAllDiagonals = sumOfDiagonal + sumOfAntDiagonal;
        rowJoiner.add(System.lineSeparator());
    }
    IO.println(rowJoiner);
    IO.println("парних стовпцях (рядок 0, 2) = "+sumOfNumbersInEvenColumn+" та суму всіх елементів в непарних стовпцях (рядок 1, 3) = "+sumOfNumbersInOddColumn);
    IO.println("парних рядках (рядок 0, 2) = "+sumOfNumbersInEvenRow+" та суму всіх елементів в непарних рядках (рядок 1, 3) = "+sumOfNumbersInOddRow);
    IO.println("сума всіх стовпців, та суму всіх рядків = "+sumOfAllRowsAndColumns);
    IO.println("сума  діагоналі = "+sumOfDiagonal);
    IO.println("сума  антідіагоналей = "+sumOfAntDiagonal);
    IO.println("сума всіх діагоналей = "+sumOfAllDiagonals);
    if(sumOfAllDiagonals == sumOfAllRowsAndColumns){
        IO.println("Ця матриця є магічним квадратом = "+sumOfAllDiagonals);
    }
}
