package oop;
// encapsulation //private that work only in class itself even you can't access this by inheritence;
//Protected is used for inherited class that can allow acces to the variable
public class encap{

    public static void main(String[] args){

    First f = new First("Tamil", 22);
        f.display();
    }


    public static class First{
        private String name;
        protected int age;

        First(String N, int A){
            this.name = N;
            this.age = A;
        }

         void display(){
            System.out.println(this.name);
        }


    }

    public static class Next extends First{

        Next(String N, int A)
        {
            super(N, A);
        }

        void displa(){
            System.out.println();
        }
    }



}


