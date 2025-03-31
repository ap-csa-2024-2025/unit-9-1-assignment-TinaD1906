/** Create an Employee class that extends the
 *  Person class.  An employee has a jobTitle,
 *  and a salary
 */
public class Employee extends Person
{
    /*Employee inherits these from person 
    private String name;
    private int age;
    */
    private String jobTitle;
    private int salary;
    public Employee(Sttring name, int age, String jobTitle, int salary)
    {
        super(name, age); // This calls Person(String,int)
        this.jobTitle = jobTitle;
        this.salary = salary; 
    }

    //Name:"John Doe", Age:0
    public Employee(String jobTitle,int salary)
    {
        super();
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    //Name:"John Doe", Age:0; Job Title: "Unemployed", Salary: 0
    public Employee()
    {
        super();
        this.jobTitle = "Unemployed";
        this.salary = 0;
    }
}