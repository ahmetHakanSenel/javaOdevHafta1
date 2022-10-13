public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean ctrl = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                ctrl = true;
                break;
            }
        }
        if (ctrl == true)
            System.out.println("Sayi bulundu.");
        else
            System.out.println("Sayi bulunamadi.");
    }
}