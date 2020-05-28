package lib;

import java.net.http.HttpClient;

public class Library {
    public HttpClient someLibraryMethod() {
        return HttpClient.newBuilder().build();
    }
}
