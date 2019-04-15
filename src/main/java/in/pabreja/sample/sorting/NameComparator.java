package in.pabreja.sample.sorting;

import java.util.Comparator;
import java.util.Objects;

public class NameComparator implements Comparator<PersonComparable> {

    private String name;
    private String address;
    private String qualification;
    private String salary;
    private String age;
    private String skill;
    private String firstLang;


    @Override
    public int compare(PersonComparable o1, PersonComparable o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NameComparator)) return false;
        NameComparator that = (NameComparator) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(address, that.address) &&
                Objects.equals(qualification, that.qualification) &&
                Objects.equals(salary, that.salary) &&
                Objects.equals(age, that.age) &&
                Objects.equals(skill, that.skill) &&
                Objects.equals(firstLang, that.firstLang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, qualification, salary, age, skill, firstLang);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getFirstLang() {
        return firstLang;
    }

    public void setFirstLang(String firstLang) {
        this.firstLang = firstLang;
    }
}
