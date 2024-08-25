public class Dog extends Animal {
    String name;
    static int countDog = 0;

    public Dog(String name) {
        super();
        countDog++;
        this.name = name;
    }

    @Override
    public void animalRun(int length) {
        if (length > 500) {
            System.out.println(name + " не может бежать больше 500 метров");
        } else {
            System.out.println(name + " пробежал " + length + " метров");
        }
    }

    @Override
    public void animalSwim(int length) {
        if (length > 10) {
            System.out.println("Собака не может плыть больше " + length + " метров");
        } else {
            System.out.println(name + " проплыл " + length + " метров");
        }
    }

    public static int getCountDog() {
        return countDog;
    }
}
