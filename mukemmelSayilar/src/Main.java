public class Main {
    public static void main(String[] args) {
        int number = 27, bolenTop = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                bolenTop = bolenTop + i;
            }

        }
        if (bolenTop == number)
            System.out.println("Mukemmel sayi.");

        else
            System.out.println("Mukemmel sayi degil.");

    }
}