package domain;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import static org.junit.Assert.assertEquals;

public class EndpointsTest {


    @Test
    public void checkBaseUrl() throws MalformedURLException {
        URL url = URI.create("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").toURL();

        String baseUrlAuthority= url.getProtocol() + "://" + url.getAuthority();
        String baseUrl = url.getProtocol() + "://" + url.getHost();
        System.out.println(baseUrl);
        assert (url.toString().startsWith(baseUrlAuthority));
    }
}