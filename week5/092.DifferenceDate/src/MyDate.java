
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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
}
        
   