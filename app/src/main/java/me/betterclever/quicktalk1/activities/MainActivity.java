package me.betterclever.quicktalk1.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.betterclever.quicktalk1.R;

public class MainActivity extends AppCompatActivity {
    
    
    @BindView(R.id.editText)
    TextInputEditText editText;
    @BindView(R.id.button)
    Button button;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this,UserProfileViewActivity.class);
                intent.putExtra("username",user);
                startActivity(intent);
            }
        });
    }
    
}
