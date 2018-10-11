
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    final private double economicalLunch = 2.5;
    final private double gourmetLunch = 4.0;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= economicalLunch) {
            cashInRegister += (economicalLunch);
            ++economicalSold;
            return cashGiven - economicalLunch;
        } else {
            return cashGiven;
        }
// price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= gourmetLunch) {
            cashInRegister += (gourmetLunch);
            ++gourmetSold;
            return cashGiven - gourmetLunch;
        } else {
            return cashGiven;
        }
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
    }

    
    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= economicalLunch) {
            card.pay(economicalLunch);
            ++economicalSold;
            return true;
        }
        return false;
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= gourmetLunch) {
            card.pay(gourmetLunch);
            ++gourmetSold;
            
            return true;
        }
        return false;
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >= 1) {
            card.loadMoney(sum);
            cashInRegister += sum;
        }
}
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
