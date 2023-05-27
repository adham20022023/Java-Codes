package circule_calss;
public class Circule_calss {
        double radius;
    Circule_calss(double v)
    {
        radius=v;
    }
    void getnewradius(double x)
    {
        radius=x;
    }
    double get_area()
    {
        return 2*3.14*radius;
    }
    public static void main(String[] args) {
        
        Circule_calss c=new Circule_calss(1);
         c.getnewradius(5.0);
        System.out.println("THe area of Circle is "+c.get_area());
    }
}


