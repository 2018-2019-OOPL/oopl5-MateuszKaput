package pl.edu.ur.oopl5.companyAndEmployees.employee;

import pl.edu.ur.oopl5.companyAndEmployees.company.abstractClasses.AbstractPerson;

/**
 */
public class Employee extends AbstractPerson implements EmployeeInterface {
        
    //private String name;
    //private String surname;
    //private int age;
    private String position;

    public Employee(String name, String surname, int age) {
        
        super(name,surname,age);
        this.name=name;
        this.surname=surname;
        this.age=age;
        
    }
    public Employee(String name, String surname, int age, String position) {
        super(name,surname,age);
        this.setPosition(position);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
