public class Cat extends Animal {
    String name;
    static int countCat = 0;

    public Cat(String name) {
        super();
        countCat++;
        this.name = name;
    }

    @Override
    public void animalRun(int length) {
        if (length > 200) {
            System.out.println(name + " не может бежать больше 200 метров");
        } else {
            System.out.println(name + " пробежал " + length + " метров");
        }
    }

    @Override
    public void animalSwim(int length) {
        System.out.println("Не может плавать");
    }

    public static int getCountCat() {
        return countCat;
    }
}
