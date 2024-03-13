package prime;

public class Is_prime {
    public static void main(String[] args){

        for (int val=1; val<=20; val++){
            if(new_prime(val)){
                System.out.println(val);
            }
        }
    }

    public static boolean new_prime(int n){
        if(n < 2){
            return false;
        }
        for(int i=2; i<= Math.sqrt(n)+1; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
