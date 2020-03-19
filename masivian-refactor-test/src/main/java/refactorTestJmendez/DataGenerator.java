package refactorTestJmendez;

public class DataGenerator {
    private static int[] primeNumbers;

    protected static int[] generatePrimeNumbers(int totalNumbers) {
        primeNumbers = new int[totalNumbers];
        setFirstPrime();
        checkOddNumbers();
        return primeNumbers;
    }

    private static void setFirstPrime() {
        primeNumbers[0] = 2;
    }

    private static void checkOddNumbers() {
        int primeIndex = 1;
        for (int currentNumber = 3; primeIndex < primeNumbers.length; currentNumber += 2) {
            if (isPrimeNumber(currentNumber))
                primeNumbers[primeIndex++] = currentNumber;
        }
    }

    private static boolean isPrimeNumber(int currentNumber) {
        int remainder;
        for (int i = 2; i <= currentNumber / 2; i++) {
            remainder = currentNumber % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}