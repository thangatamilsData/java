package Enumerate;

import java.lang.reflect.Method;

public class enumMain {
    public static void main(String[] args){

        WeekOfDay dw = WeekOfDay.MONDAY;
        System.out.println(dw +" "+ dw.getVal());

        for(WeekOfDay d : WeekOfDay.values()){
            System.out.println(d + " " + d.getVal());
        }

        //Reflection//
        Class cls = dw.getClass();
        System.out.println(cls);

        Method[] methods = cls.getMethods();
        for(Method m : methods){
            System.out.println(m.getName());
        }
    }
}
