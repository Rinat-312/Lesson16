public class Test {
    public static void main(String[] args) {

//        Animal animal = new Animal();
//        boolean result = animal instanceof Animal;
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//
//        voice(new Animal());
//        voice(dog);
//        voice(new Cat());

        Dog dog = new Dog();
        Animal animal = new Dog();
        Object object = new Dog();


        Dog[] dogs = {dog, (Dog) animal, (Dog) object};


        String word = "1123";
        System.out.println(word.getClass());

    }

    public static void voice(Animal animal) {
        animal.eat();
        animal.run();

    }
}



