package student;
public class Student {
    private int id;
    private String firstname;
    private String lastname;
    void set_id(int num)
    {
        id=num;
    }
    int get_id()
    {
        return id;
    }
    void set_firstName(String str1)
    {
        firstname=str1;
    }
        String get_first_name()
    {
        return firstname;
    }
    
    void set_lastName(String str2)
    {
        lastname=str2;
    }
     String get_last_name()
    {
        return lastname;
    }
     String get_full_name()
     {
         return get_first_name()+" "+get_last_name();
     }
    
    
    public static void main(String[] args) {
        Student S=new Student();
        S.set_firstName("Adham");
        S.set_lastName("Elganzoury");
        S.set_id(2002);
        System.out.println("Your Full Name is : "+S.get_full_name());
    }
    
}
