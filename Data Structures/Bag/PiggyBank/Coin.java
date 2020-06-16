package Bags.PiggyBank;

/**
 *
 * @author Harshana-PC
 */
public class Coin {
    private int CoinName;
    private int CoinValue;

    public Coin(int CoinName, int CoinValue) {
        this.CoinName = CoinName;
        this.CoinValue = CoinValue;
    }

    public int getCoinName() {
        return CoinName;
    }

    public void setCoinName(int CoinName) {
        this.CoinName = CoinName;
    }

    public int getCoinValue() {
        return CoinValue;
    }

    public void setCoinValue(int CoinValue) {
        this.CoinValue = CoinValue;
    }

    @Override
    public String toString() {
        return "Coin{" + "CoinName=" + CoinName + ", CoinValue=" + CoinValue + '}';
    }
    
}
