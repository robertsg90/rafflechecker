import java.util.Scanner;

public class RaffleChecker {
    public static void main(String[] args) {
        RaffleClass raffleobj = new RaffleClass();
        Scanner menuScanner = new Scanner(System.in);
        int menuChoice = 0;
        while(menuChoice != 3) {
            System.out.println("Menu Options\n1: Record / Update Raffle Number\n2: Check Raffle Number\n3: Exit");
            menuChoice = menuScanner.nextInt();
            switch (menuChoice) {
                case 1:
                    System.out.println("Enter your raffle Number:");
                    raffleobj.updateOwnedNum(menuScanner.nextInt());
                    break;
                case 2:
                    System.out.println("Enter raffle number to check:");
                    if(raffleobj.checkNum(menuScanner.nextInt())){
                        System.out.println("Winner!");
                    }else System.out.println("Sorry you did not win.");
                    break;
                default:
                    break;
            }
        }
    }
}