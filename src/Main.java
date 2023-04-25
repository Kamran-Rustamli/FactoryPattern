public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        // create a Dog
        Animal dog = animalFactory.createAnimal("dog");
        dog.makeSound();

        // create a Cat
        Animal cat = animalFactory.createAnimal("cat");
        cat.makeSound();
    }
}