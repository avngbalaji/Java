class Student
{
    public String name;
    public int roll_no;

    Student(String name,int roll_no)
    {
        this.name=name;
        this.roll_no=roll_no;
    }

    void print()
    {
        System.out.println("Name    : "+name);
        System.out.println("Roll no : "+roll_no);
        System.out.println("---------------------------------");
    }
}

public class array_objects
{
    public static void main(String[] args)
    {
        Student s = new Student("Surya",45);
        s.print();
        Student s1 = new Student("Balaji",13);
        s1.print();

        //array of objects
        Student[] o = new Student[3];
        o[0] = new Student("Muthu",1);
        o[1] = new Student("Jack",2);
        o[2] = new Student("Deepak",3);

        for (int i=0; i<o.length; i++)
            o[i].print();
    }
}
