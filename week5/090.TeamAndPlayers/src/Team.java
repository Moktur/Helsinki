
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pepe
 */
public class Team {
    private String name;
    private int maximumSize;
    private ArrayList<Player> list;
    
    public Team(String teamname){
        name = teamname;
        list = new ArrayList<Player>();
        maximumSize = 16;
        
    }
    
    public void addPlayer(Player player) {
        
        
        if (maximumSize > list.size()) {
            list.add(player);
        }
    }
    
    public void printPlayers() {
        for (Player p : list) {
            System.out.println(p);
        }
    }
    
    public void setMaxSize(int i) {
        maximumSize = i;
    }
    
    public int size() {
        return list.size();
    }
    
    public String getName() {
        return name;
    }
    
    public int goals() {
        int g = 0;
        for (Player p : list) {
           g += p.goals();
        }
        return g;
    }
}
