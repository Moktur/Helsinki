
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pepe
 */
public class NightSky {
    
    private double density;
    private int width;
    private int height;
    
    private int starsInLastPrint = 0;
    
    public NightSky (double density) {
        width = 20;
        height = 10;
        this.density = density;
    }
    
    public NightSky (int width, int height) {
        density = 0.1;
        this.width = width;
        this.height = height;
    }
    public NightSky (double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void printLine() {
        Random random = new Random();
        String s = "";
        for (int i = 0; i < width; ++i) {
            if (random.nextDouble() <= density) {
            s += "*";
            ++starsInLastPrint;
            } else {
                s += " ";
            }
        }
        System.out.println(s);
    }
    
    public void print() {
        for (int i = 0; i < height; ++i) {
            this.printLine();
        }
    }
    
    public int starsInLastPrint(){
        int last = starsInLastPrint;
        starsInLastPrint = 0;
        return last;
    }
}
