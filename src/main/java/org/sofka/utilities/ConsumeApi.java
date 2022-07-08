package org.sofka.utilities;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


import java.io.IOException;

public class ConsumeApi {

    private ConsumeApi() {
    }

    private static final String URL = "https://api.giphy.com/v1/gifs/search?api_key=OvBCaB7PVunjsBdVVGfAgV1JSemLzy25&limit=5&q=";
    private static final OkHttpClient client = new OkHttpClient();

    public static Response getGif(String name) throws IOException {
        Request request = new Request.Builder().url(URL.concat(name)).build();
        return client.newCall(request).execute();
    }
}
