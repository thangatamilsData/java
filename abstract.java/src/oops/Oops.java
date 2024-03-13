package oops;

public class Oops{
    public static void main(String[] args){

        Next m = new Next("Thangatamil", 'A', (byte) 22);
        System.out.println(m.display(2, 3));
        System.out.println(m.display());

        System.out.println(m.dis());

        System.out.println(m.display(2.0, 5.2));
    }

    public static class Main{
        private String name; //Encapsulation
        char lName;
        byte age;

        Main(String N, char L, byte A){
            this.name = N;
            this.lName = L;
            this.age = A;
        }

        String display(){
            return (this.name + " "+ this.lName +"\n"+ this.age);
        }
    }

    public static class Next extends Main{ //Inheritence
        Next(String N, char L, byte A){
            super(N, L, A);
        }

        int display(int a, int b){ // Polymorphism Method overloading
            return (a + b);
        }

        double display(double a, double b){ // overloading
            return (a - b);
        }

        String dis(){
            //return this.name;
            return this.age + " Hello Java !! :)";
        }

    }
}
