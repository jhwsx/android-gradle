/**
 * Person
 * @author wangzhichao
 * @since 2020/12/5
 */
public class Person {
    private String name;
    private int age;

    /**
     * no argument constructor
     */
    public Person() {
    }

    /**
     * two arguments constructor
     *
     * @param name the name of a person
     * @param age the age of a person
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * get name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get age
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * set age
     * @param age age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
