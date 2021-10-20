/*
Задача вывести на экран такое сообщение (для объекта gosha):
Меня зовут "имя объекта"
Имя моей мамы: "имя мамы"
Имя моего папы: "имя папы"
У меня две бабушки, бабушка "имя бабушки" и "имя бабушки"
У меня два деда, деда "имя деда" и "имя деда"
*/

public class Main {
    public static void main(String[] args) {
        Person valera=new Person("Валера","Иванов",69,null,null);
        Person olga = new Person("Ольга","Иванова",67,null,null);
        Person oleg = new Person("Олег","Петров",65,null,null);
        Person jula = new Person("Юля","Петрова",67,null,null);
        Person alex = new Person("Алексей","Иванов",37,olga,valera);
        Person eva  = new Person("Ева","Иванова",37,jula,oleg);
        Person gosha= new Person("Гоша","Иванов",10,eva,alex);
        gosha.info();

    }
}

class Person{
    private String name;
    private String lastname;
    private int age;
    private int hp = 100;
    private Person mother;
    private Person father;
    public Person(String name, String lastname, int age, Person mother, Person father){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mother = mother;
        this.father = father;
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
