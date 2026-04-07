public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        this.sheepPrototype = new Sheep();
        this.cowPrototype = new Cow();
        this.horsePrototype = new Horse();
    }

    public Animal createSheep() {
   
        return sheepPrototype.clone();
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}
