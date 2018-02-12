package com.asadbaig.android.pikme;

import retrofit2.Retrofit;

/**
 * Created by usamanaseer on 12/02/2018.
 */

public class RetrofitBuilder {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build();

    GitHubService service = retrofit.create(GitHubService.class);
}
