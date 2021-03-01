package be.vdab.restclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

public class Data {
    private long id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
