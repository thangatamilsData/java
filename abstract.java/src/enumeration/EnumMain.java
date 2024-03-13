package enumeration;

import java.lang.reflect.Method;

public class EnumMain {
    public static void main(String[] args){

        daysOfTheWeek dw = daysOfTheWeek.MONDAY; //No new objects for enum
        System.out.println(dw+ " " +dw.getVal());

        //Reflection
        Class cls = dw.getClass();
        System.out.println(cls.getName());
        Method[] methods = cls.getMethods();
        for(Method m : methods){
            System.out.println(m.getName());
        }
        //Reflection0

        for(daysOfTheWeek d : daysOfTheWeek.values()){
            System.out.println(d + " " + d.getVal());
        }
    }
}
