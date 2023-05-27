package rectangle;
class Rectangle1
{
    private double width;
    private double height;
    Rectangle1()
    {
        width=1;
        height=1;
    }
    Rectangle1(int wid,int hei)
    {
        width=wid;
        height=hei;
    }
    double getArea()
    {
        return width*height;
    }
    double getPerimeter()
    {
        return (width+height)*2;
    }
} 
public class Rectangle {
    
    public static void main(String[] args) {
       Rectangle1 rec=new Rectangle1(5,5);
        System.out.println("The Area :"+rec.getArea());
        System.out.println("The Parameter :"+rec.getPerimeter());
    }
    
}
