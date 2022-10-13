public class Main {
    public static void main(String[] args) {
        String harf="ö";
        harf= harf.toUpperCase();

        switch (harf){
            case "A":
            case "I":
            case "O":
            case "U":
                System.out.println("Kalin sesli harf.");
                break;
            case "E":
            case "İ":
            case "Ö":
            case "Ü":
                System.out.println("Ince sesli harf:");
                break;
            default:
                System.out.println("Sessiz harf girdiniz.");


        }
    }
}