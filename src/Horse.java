public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Horse() {
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Oats";
        this.color = "Brown";
    }

    public Horse(Horse other) {
        this.legs = other.legs;
        this.sound = other.sound;
        this.food = other.food;
        this.color = other.color;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    @Override
    public Animal clone() {
        return new Horse(this);
    }

    @Override
    public void makeSound() {
        System.out.println("Horse says: " + sound);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {  
        return color;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public String getFood() {
        return food;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public String getSound() {
        return sound;
    }

    @Override
    public String getType() {
        return "Horse";
    }

    @Override
    public String toString() {
        return "Horse{legs=" + legs + ", sound='" + sound + "', food='" + food + "', color='" + color + "'}";
    }
}
