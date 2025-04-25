package Students;

public class Student {
    private String name;
    private  int ID;
    private Double grade;

    public Student(String name, int ID, Double grade) {
        this.name = name;
        this.ID = ID;
        this.grade = grade;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
    public String toString () {
        return
                "name:  " + name + '\n' +
                "ID:    " + ID + "\n \n" +
                "grade: " + grade ;
    }
}
