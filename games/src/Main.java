public class Main {
    public static void main(String[] args){

        int a = 6;

        for(int i=1; i<=a; i++){
            for(int j=i; j<=a; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i=a; i<=2 * a - 1; i++){
            for(int j=i; j<=a; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
