import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    private static final ObjectMapper mapper = new ObjectMapper();


    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.DEFAULT)
                .build();

        HttpGet request = new HttpGet("https://api.nasa.gov/planetary/apod?api_key=TDf3fmUGddTZbPM8rpTGGXIwqz9Dh1sWCiS6BfYw");
        CloseableHttpResponse response = httpClient.execute(request);

        NasaResponse nasaResponse = mapper.readValue(response.getEntity().getContent(), new TypeReference<>(){});

        CloseableHttpResponse getMedia = httpClient.execute(new HttpGet(nasaResponse.getHdurl()));

        String[] name = nasaResponse.getHdurl().split("/");


        try(FileOutputStream fos = new FileOutputStream(name[name.length-1]))
        {
            byte[] buffer = getMedia.getEntity().getContent().readAllBytes();

            fos.write(buffer, 0, buffer.length);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
