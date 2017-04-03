package sem2.chap6;

public class Exercise5 {
    private int monthNumber;

    public Exercise5() {
        monthNumber = 1;
    }
    public Exercise5(int monthNumber) {
        this.monthNumber = monthNumber;
    }
    public Exercise5(String monthName) {
        switch (monthName.toLowerCase()){
            case "january": monthNumber = 1; break;
            case "february": monthNumber = 2; break;
            case "march": monthNumber = 3; break;
            case "april": monthNumber = 4; break;
            case "may": monthNumber = 5; break;
            case "june": monthNumber = 6; break;
            case "july": monthNumber = 7; break;
            case "august": monthNumber = 8; break;
            case "september": monthNumber = 9; break;
            case "october": monthNumber = 10; break;
            case "november": monthNumber = 11; break;
            case "december": monthNumber = 12; break;
            default: monthNumber = 1;
        }
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;

        if (monthNumber < 1 || monthNumber > 12){
            this.monthNumber = 1;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }
    public String getMonthName(int monthNumber){
        String monthName;
        switch (monthNumber){
            case 1: monthName = "january"; break;
            case 2: monthName = "february"; break;
            case 3: monthName = "march"; break;
            case 4: monthName = "april"; break;
            case 5: monthName = "may"; break;
            case 6: monthName = "june"; break;
            case 7: monthName = "july"; break;
            case 8: monthName = "august"; break;
            case 9: monthName = "september"; break;
            case 10: monthName = "october"; break;
            case 11: monthName = "november"; break;
            case 12: monthName = "december"; break;
            default: monthName = "january";
        }
        return monthName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exercise5 exercise5 = (Exercise5) o;

        return getMonthNumber() == exercise5.getMonthNumber();
    }

    @Override
    public int hashCode() {
        return getMonthNumber();
    }
    public boolean greaterThan(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exercise5 exercise5 = (Exercise5) o;

        return getMonthNumber() < exercise5.getMonthNumber();
    }
    public boolean lessThan(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exercise5 exercise5 = (Exercise5) o;

        return getMonthNumber() > exercise5.getMonthNumber();
    }

    @Override
    public String toString() {
        return "Month name: " + getMonthName(monthNumber);
    }
}