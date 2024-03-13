package AnonymousCls;

public interface Anonymous {
    static void main(String[] agrs){

        Mainable m = new Mainable(){
            void first(){
                System.out.println("Hello Java");
            }
        };
        m.first();
    }

    //Mainable m1 = () -> System.out.println("lambda expression !")

    class Mainable{
        void first(){
            System.out.println("I am the first one");
        }
    }
}
