public class Main {
    public static void main(String[] args) {
        int ticketAmount = 10000;
        int milesPerRub = 20;

        int bonusMiles = ticketAmount / milesPerRub;

        System.out.println("Рассчитать количество бонусных миль" + bonusMiles);
    }
}