package Enumerate;

public enum WeekOfDay {

    MONDAY(1),TUESDADY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);

    int n;

    WeekOfDay(int N){
        this.n = N;
    }
    int getVal(){
        return this.n;
    }
}
