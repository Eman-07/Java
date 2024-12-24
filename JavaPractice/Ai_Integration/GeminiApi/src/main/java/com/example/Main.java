package com.example;

import com.google.cloud.gemini.v1.GeminiClient;
import com.google.cloud.gemini.v1.GeminiSettings;
import com.google.auth.oauth2.GoogleCredentials;
import java.io.FileInputStream;


import com.google.auth.oauth2.GoogleCredentials;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.http.GenericUrl;

import java.io.FileInputStream;
import okhttp3.*;
import org.json.JSONObject;

public class GeminiApiExample {
    public static void main(String[] args) {
        String apiKey = "YOUR_API_KEY";
        String endpoint = "https://api.your-gemini-endpoint.com/generate"; // Replace with the actual endpoint
        String modelName = "gemini-1.5-flash";

        // Request Body
        JSONObject requestBody = new JSONObject();
        requestBody.put("model", modelName);
        requestBody.put("prompt", "How are you?");

        OkHttpClient client = new OkHttpClient();

        RequestBody body = RequestBody.create(
                requestBody.toString(),
                MediaType.get("application/json")
        );

        Request request = new Request.Builder()
                .url(endpoint)
                .addHeader("Authorization", "Bearer " + apiKey)
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                String responseBody = response.body().string();
                System.out.println("Response: " + responseBody);

                // Parse response if needed
                JSONObject jsonResponse = new JSONObject(responseBody);
                String text = jsonResponse.getString("text");
                System.out.println("Generated Content: " + text);
            } else {
                System.err.println("Request failed: " + response.code());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
