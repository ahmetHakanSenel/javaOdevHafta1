public class Main {
    public static void main(String[] args) {
        int sayi1 = 15, sayi2 = 18, sayi3 = 14, sayi4 = 3, sayi5 = 1;
        int enBuyuk = sayi1;

        if(enBuyuk<sayi2){
            enBuyuk = sayi2;
        }
        if (enBuyuk<sayi3){
            enBuyuk = sayi3;
        }
        if (enBuyuk<sayi4){
            enBuyuk = sayi4;
        }
        if (enBuyuk<sayi5){
            enBuyuk = sayi5;
        }
        System.out.println(enBuyuk);
    }
}