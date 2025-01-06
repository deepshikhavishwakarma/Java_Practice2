package CodePractice2.Codeday44_Serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private  String name;
    private transient int id;
    private String address;
    public Student(String name, int id, String address) {
        super();
        this.name = name;
        this.id = id;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
    }
}

