
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {
        if (this.earlier(comparedDate)) {
            return this.yearCounter(this, comparedDate);
        } else {
            return this.yearCounter(comparedDate, this);
        }
        //return Math.abs(this.year - comparedDate.year);
    }

    public boolean isEqual(MyDate comparedDate) {
        return (this.day == comparedDate.day
                && this.month == comparedDate.month
                && this.year == comparedDate.year);
    }

    public int yearCounter(MyDate smallDate1, MyDate bigDate2) {
            int countTag = smallDate1.day;
            int countMon = smallDate1.month;
            int countJah = smallDate1.year;

            int zähler = 0;
            MyDate tmp = new MyDate(countTag, countMon, countJah);
            while (!tmp.isEqual(bigDate2)) {
                ++zähler;
                ++tmp.day;
                if (tmp.day == 31) {
                    tmp.day = 1;
                    ++tmp.month;
                    if (tmp.month == 13) {
                        tmp.month = 1;
                        ++tmp.year;

                    }

                }
            }
            return zähler / 360;
    }
    
    public int yearCounter(MyDate current) {
        int birthDay = this.day;
        int birthMonth = this.month;
        int birthYear = this.year;
        //aktuelles Geburtsjahr der Person, als neues Objekt
        MyDate myBirthDay = new MyDate(birthDay, birthMonth, birthYear);
        int zaehler = 0;
        while (!myBirthDay.isEqual(current)) {
             ++zaehler;
                ++myBirthDay.day;
                if (myBirthDay.day == 31) {
                    myBirthDay.day = 1;
                    ++myBirthDay.month;
                    if (myBirthDay.month == 13) {
                        myBirthDay.month = 1;
                        ++myBirthDay.year;

                    }

                }
        }
        return 0;
    }

  
}
