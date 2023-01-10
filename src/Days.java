public enum Days {
    MONDAY("Zoom"),
    TUESDAY("practice"),
    WEDNESDAY("zoom"),
    THURSDAY("practice"),
    FRIDAY("zoom"),
    SATURDAY("football"),
    SUNDAY("holiday");
    private final String days;
    Days (String days){
        this.days=days;
    }
    public String getDays(){
        return days;
    }
}
