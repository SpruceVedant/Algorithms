import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

class minn {
    public static void main(String[] args) {
        try {
            HttpResponse<String> response = httpGet("http://example.com");
            System.out.println(response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static HttpResponse<String> httpGet(String uri) throws Exception {
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder()
            .uri(URI.create(uri))
            .build();
        return client.send(request, BodyHandlers.ofString());
    }
}
