package ZadaniaJavaZaawansowanaPlik.OOP_Zadania.zd1.zd2;

public class Staff extends Person{
    protected String specjalization;
    protected float salary;

    public Staff(String specjalization, float salary) {

        this.specjalization = specjalization;
        this.salary = salary;
    }

    public String getSpecjalization() {
        return specjalization;
    }

    public void setSpecjalization(String specjalization) {
        this.specjalization = specjalization;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "specjalization='" + specjalization + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
