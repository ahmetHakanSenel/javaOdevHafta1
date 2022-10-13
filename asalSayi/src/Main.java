public class Main {
    public static void main(String[] args) {

        int sayi = 1,kontrol=0;

        if (sayi==1) {
            System.out.println("Sayi asal degil.");
            return;
        }
        for(int i=2;i<sayi/2;i++){
            if (sayi==2)
                break;
            if(sayi%i==0){
                kontrol=1;
            }
            if (kontrol==1){
                System.out.println("Sayi asal degil.");
                break;
            }
            System.out.println(i);
        }
        if (kontrol==0)
            System.out.println("Sayi asal");

    }
}