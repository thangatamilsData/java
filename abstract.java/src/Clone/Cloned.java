package Clone;
import java.util.*;

class Cloned{
    public static void main(String[] args) throws CloneNotSupportedException{

        First f = new First();
        System.out.println(f.display(50, "java"));
        f.dis();

        First f1 = (First) f.clone();
        System.out.println(f1.display(10, "Java!"));
        f1.dis();

    }

    static class First implements Cloneable{
        String display(int x, String y){
            return (x + " " + y);
        }

        void dis(){
            System.out.println("hello Java! Your always awesome and I'm gonna make in name of indian people...");
        }

        public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }



    }
}
