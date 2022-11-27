package ZadaniaJavaZaawansowanaPlik.Klasy_interfejsy.zd4;

public class User {
    private String name;
    private String secondName;
    private int age;
    private String login;
    private String password;


    public User() {
    };


    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name, Validator<String> validator) {
        if (validator.validate(name)) {
            this.name = name;
        }
    }

    public void setSecondName(String secondName, Validator<String> validator) {
        if (validator.validate(secondName)) {
            this.secondName = secondName;
        }
    }

    public void setAge(int age, Validator<Integer> validator) {
        if (validator.validate(age)) {
            this.age = age;
        }
    }

    public void setLogin(String login, Validator<String> validator) {
        if (validator.validate(login)) {
            this.login = login;
        }
    }

    public void setPassword(String password, Validator<String> validator) {
        if (validator.validate(password)) {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
