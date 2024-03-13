package delInterface;

import com.sun.security.jgss.GSSUtil;

public class demoInter { //
    public static void main(String[] args){
        Bike d = new Duke();
        d.name();
        System.out.println(d.display(2, "hello"));

        Bike v = new v4();
        v.name();
        System.out.println(Duke.display('A', 12));
        System.out.println(v4.display(7, 'V'));

    }


    interface Bike { // no constructor in interface

        void name();

        String [] bikeName = {"R15 v4", "Duke"};
        int totalCount = 20;
        byte n = 1;

        default String display(int x, String y){
            return (x + " : "+ y);
        }
    }

    static class v4 implements Bike{
        public void name() {
            System.out.println(bikeName[0] + "Red colour have count of " + n );
        }

        static int display(int a, char b){
            return (a + b);
        }
    }

    static class Duke implements Bike{
        @Override
        public void name() {
            System.out.println("this is from Duke class!");
        }

        static int display(char m, int n){
            return (m + n);
        }
    }

}
