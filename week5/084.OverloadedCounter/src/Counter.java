/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pepe
 */
public class Counter {

    private int counter;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this(check);
        counter = startingValue;
        if (check && startingValue <= 0) {
            counter = 0;
        }

    }

    public Counter(int startingValue) {
        counter = startingValue;
    }

    public Counter(boolean check) {
        this();
        this.check = check;
    }

    public Counter() {
        counter = 0;
    }

    public int value() {
        return counter;
    }

    public void increase() {
        ++counter;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            counter += increaseAmount;

        }
    }

    public void decrease() {
        if (check) {
            if (counter >= 1) {
                --counter;
            }
        } else {
            --counter;
        }
    }

    public void decrease(int decreaseAmount) {

        if (decreaseAmount >= 1) {
            if (decreaseAmount > counter && check) {
                counter = 0;
            } else {
                counter -= decreaseAmount;
            }
        }

    }

    public String toString() {
        return "Value: " + counter + " check: " + check;
    }
}
