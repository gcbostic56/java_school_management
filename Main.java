package student_management_system;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Cameron = new Teacher(1,"Cameron Bostic",550);
        Teacher Steve = new Teacher(2,"Steve Hamburger",7000);
        Teacher Gandalf = new Teacher(3,"Gandalf the Gay",60000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Cameron);
        teacherList.add(Steve);
        teacherList.add(Gandalf);


        Student Gimli = new Student(1,"Gimli",4);
        Student Yoda = new Student(2,"Yoda",12);
        Student Greg = new Student(3,"Lil Greg",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Gimli);
        studentList.add(Yoda);
        studentList.add(Greg);




        School newHighSchool = new School(teacherList,studentList);

        Teacher McChicken = new Teacher(6,"Ms. McChicken", 9000);

        newHighSchool.addTeachers(McChicken);


        Gimli.payFees(5000);
        Yoda.payFees(6000);
        System.out.println("Wizard High School has earned $"+ newHighSchool.getTotalMoneyEarned());

        System.out.println("aye yo pay yo bills");
        Cameron.receiveSalary(Cameron.getSalary());
        System.out.println("WHS has spent for salary to " + Cameron.getName()
        +" and now has $" + newHighSchool.getTotalMoneyEarned());

        Steve.receiveSalary(Steve.getSalary());
        System.out.println("WHS has spent for salary to " + Steve.getName()
                +" and now has $" + newHighSchool.getTotalMoneyEarned());


        System.out.println(Yoda);

        Gandalf.receiveSalary(Gandalf.getSalary());

        System.out.println(Gandalf);
    }
}
