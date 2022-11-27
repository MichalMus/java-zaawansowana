package ZadaniaJavaZaawansowanaPlik.OOP_Zadania.zd1.zd2;

public class Student extends Person {
    protected String typOfStudies;
    protected int yearOfStudy;
    protected float costOfStudies;

    public Student(String typOfStudies, int yearOfStudy, float costOfStudies) {
        super();
        this.typOfStudies = typOfStudies;
        this.yearOfStudy = yearOfStudy;
        this.costOfStudies = costOfStudies;
    }

    public String getTypOfStudies() {
        return typOfStudies;
    }

    public void setTypOfStudies(String typOfStudies) {
        this.typOfStudies = typOfStudies;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public float getCostOfStudies() {
        return costOfStudies;
    }

    public void setCostOfStudies(float costOfStudies) {
        this.costOfStudies = costOfStudies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "typOfStudies='" + typOfStudies + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", costOfStudies=" + costOfStudies +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

}
