package fifthLesson;

public class Staff {
    private String name, lastname, patronymic, position;
    private double salary;
    private int age;

    public Staff(String name, String lastname, String patronymic, String position, double salary, int age) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.position = position;
        this.salary = salary;
        this.age = age;
    }

    public void showInfo() {
        System.out.println( position + " " + lastname + " " + name + " " + patronymic + "\n" +
                            age + " year old, with salary " +  salary + " euro/mont");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
