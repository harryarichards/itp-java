
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private int age;
    private String address;
    
    
    public Person(String name, int age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public String toString(){
        return  "Member name: " + name + "          Member age: " + age + " years old";
    }
    
    
    
    
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getAddress() {
        return address;
    }
}
