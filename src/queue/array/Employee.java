package queue.array;

import java.util.Objects;

public class Employee {

    private String name;
    private String gender;
    private int age;

    public Employee (String name, String gender, int age) {

        this.name = name;
        this.gender = gender;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Gender: " + gender + ", Age: " + age;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return name.equals(employee.name) && gender.equals(employee.gender) && age == employee.age;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }

}
