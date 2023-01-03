public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    String address;

    public Person(String firstName, String lastName, int age, String gender, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        System.out.println(firstName + " " + lastName + " " + age + " " + gender + " " + address);

    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        System.out.println(firstName + " " + lastName + " " + age);

    }

    public Person(String firstName, String gender) {
        this.firstName = firstName;
        this.gender = gender;
        System.out.println(firstName + " " + gender);

    }


}










