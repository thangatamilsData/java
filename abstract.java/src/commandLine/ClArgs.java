package commandLine;

public class ClArgs {// command line argument
    public static void main(String[] args){

        for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }

        System.out.println(form(10, 3, 5));
    }
    static int form(int... val){
        int max = Integer.MIN_VALUE;
        for(int v:val){
            if(v>max){
                max = v;
            }
        }
        return max;
    }
}
