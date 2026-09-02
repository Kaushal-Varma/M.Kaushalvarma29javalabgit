abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }


    abstract void makeSound();
}


interface Flyable {
    void fly();
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says Woof!");
    }
}

class Bird extends Animal implements Flyable {

    Bird(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says Chirp!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}

class InterfaceAbstract {
    public static void main(String[] args) {

        Dog dog = new Dog("DOge");
        dog.eat();
        dog.makeSound();

        System.out.println();

        Bird bird = new Bird("eAgLe");
        bird.eat();
        bird.makeSound();
        bird.fly();
    }
}
