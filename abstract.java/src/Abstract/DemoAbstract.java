package Abstract;

public class DemoAbstract {
    public static void main(String[] args){

        Demo f = new First();
        Demo s = new Second();

        Demo []  D = new Demo[3];
        D[0] = new Second();
        D[1] = new First();
        D[2] = new Second();


        for(Demo D1 : D){
            D1.fix();
        }

//        f.fix();
//        s.fix();

    }
}

abstract class Demo{
    abstract void fix();
}
class First extends Demo{
    void fix(){
        System.out.println("First!");
    }
}
class Second extends Demo{
    void fix(){
        System.out.println("Second::");
    }
}
