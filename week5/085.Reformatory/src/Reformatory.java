public class Reformatory {
    private int weight = 0;
    
    public int weight(Person person) {
        ++weight;
        return person.getWeight();
    }
        
    public void feed(Person h) {
        h.setWeight(h.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        return weight; 
    }
}
