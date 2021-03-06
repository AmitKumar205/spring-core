package com.sunglowsys.autowiringUsingXmlAnnotation;

import com.sunglowsys.autowiringUsingXml.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {


    private Address address;

    public Student() {
    }
@Autowired
    public Student(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }
}
