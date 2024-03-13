package MultiTheading;

public class Theading{
    public static void main(String[] args){
        First f = new First();
        f.start();
        Second s = new Second();
        s.display();

        Second s1 = new Second(){ //Anonymous class //
            void display() {
                System.out.println("Hello anonymous ");;
            }
        };
        s1.display();

//        Second s2 = () -> System.out.println("lambda expression !"); // it doesn't work in our laptop :(
//        s2.display();

        third t = new third();
        t.start();


    }

    static class First extends Thread{
        public void run(){
            try{
                for(int i=0; i<=10; i++){
                    if(i%2 == 0){
                        System.out.println(i + " from first");;
                        Thread.sleep(2000);
                    }
                }
            }catch(InterruptedException e){}
        }

    }
    static class Second {
        void display(){
            try{
                for(int i=1; i<=10; i++){
                    if(i%3 == 0){
                        System.out.println(i + " hi");
                        Thread.sleep(3000);
                    }
                }
            }catch(InterruptedException e){}
        }
    }

    static class third extends Thread{
        public void run(){
            try{
                for(int i=11; i<=15; i++){
                    System.out.println(i + " from third ");
                    Thread.sleep(3000);
                }
            }catch(InterruptedException e){}
        }

    }
}