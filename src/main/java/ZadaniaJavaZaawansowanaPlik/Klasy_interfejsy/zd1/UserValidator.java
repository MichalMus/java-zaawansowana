package ZadaniaJavaZaawansowanaPlik.Klasy_interfejsy.zd1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {


    public String[] validateEmail(String email, String emailAlternative) {
        class Email {
            private String email;

            public Email(String email) {
                if (email == null || email.isEmpty() || !validate(email)) {
                    email = "unknow";
                } else {
                    this.email = email;
                }
            }
        }

        Email email1 = new Email(email);
        Email email2 = new Email(emailAlternative);
        return new String[]{
                email1.email, email2.email
        };
    }


    public static final Pattern VALID_EMAIL_ADRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String email) {
        Matcher matcher = VALID_EMAIL_ADRESS_REGEX.matcher(email);
        return matcher.find();
    }

}



