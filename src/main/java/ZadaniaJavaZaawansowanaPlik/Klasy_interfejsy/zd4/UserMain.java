package ZadaniaJavaZaawansowanaPlik.Klasy_interfejsy.zd4;

public class UserMain {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("Michał", new Validator<String>() {
            @Override
            public boolean validate(String input) {
               return !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        });

        user1.setSecondName("Musialski", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input != null && !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        });

        user1.setAge(35, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input >= 0 && input <= 150;
            }
        });

        user1.setLogin("test", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length()==10;
            }
        });

        user1.setPassword("test", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!") ;
            }
        });
        System.out.println(user1);
    }
}
