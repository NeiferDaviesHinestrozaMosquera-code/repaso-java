package variableThree;

public class VariableThree{
    public static void main(String[] args) {

        int day = 71;
        String NameDay ;

        switch(day){
            case 1:
                NameDay = "Monday";
                break;
            case 2:
                NameDay = "Tuesday";
                break;
            case 3:
                NameDay = "Wednesday";
                break;
            case 4:
                NameDay = "Thursday";
                break;
            case 5:
                NameDay = "Friday";
                break;
            case 6:
                NameDay = "Saturday";
                break;
            case 7:
                NameDay = "Sunday";
                break;
            default: 
                NameDay = "Invalidate";
                break;
        }
        System.out.println("The day is " + NameDay);

    }
}