public class Main {
    public static void main(String[] args) {
        String ogrenci1="Engin";
        String ogrenci2="Ayse";
        String ogrenci3="Murat";
        String ogrenci4="Dilan";

       /* System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);
*/
        String[] ogrenciler = new String[4];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Ayse";
        ogrenciler[2]="Murat";
        ogrenciler[3]="Dilan";


        for(int i=0;i< ogrenciler.length;i++)
        {
            System.out.println(ogrenciler[i]);



        }

        System.out.println("------------------------------");

        for(String ogernci:ogrenciler)
        {
            System.out.println(ogernci);

        }


    }
}