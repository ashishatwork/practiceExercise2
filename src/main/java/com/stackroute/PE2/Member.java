package com.stackroute.PE2;

public class Member
{
    String name;
    int age;
    float salary;

    public Member(String name, int age, float salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void displayDetails()
    {
        System.out.println("Members Name :"+ name);
        System.out.println("Potter Members Age :"+ age);
        System.out.println("Members Salary :"+ salary);
    }

}

public class MemberVariable
{
    Member m1=new Member("Ashish",22, (float) 50000.00);
    m1.getName();

}