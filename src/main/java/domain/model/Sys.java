package domain.model;

import lombok.Data;

@Data
public class Sys {
    private int type;
    private int id;
    private String message;
    private String country;
    private String sunrise;
    private String sunset;
}
