package ZadaniaJavaZaawansowanaPlik.TypWyliczeniowy.zd1;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay(){
        return this != SATURDAY || this != SUNDAY;
    }

    public boolean isHoliday(){
        return this == SATURDAY || this == SUNDAY;
    }

    public void whichIsGreater(Weekday weekday){
        if (this.compareTo(weekday) > 0) {
            System.out.println("After " + weekday);

        } else {
            System.out.println("Before " + weekday);

        }

    }
}
