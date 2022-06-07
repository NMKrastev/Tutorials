public class PrimeChecker {

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime (int num) {
        for (int i = num; i <= num; i++) {
            if (isPrime(i)) {
                System.out.printf("%d - is Prime", i);
            } else {
                System.out.printf("%d - is not Prime", i);
            }
        }
    }
    public static void printPrimeBetweenNumbers(int firstNum, int secondNum) {
        for (int i = firstNum; i <= secondNum; i++) {
            if (isPrime(i)) {
                System.out.printf("%d ", i);
            }
        }
    }
}
