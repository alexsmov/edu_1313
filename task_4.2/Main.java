/*
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Dog должна быть переменная name с типом String.
•	У класса Dog должна быть переменная age с типом int.
•	У класса должен быть сеттер для переменной name.
•	У класса должен быть геттер для переменной name.
•	У класса должен быть сеттер для переменной age.
•	У класса должен быть геттер для переменной age.
*/


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Первая кличка: "+dog.getName()+" \nВозраст: "+dog.getAge());
        dog.setName("Полкан");
        dog.setAge(2);
        System.out.println("Вторая кличка: "+dog.getName()+" \nВозраст: "+dog.getAge());


    }
}

class Dog {
    //напишите тут ваш код
    private String name = "Мухтар";
    private int age = 1;
/*    Dog(String name, int age){ // если нет конструктора, то каждый новый dog всегда создается с первоначальными параметрами
        this.name = name;
        this.age = age;
   }*/

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
