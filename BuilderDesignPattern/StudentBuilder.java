package BuilderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {

    // the only disadvantage is we have duplication of code as you can see "Student" and "StudentBuilder" have some duplication.
    int rollNumber;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    // aap dekho har method se "StudentBuilder" return hora hai
    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        // return "this" means it's returning "RollNumber"
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    abstract public StudentBuilder setSubjects();

    public Student build() {
        // finally calling build() which returns the main object which is Student
        return new Student(this);
    }

}


