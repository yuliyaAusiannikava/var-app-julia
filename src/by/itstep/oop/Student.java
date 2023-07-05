package by.itstep.oop;

public class Student {
    private String name;
    public double avg;

    //has a relationship - отношение "у студента есть университет"
    private University university;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}

class University {
    private String name;
    private String location;
    private int numberOfStudents;
    //has a relationship - отношение "у университета есть учитель"
    private Teacher[] teachers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}

class Teacher {
    private String name;
    private int exp;
    private long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}

class Test{
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("John");
        t1.setSalary(2000);
        t1.setExp(5);

        Teacher t2 = new Teacher();
        t2.setName("Mike");
        t2.setSalary(3500);
        t2.setExp(7);

        Teacher[] teachers = {t1, t2};

        University university = new University();
        university.setLocation("BLR, P.BROVKI 123");
        university.setName("BSUIR");
        university.setNumberOfStudents(1500);
        university.setTeachers(teachers);

        Student student = new Student();
        student.setName("Ivan");
        student.setAvg(9.5);
        student.setUniversity(university);
    }
}