public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        Cat snezok = new Cat("Snezok");
        Dog sharik = new Dog("Sharik");
        Cat snezok1 = new Cat("Snezok");
        Dog sharik1 = new Dog("Sharik");

        snezok.animalRun(205);
        snezok.animalRun(125);

        sharik.animalRun(250);
        sharik.animalRun(505);

        snezok.animalSwim(123);

        sharik.animalSwim(15);
        sharik.animalSwim(7);

        System.out.println("Всего животных: " + Animal.getCountAnimal());
        System.out.println("Всего котов: " + Cat.getCountCat());
        System.out.println("Всего собак: " + Dog.getCountDog());
    }
}