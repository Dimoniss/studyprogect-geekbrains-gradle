package javaPart1.sevenLesson;

public class Cat extends Animal implements Eat {


    public Cat(String name, int appetite) {
        super(name, appetite);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAppetite() {
        return super.getAppetite();
    }

    @Override
    public boolean isSatiety() {
        return super.isSatiety();
    }

    @Override
    public void setSatiety(boolean satiety) {
        super.setSatiety(satiety);
    }

    @Override
    public void eat(Plate plate) {
        if (plate.getFood() < getAppetite()) {
            System.out.println("Is not enough food in the plate (available: " + plate.getFood() +
                    ", appetite: " + getAppetite() + ")");
        } else {
            System.out.println("The cat ate food from the plate");
            plate.decreaseFood(getAppetite());
            setSatiety(true);
        }
    }
}
