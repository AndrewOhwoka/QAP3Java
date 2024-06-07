package ProblemOne;

public class Person {
    // Given Data fields
    protected String myName;
    protected int myAge;
    protected String myGender;
    
    // Constructor
    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }
    
    // Getters for the data fields
    public String getName() {
        return myName;
    }
    
    public int getAge() {
        return myAge;
    }
    
    public String getGender() {
        return myGender;
    }

    // Setters for the data fields
    public void setName(String name) {
        this.myName = name;
    }
    
    public void setAge(int age) {
        this.myAge = age;
    }
    
    public void setGender(String gender) {
        this.myGender = gender;
    }

    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}

