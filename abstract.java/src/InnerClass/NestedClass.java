package InnerClass;

public class NestedClass {
    public static void main(String[] args){

        Outer o = new Outer("Tamil");
        System.out.println(o.outerDisplay());


        Outer.Inner i = new Outer.Inner(50);
        System.out.println(i.innerDisplay());

    }

    public static class Outer{
        int a  = 1;
        Integer b = Integer.valueOf(2);
        String name;

        Outer(String N){
            this.name = N;
        }

        int outerDisplay(){
            return a + + b ;
        }

        public static class Inner{
            int counts;
            Inner(int C){
                this.counts = C;
            }

            int innerDisplay(){
                return this.counts;
            }
        }

    }

}
