package Bags.PiggyBank;

import Bags.ArrayBag;
import Bags.BagInterface;
/**
 *
 * @author Harshana-PC
 */
public class PiggyBank {
    private BagInterface<Coin> coins;

    public PiggyBank() {
        coins = new ArrayBag<Coin>();
    }//end Default constructor
    
    public boolean add(Coin aCoin){
        return coins.add(aCoin);
    }//end add
    
    public Coin remove(){
        return coins.remove();
    }//end remove
    
    public boolean isEmpty(){
        return coins.isEmpty();
    }//end isEmpty
}//end PiggyBank
