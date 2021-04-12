/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity2;

/**
 *
 * @author B1LITE
 */
public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int themonth, int theday,int theyear){
        day=checkday(theday);
        month=checkmonth(themonth);
        year=theyear;
    }
    private int checkmonth(int testmonth){
        if(testmonth>0&&testmonth<=12)
            return testmonth;
        else{
            System.out.println("Invalid month "+testmonth+" Set to 1");
            return 1;
        }
    }
    private int checkday(int testday){
        int daysofmonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(testday>0&&testday<=daysofmonth[month])
            return testday;
        else 
            if(month == 2&&testday ==29&&(year%400==0||(year%4==0&&year%100!=0)))
            return testday;
        else{
            System.out.println("Invalid date "+testday+" set to 1");
        return 1;
            }
       }
    public int getDay()
{ 
return day;
}
public int getMonth()
{
return month;
}
public int getYear()
{
return year;
}
public void display(){
    System.out.println(day+" "+month+" "+year);
}

    
}

