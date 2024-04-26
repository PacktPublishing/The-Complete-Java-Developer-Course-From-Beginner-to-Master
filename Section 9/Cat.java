
public class Cat extends Animal implements IMovable {
    public Cat(String name, double weight) {
        super(name, weight);
    }
    
    @Override
    public String makeNoise() {
        return "Meow!";
    }

    @Override
    public String move() {
        return "I'm stalking you, waiting on my dinner!";
    }
}
