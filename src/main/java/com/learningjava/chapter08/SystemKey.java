package com.learningjava.chapter08;

/**
 * Created by vashishta on 9/15/15.
 */
public final class SystemKey  {

    private final String apiKey;
    private final String password;

    public SystemKey(String apiKey, String password) {
        this.apiKey = apiKey;
        this.password = password;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getPassword() {
        return password;
    }
}
