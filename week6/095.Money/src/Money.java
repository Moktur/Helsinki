
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int euro = this.euros() + added.euros();
        int cent = this.cents() + added.cents();

        if (cent > 99) {
            ++euro;
            cent %= 100;
        }
        return new Money(euro, cent);
    }

    public Money minus(Money decremented) {
        int euro;
        int cent;

        if (decremented.euros() > this.euros()) {
            return new Money(0, 0);
        }
        if (this.euros() > decremented.euros()
                && this.cents() < decremented.cents()) {

            euro = this.euros() * 100;
            euro -= decremented.cents();
            cent = euro % 100;
            euro /= 100;
            euro -= decremented.euros();
            return new Money(euro, cent);
        }
        return new Money(this.euros() - decremented.euros(), this.cents()
                - decremented.cents());

    }

    public boolean less(Money compared) {
        if (this.euros() > compared.euros()) {
            return false;
        } else if (this.euros() < compared.euros()) {
            return true;
        } else 
            return this.cents() < compared.cents();
        
    }
}
