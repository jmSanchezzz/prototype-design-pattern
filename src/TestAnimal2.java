public class TestAnimal2 {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Sheep sheep1 = (Sheep) registry.createSheep();
        sheep1.setName("Dolly");
        sheep1.setLegs(4);
        sheep1.setSound("Baa");
        sheep1.setFood("Clover");

        Sheep sheep2 = (Sheep) registry.createSheep();
        sheep2.setName("Molly");
        sheep2.setLegs(4);
        sheep2.setSound("Beee");
        sheep2.setFood("Alfalfa");

        Cow cow1 = (Cow) registry.createCow();
        cow1.setLegs(4);
        cow1.setSound("Moo");
        cow1.setFood("Hay");

        Cow cow2 = (Cow) registry.createCow();
        cow2.setLegs(4);
        cow2.setSound("Maa");
        cow2.setFood("Grass");

        Horse horse1 = (Horse) registry.createHorse();
        horse1.setLegs(4);
        horse1.setSound("Neigh");
        horse1.setFood("Oats");
        horse1.setColor("Black");

        Horse horse2 = (Horse) registry.createHorse();
        horse2.setLegs(4);
        horse2.setSound("Hiii");
        horse2.setFood("Carrots");
        horse2.setColor("Brown");

        System.out.println(sheep1.getType() + " named " + sheep1.getName());
        System.out.println(cow1.getType() + " sounds " + cow1.getSound() + "!");
        System.out.println(cow1.getType() + " eats " + cow1.getFood());
        System.out.println(horse1.getType() + " color is " + horse1.getColor());

        System.out.println(sheep2.getType() + " named " + sheep2.getName());
        System.out.println(cow2.getType() + " sounds " + cow2.getSound() + "!");
        System.out.println(cow2.getType() + " eats " + cow2.getFood());
        System.out.println(horse2.getType() + " color is " + horse2.getColor());
    }

}