public class Main {
    public static void main(String[] args) {
        int score = 100;
        int replenishment = 13451;

        if (replenishment >= 1000) {
            System.out.println("Количество денег на счету: " + (score + replenishment + replenishment / 100));
            System.out.println("Количество бонусов: " + (replenishment / 100));
        } else {
            System.out.println("Количество денег на счету: " + (score + replenishment));
        }
    }
}