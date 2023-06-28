package test03;

public class BirthdDay {
    private int day;
    private int month;
    private int year;
    private boolean isValid;

    public BirthdDay(){
        isValid=true;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(month==2){
            if(day>28){
                isValid=false;
            }
        }
        if(month==4 || month==6 || month==9 || month==11) {
            if(day>30) {
                isValid = false;
            }
        }else{
            if(day>31){
                isValid = false;
            }
        }
        if(day<1){
            isValid = false;
        }

        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month<1 || month>12) {
            isValid = false;
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<0) {
            isValid = false;
        }
        this.year = year;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public void printDay() {
        if(isValid) {
            System.out.println("날짜는 " + year + "년 " + month + "월 " + day + "일 입니다.");
        }else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
}
