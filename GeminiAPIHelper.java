package Formula1DataExplorer;

import okhttp3.*;
import java.io.IOException;

public class GeminiAPIHelper {
    private static final String API_KEY = System.getenv("GEMINI_API_KEY");
    private static final String GEMINI_ENDPOINT =
            "https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent";

    private static final OkHttpClient client = new OkHttpClient();

    public static String askGemini(String prompt) throws IOException {
        if (API_KEY == null || API_KEY.isBlank()) {
            throw new IllegalStateException("GEMINI_API_KEY is not set");
        }

        MediaType mediaType = MediaType.parse("application/json");
        String json = "{\"contents\":[{\"parts\":[{\"text\":\"" + prompt + "\"}]}]}";

        RequestBody body = RequestBody.create(json, mediaType);
        Request request = new Request.Builder()
                .url(GEMINI_ENDPOINT)
                .post(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("x-goog-api-key", API_KEY)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            return response.body().string();
        }
    }
}

