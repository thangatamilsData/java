package StarPattern;

public class Pattern {
    public static void main(String[] args){

//        int x = 5;
//        int y = 2;
//        System.out.println(x/y);

            int a = 6;
            int b = 8;

            for(int i=0; i<a; i++){
                for(int j=0; j<b; j++){
                    if(i == 0 || i == a-1 || j == 0 || j == b-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();

            }

            for(int i=0; i<=a; i++){
                for(int j=0; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            for(int i=0; i<=a; i++){
                for(int j=0; j<=a; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            for(int i=0; i<=a; i++){
                for(int j=0; j<=a-i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            for(int i=0; i<=a; i++){
                for(int j=0; j<=a-i; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i=a-1; i>=0; i--){
                for(int j=0; j<=a-i; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }

