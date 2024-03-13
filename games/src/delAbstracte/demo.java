package delAbstracte;

public  class demo {
    public static void main(String[] args) {

        Animal C = new Cat(5, "Cat");
        C.AnimalName();
        // concept is here ?? is you assign in main Abstracte class you can call this by new object name
        System.out.println(C.display(10, "Tamil"));

        //?? overriding the overloading with a original class name :)
        System.out.println(Cat.display(20, "concept finded"));


        C.display();

        Animal M = new Mouse(10, "Mouse");
        M.AnimalName();

        //if you assign the method in sub class you have call it like with original class name//
        System.out.println(Mouse.AnimalName(2, 2.06153));

        C.display();


    }
}


abstract class Animal{
    abstract void AnimalName();

    int count;
    protected String name;

    Animal(int C, String N){
        this.count = C;
        this.name = N;
    }

    void display(){
        System.out.println("Hello mf");
    }

    static String display(int a, String b){
        return (a + " : "+ b);
    }
}

class Cat extends Animal{
    Cat(int C, String N){
        super(C, N);
    }

    void AnimalName() {
        System.out.println("the Animal is "+ this.name + " and the count is "+ this.count);
    }

    static String display(int a, String b){
        return (a + " : "+ b);
    }

    void display(){
        System.out.println("Hll");
    }
}

class Mouse extends Animal{
    Mouse(int C, String N){
        super(C, N);
    }

    void AnimalName() {
        System.out.println("this is " +this.name +" MF's :: !! and the count is " + this.count);
    }

    static double AnimalName(int x, double y){
        return (double)(x + y);
    }
}
