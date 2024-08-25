public class Animal {
    static int countAnimal = 0;

    public Animal() {
        countAnimal++;
    }

    public void animalRun(int length) {
        System.out.println("Животное пробежало " + length + " метров");
    }

    public void animalSwim(int length) {
        System.out.println("Животное проплыло " + length + " метров");
    }

    public static int getCountAnimal() {
        return countAnimal;
    }
}
