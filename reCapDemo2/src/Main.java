public class Main {
    public static void main(String[] args) {

        double[] myList = {1.2, 1.3, 9.8, 5.6, 1.9};
        double total = 0;
        double max = 0;
        for (double number : myList) {
            if (max < number)
                max = number;
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam= " + total);
        System.out.println("En buyuk= " + max);

    }
}