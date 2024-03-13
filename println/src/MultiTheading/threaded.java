package MultiTheading;

public class threaded {
    public static void main(String[] args){
        First f = new First();
        f.start();
        System.out.println(f.display(10, "JAVA"));

        Second s = new Second();
        s.start();
        try {
            Thread.sleep(10000);
            System.out.println(s.display(5, 2.6988F));
        }catch (InterruptedException e){}

        Third t = new Third();
        t.fix();
    }

    static class First extends Thread{
        public void run(){
            try {
                Thread.sleep(8000);
                System.out.println("first thread");
            }catch(InterruptedException e){}
        }

        String display(int x, String y){
            return (x +" : "+y);
        }
    }

    static class Second extends Thread{
        public void run(){
            try{
                Thread.sleep(4000);
                System.out.println("Thread from second !");
            }catch(InterruptedException e){}
        }
        String display(int a, float b){
            return (a +" : "+ b);
        }
    }

    static class Third extends Thread{
        void fix(){
            try{
                Thread.sleep(15000);
                System.out.println("Thirdiee");
            }catch(InterruptedException e){}
        }
    }
}
