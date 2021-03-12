package sixthLesson;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("boris", 5, "grey");
        Cat cat2 = new Cat("vasya", 1, "blue");
        Cat cat3 = new Cat("igor", 12, "red");

        System.out.println(cat1.run(111));
        System.out.println(cat2.swim(2));
        System.out.println(Cat.countCat);

        Dog dog1 = new Dog("valya", 2, "black");
        Dog dog2 = new Dog("katya", 3, "white");
        Dog dog3 = new Dog("olesya", 7, "green");
        Dog dog4 = new Dog("zoya", 4, "green");

        System.out.println(dog1.run(430));
        System.out.println(dog3.run(600));
        System.out.println(dog2.swim(22));
        System.out.println(Dog.countDog);
    }
}
