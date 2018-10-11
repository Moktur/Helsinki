/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pepe
 */
public class Multiplier {
    
    
    private int peins;
    
    public Multiplier(int number) {
        peins = number;
    }
    
    public int multiply(int otherNumber) {
        return otherNumber * peins;
    }
}
