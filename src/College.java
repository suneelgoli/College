import java.util.Scanner;

class CollegeDetails
{
    public static void main(String []args)
    {
        College clg=new College();
        clg.process();
    }
}
class College
{
    Student student[]=new Student[50];
    int index=0;
    Scanner scanner=new Scanner(System.in);
    String cname;
    String caddress;
    void process()
    {
        while (true)
        {
            System.out.println("1.College Details");
            System.out.println("2.Student Details");
            System.out.println("3.Department Details");
            System.out.println("4.Library Details");
            System.out.println("5.Lecturer Details");
            System.out.println("6.Exit");
            System.out.println("Enter your choice");
            int input=scanner.nextInt();
            switch (input)
            {
                case 1:
                    college();
                    break;
                case 2:
                    student();
                    break;
                case 3:
                    department();
                    break;
                case 4:
                    library();
                    break;
                case 5:
                    lecture();
                    break;
                case 6:
                    exit1();
                    break;
            }
        }
    }
    void college()
    {
        while (true)
        {
            System.out.println("1.Add College Details");
            System.out.println("2.Show College Details");
            System.out.println("3.Back");
            System.out.println("Enter your choice");
            int ch=scanner.nextInt();
            switch (ch)
            {
                case 1:
                    addDetails();
                    break;
                case 2:
                    showDetails();
                    break;
                case 3:
                    back();
                    break;
            }
        }
    }
    void addDetails()
    {
        System.out.println("Enter College Name");
        cname=scanner.next();
        System.out.println("Enter the address");
        caddress=scanner.next();
    }
    void showDetails()
    {
        System.out.println("College: "+cname+","+caddress);
    }
    void back()
    {
        process();
    }
    void student()
    {
        setupSample();
        while (true)
        {
            System.out.println("1.addStudents");
            System.out.println("2.showStudent");
            System.out.println("3.modifyStudent");
            System.out.println("4.deleteStudent");
            System.out.println("5.back");
            System.out.println("Enter your choice");
            int ch=scanner.nextInt();
            switch (ch)
            {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudent();
                    break;
                case 3:
                    modifyStudent();
                    break;
                case 4:
                    deleteStduent();
                    break;
                case 5:
                    back();
                    break;
            }
        }
    }
    private void setupSample()
    {

        student[index++] = new Student(1,"Suneel","Nellore" );
        student[index++] = new Student(2,"Ashok","Allur" );
        student[index++] = new Student(3,"Sashi","Ongole" );
        student[index++] = new Student(4,"Venky","Allur" );
        student[index++] = new Student(5,"Harish","Kavali" );
        student[index++] = new Student(6,"Vamsi","Kavali" );
    }
    void addStudent()
    {
        Student std = new Student();
        System.out.println("Enter rollNumber :");
        std.rollno = scanner.nextInt();
        System.out.println("Enter name :");
        std.sname = scanner.next();
        System.out.println("Enter Address :");
        std.saddress=scanner.next();

        student[index] = std;
        index++;
    }
    void showStudent()
    {
        boolean found = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null) {
                student[i].print();
                found = true;
            }
        }
        if (!found)
            System.out.println("No Records found");
    }
    void modifyStudent()
    {
        System.out.println("Enter rollNumber :");
        int rollno = scanner.nextInt();
        for (int i = 0; i < student.length; i++)
        {
            if (student[i] != null) {
                if (student[i].rollno == rollno)
                {
                    System.out.println("Enter name :");
                    student[i].sname = scanner.next();
                    System.out.println("Enter Address :");
                    student[i].saddress = scanner.next();
                }
            }
        }
    }
    void deleteStduent()
    {
        System.out.println("Enter the Which element ");
        int rollno = scanner.nextInt();
        for (int i = 0; i < student.length; i++)
        {
            if (student[i] != null) {
                if (student[i].rollno == rollno)
                {
                    student[i] = null;
                }
            }
        }
    }
    void department()
    {

    }
    void library()
    {

    }
    void lecture()
    {

    }
    void exit1()
    {
        System.exit(0);
    }
}
class Department
{
    String dname;
    int deptid;

}
class Student
{
    int rollno;
    String sname;
    String saddress;
    void print()
    {
        System.out.println("Student RollNo:"+rollno);
        System.out.println("Student Name:"+sname);
        System.out.println("Student Address:"+saddress);
    }
    Student()
    {

    }
    Student(int rollno,String sname,String saddress)
    {
        this.rollno=rollno;
        this.sname=sname;
        this.saddress=saddress;
    }

}
class Library
{
    int libid;

}