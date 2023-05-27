
package Minutes_in_years_days;

public class Minutes_in_years_days {

    public static void main(String[] args) {
          int minutes=525600+60*24;
    int years=minutes/(60*24*365);
    int days =minutes/(60*24);
        System.out.println(minutes+" Minutes In Years = "+years+"\n"
                +"remaining minutes ="+minutes%525600
                +" :: In Days Equal = "
                +(minutes%525600)/(60*24));
        System.out.println(minutes+" Total Minutes In Days = "+days+"\n");//ToTal Minutes
    }
    
}
