package refactorTestJmendez;

public class RefactoredPrinter {

    public static void main(String[] args) {
        final int TOTAL_NUMBERS = 1000;
        int[] primeNumbers = DataGenerator.generatePrimeNumbers(TOTAL_NUMBERS);

        final int NUMBER_OF_ROWS = 50;
        final int NUMBER_OF_COLUMNS = 5;

        DataFixPrinter tablePrinter = new DataFixPrinter(NUMBER_OF_ROWS, NUMBER_OF_COLUMNS, "The First " + TOTAL_NUMBERS + " Prime Numbers");
        tablePrinter.print(primeNumbers);
    }
}