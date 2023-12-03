package com.panhacode.hibernateintegretion.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Person {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "fist_name")
    private String fistName;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "gender")
    private String gender;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Basic
    @Column(name = "country_of_birth")
    private String countryOfBirth;
    @ManyToOne
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Car carByCarId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(fistName, person.fistName) && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender) && Objects.equals(email, person.email) && Objects.equals(dateOfBirth, person.dateOfBirth) && Objects.equals(countryOfBirth, person.countryOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fistName, lastName, gender, email, dateOfBirth, countryOfBirth);
    }

    public Car getCarByCarId() {
        return carByCarId;
    }

    public void setCarByCarId(Car carByCarId) {
        this.carByCarId = carByCarId;
    }
}
