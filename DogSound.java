class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class DogSound {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Animal d = new Dog();
        d.makeSound();
    }
}
