package Access;

public class Stack {

    private String [] arr = new String[10];
    int tos;

    Stack(){
        tos = -1;
    }

    void push(String item){
        if(tos == 9){
            System.out.println("Stack is full");
        }else{
            arr[++tos] = item;
        }

    }

    String pop(){
        if(tos <= 0){
            return ("Stack is empty");
        }
        return arr[tos--];
    }

}
