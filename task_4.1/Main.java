/*
Помогите коту обрести имя с помощью метода setName.
Требования:
•	Класс Cat должен содержать только одну переменную name.
•	Переменная name должна иметь модификатор доступа private и тип String.
•	Метод setName класса Cat должен устанавливать значение переменной private String name равным переданному параметру String name.
*/


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        
    }
}

class Cat {
    private String name = "безымянный кот";

    public void setName(String name) {
        //напишите тут ваш код
        System.out.println("Был "+this.name+ ",");
        this.name = name;
        System.out.println("Подумали и решили назвать его - "+this.name);

    }
}
