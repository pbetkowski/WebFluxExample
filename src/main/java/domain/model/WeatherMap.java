package domain.model;

import lombok.Data;

@Data
public class WeatherMap {

    private long id;
    private long dt;
    private Clouds clouds;
    private Coord coord;
    private Wind wind;
    private String cod;
    private long visibility;
    private Sys sys;
    private String name;
    private String base;
    private Weather[] weather;
    private Main main;
}
