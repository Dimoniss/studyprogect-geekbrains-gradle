package javaPart1.fifthLesson;

public class Main {
    public static void main(String[] args) {

        Staff[] staffList = new Staff[5];
        staffList[0] = new Staff("Vasili", "Ivanov", "Petrovich", "manager", 300.5, 34);
        staffList[1] = new Staff("Anatoly", "Pertov", "Ivanovich", "barman", 230.6, 65);
        staffList[2] = new Staff("Oksana", "Sidorov", "Anatolievic", "barman", 235.0, 32);
        staffList[3] = new Staff("Valera", "Seryh", "Evgenievich", "waiter", 230.5, 43);
        staffList[4] = new Staff("Petro", "Kvadrat", "Krygovich", "cleaner", 200.5, 40);

        for (Staff staff: staffList) {
            if (staff.getAge() >= 40)
                staff.showInfo();
        }
    }
}
