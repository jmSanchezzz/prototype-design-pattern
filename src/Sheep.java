public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep() {
        this.legs = 4;
        this.sound = "Baa";
        this.food = "Grass";
        this.name = "Unnamed Sheep";
    }

    public Sheep(Sheep other) {
        this.legs = other.legs;
        this.sound = other.sound;
        this.food = other.food;
        this.name = other.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    @Override
    public Animal clone() {
        return new Sheep(this);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
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
    public String toString() {
        return "Sheep{name='" + name + "', legs=" + legs + ", sound='" + sound + "', food='" + food + "'}";
    }
}
