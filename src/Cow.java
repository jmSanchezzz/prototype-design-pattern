public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow() {
        this.legs = 4;
        this.sound = "Moo";
        this.food = "Hay";
    }

    public Cow(Cow other) {
        this.legs = other.legs;
        this.sound = other.sound;
        this.food = other.food;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    @Override
    public Animal clone() {
        return new Cow(this);
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public String getSound() {
        return sound;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public String getFood() {
        return food;
    }   

    @Override
    public void makeSound() {
        System.out.println("Cow says: " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    @Override
    public String toString() {
        return "Cow{legs=" + legs + ", sound='" + sound + "', food='" + food + "'}";
    }
}
