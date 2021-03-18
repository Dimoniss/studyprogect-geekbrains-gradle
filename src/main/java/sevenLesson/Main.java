package sevenLesson;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 15),
                      new Cat("Bober", 10),
                      new Cat("Ben", 12),
                      new Cat("Jesika", 14),
                      new Cat("Kefir", 22)};

        Plate plate = new Plate(50);
        plate.info();

        for (int i = 0; i < cats.length; i++) {
            System.out.println();
            System.out.println(cats[i].getName() + " is satiety :" + cats[i].isSatiety());
            cats[i].eat(plate);
            plate.info();
            System.out.println(cats[i].getName() + " is satiety :" + cats[i].isSatiety());
            System.out.println();
        }

        plate.addFood(30);
        plate.info();

    }
}
