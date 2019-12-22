public class Client {
    String name;
    String surname;
    long pesel;
    int age;
    char sex;

    void printClient() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(pesel);
        System.out.println(age);
        System.out.println(sex);
        System.out.println("................");
    }

    String checkAge() {
        if (age > 70) {
            return "Stary";
        } else {
            return "Młody";
        }
    }

    void printWiek() {
        System.out.println(checkAge());
    }
}

