package enumeration;

public enum daysOfTheWeek {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    int n;

    daysOfTheWeek(int N){
        this.n = N;
    }

    int getVal(){
        return this.n;
    }
}
