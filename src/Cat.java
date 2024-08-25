public class Cat extends Animal {
    String name;
    private static int countCat = 0;
    private boolean isFed = false;

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

    public void eat(int foodAmount, int foodLeft){
        if (foodAmount <= foodLeft){
            System.out.println("Кот покушал " + foodAmount + " единиц еды");
            isFed = true;
        } else {
            System.out.println("В миске недостаточно еды");
        }
    }

    public boolean isFed(){
        return false;
    }

    public static int getCountCat() {
        return countCat;
    }
}
