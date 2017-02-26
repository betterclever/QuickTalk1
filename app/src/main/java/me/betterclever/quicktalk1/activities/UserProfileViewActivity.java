package me.betterclever.quicktalk1.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.betterclever.quicktalk1.R;
import me.betterclever.quicktalk1.api.GithubApi;
import me.betterclever.quicktalk1.model.GithubUser;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserProfileViewActivity extends AppCompatActivity {
    
    
    private static final String TAG = UserProfileViewActivity.class.getSimpleName();
    @BindView(R.id.profile_imageview)
    ImageView profileImageview;
    @BindView(R.id.fullname_textview)
    TextView fullnameTextview;
    @BindView(R.id.username_textview)
    TextView usernameTextview;
    @BindView(R.id.bio_textview)
    TextView bioTextview;
    @BindView(R.id.organization_textview)
    TextView organizationTextview;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile_view);
        ButterKnife.bind(this);
        
        final String username = getIntent().getStringExtra("username");
        
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        
        GithubApi githubApi = retrofit.create(GithubApi.class);
        
        Call<GithubUser> call = githubApi.getUserInfo(username);
        call.enqueue(new Callback<GithubUser>() {
            @Override
            public void onResponse(Call<GithubUser> call, Response<GithubUser> response) {
                GithubUser user = response.body();
                Log.d(TAG, response.toString());
                Log.d(TAG, "hi");
                if (user != null) {
                    
                    Glide.with(UserProfileViewActivity.this)
                        .load(user.getAvatarUrl())
                        .into(profileImageview);
                    
                    fullnameTextview.setText(user.getName());
                    bioTextview.setText(user.getBio());
                    usernameTextview.setText(user.getLogin());
                    organizationTextview.setText(user.getCompany());
                }
            }
            
            @Override
            public void onFailure(Call<GithubUser> call, Throwable t) {
                
            }
        });
    }
}
