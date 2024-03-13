import java.util.Arrays;
import java.util.Scanner;


//public class Main{
//    public static void main(String[] args){
//        System.out.println("Hello world");
//
//        //integers
//        byte Ib = 52;
//        short Is = 3543;
//        int i = 1568465165;
//        long Li = 8461384135463516546L;
//
//        //float values
//        float Fl= 2.3535F;
//        double Df = 2.53413431316;
//
//        //string
//        char Ch = 'T';
//        String x = "Tamil";
//
//        //boolean's
//        boolean tof = true;
//
//
//        System.out.println(i +" " +x);
//        System.out.println(Ib);
//        System.out.println(Is);
//        System.out.println(Fl);
//        System.out.println(Df);
//        System.out.println(Li);
//        System.out.println(Ch);
//        System.out.println(tof);
//        System.out.println("Yep this is working perfectly !");
//
//        //Date
//        LocalDate date = LocalDate.now();
//        System.out.println(date);
//
//    }
//}

public class Main{
    public static void main(String[] args){
        System.out.println((int) Math.floor(Math.random()*10));
        int max = Math.max(10, 20);
        System.out.println(max);

        System.out.println((int)Math.sqrt(50));

        int age = 17;
        if (18 > age){
            System.out.println("your are " + age + " " + "you need one more year" + " " + "for this");
        }else {
            System.out.println("You Can do this");
        }

        String a = "Chennai";

        switch (a){
            case "Chennai":
                System.out.println(a + " " +"Kind of differ from after place!" +" "+ " || Switch case is an alternative for if else condition");
                break;
            case "Bengaluru":
                System.out.println("Bengaluru");
                break;
            default:
                System.out.println("Yeab it's working");
        }

        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        String [] strArr = new String[3];
        strArr[0] = "thangam";
        strArr[1] = "tamil";
        strArr[2] = "Java";

        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(arr));


        int [] newArr = {2, 3, 45};
        String [] str = {"Hi", "thangatamil"};

        int fix = newArr[1];

        System.out.println(fix);

        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(newArr));

        for(int i=0; i<=10; i++){
            System.out.println(i);
        }

        int num = 1;
        while(num <= 10){
            System.out.println(num);
            num++;
        }

        int nums = 5;
        do{
            nums +=1;
            System.out.println(nums);

        }while (nums <= 9);

        int [] array = {1414, 3, 5, 6, 880};

        for(int arrays : array ){
            System.out.println(arrays);
        }

        String [] newArray = {"Hello", "tamil", "Thangam", "World"};

        for(String fixs : newArray){
            if(fixs.equals("Thangam")){
                continue;
            }
            System.out.println(fixs);
        }

        for (int n=0; n<newArray.length; n++){
            System.out.println((newArray[n])+ " "+ n);
        }

        for(String loop : newArray){
            System.out.println(loop);
        }


        //input from the user

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value :");
        int newScan = scan.nextInt();

        System.out.println("The input value is "+newScan);

        int inputVal = newScan + 5;
        System.out.println(inputVal);


        Scanner tamil = new Scanner(System.in);
        System.out.println("Enter your name :");
        String newTamil = tamil.nextLine();

        System.out.println(newTamil);


        char [] vle = {'A', 'B', 'B', 'C', 'C', 'C', 'D', };

        System.out.println("Letter count is :" + helloFix(vle, 'B'));

        fixMe newFixMe = new fixMe("Tamil", 2, "IT");

    }

    public static int helloFix(char [] msg, char searchL){
        int count = 0;
        for(char i : msg){
            if(i == searchL){
                count +=1;
            }

        }
        return count;


    }

    public static class fixMe {
        String name;
        int age;
        String work;

        public fixMe(String N, int A, String W) {
            this.name = N;
            this.age = A;
            this.work = W;
        }


    }


}
