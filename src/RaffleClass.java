import java.util.ArrayList;

public class RaffleClass {
    private int ownedRaffleNum;


    public RaffleClass(int raffleNum) {
        this.ownedRaffleNum = raffleNum;
    }

    public RaffleClass() {
    }

    public int updateOwnedNum(int raffleNum){
        this.ownedRaffleNum = raffleNum;
        return this.ownedRaffleNum;
    }

    public boolean checkNum(int drawnNum){
        if( drawnNum == this.ownedRaffleNum) return true;
        else return false;
    }

}
