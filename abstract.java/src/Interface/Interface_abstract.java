package Interface;

public interface Interface_abstract {
    public static void main(String[] args){
        First f = new First();
        f.name();
        f.fix();

        second s = new second(); // Interfaces more like Abstraction but it allows Multiple Inheritence;
        s.name();
        s.nam();
        s.fix();
    }
    void name();
    default void fix(){
        System.out.println("Hello Java You are the Hero !");
    }


}

class First implements Interface_abstract{
    public void name(){
        System.out.println("hello");
    }

}

class second extends First implements Interface_abstract{
    public void nam(){
        System.out.println("It's interfaces bruh! ");
    }
}
