public class Main {
    public static void main(String[] args){
        letter l = new Last();
        letter n = new Next();
        l.callMessage();
        n.callMessage();

        letter arr [] = new letter[3];

//        arr [0] = n.callMessage();
    }

     abstract static class letter{//Abstraction...
        private String name;
        abstract void callMessage();
    }
    static class Next extends letter{
        void callMessage(){
            System.out.println("Hello Java!");
        }
    }

   static class Last extends letter{
        void callMessage(){
            System.out.println("Hello tamil :)");
        }
    }
}