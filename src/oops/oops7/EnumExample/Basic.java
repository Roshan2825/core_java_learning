package oops.oops7.EnumExample;
public class Basic{
    enum Week{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
        //these are enum constants
        //defaultly public static final Week 
        //since3 final cant create child enums
        //type is week

        Week(){
            System.out.println("constructor called for" +this);
        }
    }
    public static void main(String[] args){
        Week week=Week.MONDAY;
        System.out.println(week);
        // for(Week day:Week.values()){
        //     System.out.println(day);
        // }
        System.out.println(week.ordinal());//position
        
    }
}