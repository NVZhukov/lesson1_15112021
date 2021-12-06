package lesson_5;

public class Main {
    public static void main(String[] args) {

        Employee[] persArr = new Employee[5];

        persArr[0] = new Employee("Ivan Ivanovich", "cleaner", "ivan@mail.ru",
                880020010, 1500, 56);
        persArr[1] = new Employee("Sergey Sergeevich", "manager", "sergey1983@gmail.com",
                880015555, 4500, 38);
        persArr[2] = new Employee("Nikolay Nikolaevich", "seller", "nikolayN@gmail.com",
                880022245, 5000, 43);
        persArr[3] = new Employee("San Sanych", "designer", "alexander25@gmail.com",
                880049985, 5500, 29);
        persArr[4] = new Employee("Dmitriy Dmitrievich", "director", "ddd@inbox.com",
                880080080, 9000, 44);

        for (int i = 0; i < persArr.length; i++) {
            if (persArr[i].getAge() > 40) {
                persArr[i].infoPrint();
            }
        }
    }
}
