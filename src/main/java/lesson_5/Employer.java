package lesson_5;

class Employer {

    public String firstName, secondName, lastName, position, email, phoneNumber;
    public double salary;
    public int age;

    Employer(String firstName,
             String secondName,
             String lastName,
             int age,
             String position,
             double salary,
             String email,
             String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    void getFullName() {
        System.out.print("ФИО: " + firstName + " " + secondName + " " + lastName);
    }

    public void getFullInfo() {
        getFullName();
        System.out.println("; возраст: " + age + "; должность: " + position + "; зарплата: " +
                salary + "; email: " + email + "; номер телефона: " + phoneNumber);
    }
}
