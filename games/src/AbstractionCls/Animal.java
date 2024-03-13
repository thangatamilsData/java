package AbstractionCls;

public abstract class Animal {
    public static void main(String[] args){
        Animal a = new Dog(5);
        Animal b = new Cat(55);

        a.name();
        b.name();

        System.out.println(Dog.display(2, "from dog"));
        System.out.println(Cat.display(5, "from cat"));
    }
    abstract void name();

    int count;
    Animal(int c){
        this.count = c;
    }
}

class Dog extends Animal{
    Dog(int c){
        super(c);
    }

    void name() {
        System.out.println("this is DOG :)" + this.count);
    }
    static String display(int a, String b){
        return (a + b);
    }
}

class Cat extends Animal{
    Cat(int c){
        super(c);
    }
    void name(){
        System.out.println("This is Cat !");
    }

    static String display(int a, String b){
        return (a + b);
    }
}
