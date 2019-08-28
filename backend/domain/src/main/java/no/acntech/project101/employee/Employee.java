package no.acntech.project101.employee;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Employee {

    //TODO Create the entity for Employee
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "DATE_OF_BIRTH", nullable = false)
    private LocalDate dateOfBirth;

    public Employee() {
    }
        // Hibernate

    public Employee(final String firstName, final String lastName, final LocalDate dateOfBirth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
            return firstName;
    }

    public String getLastName() {
            return lastName;
    }

    public LocalDate getDateOfBirth() {
            return dateOfBirth;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}