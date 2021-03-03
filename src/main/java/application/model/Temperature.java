package application.model;


import java.time.OffsetDateTime;

public class Temperature {

    private String longitude;
    private String lagitude;
    private OffsetDateTime date;
    private Double temperature;

    public Temperature(String longitude, String lagitude, OffsetDateTime date, Double temperature) {
        this.longitude = longitude;
        this.lagitude = lagitude;
        this.date = date;
        this.temperature = temperature;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLagitude() {
        return lagitude;
    }

    public void setLagitude(String lagitude) {
        this.lagitude = lagitude;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
