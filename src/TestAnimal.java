public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep = registry.createSheep();
        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();

        ((Sheep) sheep).setName("Dolly");
        Animal sheep2 = registry.createSheep();
        ((Sheep) sheep2).setName("Molly");

        System.out.println(sheep.getType() + ": named: " + ((Sheep) sheep).getName());
        System.out.println(sheep2.getType() + ": named: " + ((Sheep) sheep2).getName());

        Animal cow2 = registry.createCow();
        ((Cow) cow2).setFood("Grass");
        System.out.println(cow2.getType() + "eats " + ((Cow) cow2).getFood());

        System.out.println();
        sheep.makeSound();
        sheep2.makeSound();
        cow.makeSound();
        horse.makeSound();
    }
}
