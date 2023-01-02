abstract class Animal{
    int run_distance;
    float jump_height;
    int swim_distance;
    public void run(int new_distance) {
        System.out.println("Result: Run - " + (new_distance <= run_distance));
    }
    public void jump(int new_height) {
        System.out.println("Result: Jump - " + (new_height <= jump_height));
    }
    public void swim(int new_distance) {
        System.out.println("Result: Swim - " + (new_distance <= swim_distance));
    }

    public Animal(){};
    public Animal(int run_distance, float jump_height, int swim_distance) {
        this.run_distance = run_distance;
        this.jump_height = jump_height;
        this.swim_distance = swim_distance;
    }
}


class Cat extends Animal{
    public Cat() {
        run_distance = 200;
        jump_height = 2;
    }

    public Cat(int run_distance, float jump_height, int swim_distance){
        super(run_distance, jump_height, swim_distance);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats cannot swim!");
    }
}

class Dog extends Animal {
    public Dog() {
        run_distance = 200;
        jump_height = 0.5f;
        swim_distance = 10;
    }

    public Dog(int run_distance, float jump_height, int swim_distance) {
        super(run_distance, jump_height, swim_distance);
    }
}
public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Animal dog1 = new Dog();
        Animal dog2 = new Dog(200, 0.5f, 15);
        cat1.swim(150);
        dog1.swim(11);
        dog2.swim(11);
    }
}