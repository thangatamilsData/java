package interfaces;

public  class bike {
    public static void main(String[] args){

        bikes b = new duke();
        b.name();
    }
}

interface bikes{
    void name();
    int count = 1;

}

class duke implements bikes{
    public void name(){
        System.out.println("Duke !"+ count);

    }
}

class pulsar extends duke implements bikes{
    public void name(){
        System.out.println("pulsar !");
    }
}



