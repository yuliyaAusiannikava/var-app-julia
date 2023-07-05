package by.itstep.oop.inh;

public class Student extends Person {
    private double avg;
    private boolean hostel;

    public Student(int id, String name, String lastName, char gender, double avg, boolean hostel) {
        super(id, name, lastName, gender);
        this.avg = avg;
        this.hostel = hostel;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender=" + getGender() +
                ", avg=" + avg +
                ", hostel= " + hostel +
                '}';
    }

}
