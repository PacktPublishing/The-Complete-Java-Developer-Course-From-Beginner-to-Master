
public abstract class Animal {
    private String name;
    private double weight;
    
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public abstract String makeNoise();
}
