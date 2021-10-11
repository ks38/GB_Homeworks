package lesson_5;

class Employer {

    private String firstName, secondName, lastName, position, email, phoneNumber;
    private double salary;
    private int age;

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


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
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
