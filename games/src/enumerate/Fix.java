package enumerate;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Fix {
    public static void main(String[] args){

        DayOfTheWeek dw = DayOfTheWeek.FRIDAY;

        System.out.println(dw + " : " +dw.getVal());

        for(DayOfTheWeek d : DayOfTheWeek.values()){
            System.out.println(d+ " : " +d.getVal());
        }

        Class cls = dw.getClass();
        System.out.println(cls);
        Method[] methods = cls.getMethods();

        for(Method m : methods){
            System.out.println(m.getName());
        }

    }
}
