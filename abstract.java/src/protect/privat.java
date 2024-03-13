package protect;

public class privat {
    public static void main(String[] args){

        First.Second s = new First.Second("Thangatamil", 'A', 22);
        System.out.println(s.display());
        System.out.println(s.display(2, 8.351F));
    }

    public static class First extends Object{ //(final) can not inherited // extends Object is inbuild class in java (cosmic super class)
        private String name; // only in the base class
        protected char lName; // usable for inherited classes
        public final int AGE; // anywhere // const variable (final)

        First(String N, char L, int A){
            this.name = N;
            this.lName = L;
            this.AGE = A;
        }

        String display(){
            return (this.name +"."+ this.lName + " " + this.AGE + "\n" + "Hello Java :) ! ");
        }


        String display(int a, float b){ // protected (only inherited drived class can accessable )
            return (a + "\n" + b);
        }

        public static class Second extends First {
            Second(String N, char L, int A){
                super(N, L, A);
            }

           final String display(){ //final (this is a finale method for display // can not override anymore)
               return ("Hello World!" );
           }

        }
    }
}
