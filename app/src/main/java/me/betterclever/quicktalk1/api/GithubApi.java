package me.betterclever.quicktalk1.api;

import me.betterclever.quicktalk1.model.GithubUser;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by betterclever on 2/26/2017.
 */

public interface GithubApi {
    
    @GET("users/{user}")
    Call<GithubUser> getUserInfo(@Path("user") String user);
    
}
