# Prototype Design Pattern (Java)

Small Java example of the Prototype pattern using animals.

## What It Shows

- Cloning objects from prototypes through `AnimalRegistry`
- Creating multiple independent instances (`Sheep`, `Cow`, `Horse`)
- Customizing each clone with setters (`name`, `sound`, `food`, `color`)

## Project Structure

- `src/Animal.java` - common interface (`clone`, `makeSound`, `getType`)
- `src/Sheep.java` - concrete prototype with `name`, `sound`, `food`, `legs`
- `src/Cow.java` - concrete prototype with `sound`, `food`, `legs`
- `src/Horse.java` - concrete prototype with `sound`, `food`, `color`, `legs`
- `src/AnimalRegistry.java` - stores prototypes and creates clones
- `src/TestAnimal.java` - basic usage example
- `src/TestAnimal2.java` - extended example with 2 instances per animal

## Run

```bash
javac src/*.java
java -cp src TestAnimal2
```

You can also run:

```bash
java -cp src TestAnimal
```

## UML Diagram
<img width="1292" height="589" alt="image" src="https://github.com/user-attachments/assets/20c7827e-b40e-481d-acae-ed7595f61e7b" />
