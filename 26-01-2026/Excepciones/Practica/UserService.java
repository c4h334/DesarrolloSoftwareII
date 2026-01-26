package Excepciones.Practica;

public class UserService {
    private int age;
    private InvalidAgeException e;

    public UserService() {
    }

    public void registerUser(int age) {

        if (age < 18 || age > 120) {
            throw new InvalidAgeException("Sos menor de edad");
        }
    }
}
