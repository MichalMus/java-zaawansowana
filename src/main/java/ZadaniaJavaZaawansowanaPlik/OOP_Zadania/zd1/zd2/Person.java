package ZadaniaJavaZaawansowanaPlik.OOP_Zadania.zd1.zd2;

public class Person {
    protected String name, adress;

    public Person() {
        this.name = "";
        this.adress = "";
    }
    public Person (String name, String adress){
        this.name=name;
        this.adress=adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", name,adress);
    }


}
