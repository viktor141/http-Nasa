import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaResponse {

    private final String copyright;
    private final String date;
    private final String explanation;
    private final String hurl;
    private final String mediaType;
    private final String serviceVersion;
    private final String title;
    private final String url;

    //{"date":"2023-01-24",
    // "explanation":"If you could stand on exoplanet LHS 475 b, what might you see? No one knows for sure but pictured here is an interesting guess made by an Earth-based artificial intelligence (AI) engine. The existence of the exoplanet was indicated in data taken by the Earth-orbiting TESS satellite but confirmed and further investigated only this year by the near-Earth Sun-orbiting James Webb Space Telescope. What is known for sure is that LHS 475 b has a mass very similar to our Earth and closely orbits a small red star about 40 light years away. The featured AI-illustrated guess depicts a plausibly rugged Earth-like landscape replete with molten lava and with the central red star rising in the distance. Webbdata does not as yet reveal, however, whether LHS 475 b has an atmosphere. One of Webb\u2019s science objectives is to follow up previous discoveries of distant exoplanets to better discern their potential for developing life.    Comet ZTF Gallery: Notable Submissions to APOD",
    // "hdurl":"https://apod.nasa.gov/apod/image/2301/RockyRed7_DeepAI_960.jpg",
    // "media_type":"image",
    // "service_version":"v1",
    // "title":"LHS 475 b: Earth-Sized Exoplanet",
    // "url":"https://apod.nasa.gov/apod/image/2301/RockyRed7_DeepAI_960.jpg"}


    NasaResponse(@JsonProperty("copyright") String copyright,
                 @JsonProperty("date") String date,
                 @JsonProperty("explanation") String explanation,
                 @JsonProperty("hdurl") String hurl,
                 @JsonProperty("media_type") String mediaType,
                 @JsonProperty("service_version") String serviceVersion,
                 @JsonProperty("title") String title,
                 @JsonProperty("url") String url) {
        this.copyright = copyright;
        this.date = date;
        this.explanation = explanation;
        this.hurl = hurl;
        this.mediaType = mediaType;
        this.serviceVersion = serviceVersion;
        this.title = title;
        this.url = url;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getDate() {
        return date;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getHurl() {
        return hurl;
    }

    public String getMediaType() {
        return mediaType;
    }

    public String getServiceVersion() {
        return serviceVersion;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

}
