package arcesium;

public class GeoLocation{
        Long lat;
    Long lng;

    public double getLat() {
        return lat;
    }

    public void setLat(Long lat) {
        this.lat = lat;
    }

    public Long getLng() {
        return lng;
    }

    public void setLng(Long lng) {
        this.lng = lng;
    }

    public GeoLocation(Long lat, Long lng) {
        this.lat = lat;
        this.lng = lng;
    }
}
    