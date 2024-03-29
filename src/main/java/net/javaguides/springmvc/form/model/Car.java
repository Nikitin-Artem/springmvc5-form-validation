package net.javaguides.springmvc.form.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {

    private String firstName;

    @NotNull(message="is required")
    @Size(min = 2, message = "is required")
    private String lastName;

    public Car() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
