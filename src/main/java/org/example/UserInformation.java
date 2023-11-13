package org.example;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserInformation {
    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    @Size(max = 500)
    private String message;

    @NotEmpty
    private String salutation;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMessage() {
        return message;
    }

    public String getSalutation() {
        return salutation;
    }
// getter & setter
}
