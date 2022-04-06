import java.util.Arrays;
import java.util.List;

public class Person {

    private String name;
    private String surname;
    private int age;
    private List<Child> children;

    public Person() {
    }

    public Person(String name, String surname, int age, List<Child> children) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.children = children;
    }

    public Person createOnePerson() {
        Person person1 = new Person(
                "Adamos", "Budowniczy", 33, Arrays.asList(
                new Child("Bogdan"), new Child("Pawełek")));
        return person1;
    }

    public List<Person> createTwoPersons() {
        Person person1 = new Person(
                "Adamos", "Budowniczy", 33, Arrays.asList(
                new Child("Bogdan"), new Child("Pawełek")));

        Person person2 = new Person(
                "Basia", "Spryciula", 33, Arrays.asList(
                new Child("Agnieszka"), new Child("Elfo")));

        List<Person> people = Arrays.asList(person1, person2);

        return people;
    }
}
