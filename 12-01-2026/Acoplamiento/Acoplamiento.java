package Acoplamiento;
public class Acoplamiento {
    public static void main(String[] args) {
        Person person = new Person("Anderson");
        person.notifyPerson();
    }
}

class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}

/* BAJO ACOPLAMIENTO (RECOMENDADO, CORRECTO)

class Person {
    private String name;
    private String email;
    private EmailService emailService;

    public Person(String name, EmailService emailService) {
        this.name = name;
        this.emailService = emailService;
    }

    public void notifyPerson() {
        emailService.sendEmail("Hello, my name is " + name);
    }
}
*/

// ACOPLAMIENTO ALTO (NO RECOMENDADO, NO INCORRECTO PERO MEJOR NEH)
class Person {
    private String name;
    private String email;
    private EmailService emailService;

    public Person(String name) {
        this.name = name;
        this.emailService = new EmailService();
    }

    public void notifyPerson() {
        emailService.sendEmail("Hello, my name is " + name);
    }
}
