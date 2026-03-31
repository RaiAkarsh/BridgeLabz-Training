class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
public class Mammal {
    public static void main(String[] args) {
        Animal [] animals = {new Dog("Buddy", 3),
        new Cat("Whiskers", 2),
        new Bird("Tweety", 1)};

        for (Animal a : animals) {
            System.out.print(a.name +" of age " + a.age + " says: ");
            a.makeSound();
        }
    }
}