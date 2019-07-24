package domain.model;

import lombok.Builder;
import lombok.Data;

@Data
public class ParsedData {

    private String cityName;
    private String countryCode;
    private String averageTemperature;
    private String averagePressure;
    private String averageHumidity;

}
