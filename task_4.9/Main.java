public class Main {
    public static void main(String[] args) {
        Person person0 = new Person("Мария", "Сидорова", 57, null, null);
        Person person1 = new Person("Олег", "Петров", 63, null, null);
        Person person2 = new Person("Федор", "Сидоров", 61, null, null);
        Person person3 = new Person("Клава", "Петрова", 59, null, null);
        Person person4 = new Person("Иван", "Иванов", 30, person3, person1);
        Person person5 = new Person("Ева", "Иванова", 30, person0, person2);
        Person person6 = new Person("Филипп", "Иванов", 7, person5, person4);
        person6.info();


    }
}

class Person {
    private String name;
    private String lastname;
    private int age;
    private int hp;
    private Person mother;
    private Person father;

    Person(String name, String lastname, int age, Person mother, Person father) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.hp = 100;
        this.mother = mother;
        this.father = father;
    }

    void sayHello(String name) {
        System.out.println("Привет, " + name + " меня зовут " + this.name);
    }

    public void info() {
        String info = "Меня зовут " + this.name + "\n";
            info += "Мою маму зовут " + this.getMother().name + "\n";
            info += "Моего дедушку по маминой линии зовут " + this.getMother().getFather().name + "\n";
            info += "Мою бабушку по маминой линии зовут " + this.getMother().getMother().name + "\n";
            info += "Моего папу зовут " + this.getFather().name + "\n";
            info += "Мою бабушку по папиной линии зовут " + this.getFather().getMother().name + "\n";
            info += "Моего дедушку по папиной линии зовут " + this.getFather().getFather().name + "\n";


        System.out.println(info);
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }
}
