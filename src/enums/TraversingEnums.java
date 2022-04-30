package enums;

public class TraversingEnums { //traverse = loop
    public static void main(String[] args) {

        for (Day day : Day.values()) { //Have to use FOR each
            System.out.println(day);
        }

        for (Constants.Months month : Constants.Months.values()){
            System.out.println(month);
        }
    }
}
