package org.ismail.nasaeemopmangment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;

import org.ismail.nasaeemopmangment.sub.Firebase;


public class splash extends AppCompatActivity {
    public static SharedPreferences sharedPreferences;
    public static SharedPreferences.Editor editor;
    public static String user_id;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            sharedPreferences = getSharedPreferences("ismail", Context.MODE_PRIVATE);
            get_shared_preferences();
            FirebaseApp.initializeApp(this);
            Firebase.initFirebase();
            new Handler().postDelayed(() ->{
                Intent i;
                if(!user_id.equals("null")){
                    i=new Intent(splash.this, MainActivity2.class);
                }
                else {
                    i=new Intent(splash.this, MainActivity.class);
                }
                startActivity(i);
            },1000);
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Field",Toast.LENGTH_LONG);
        }
    }
    public static void set_shared_preferences(String key,String value) {
        editor = sharedPreferences.edit();
        editor.putString(key,value);
        editor.apply();

        get_shared_preferences();
    }
    private static void get_shared_preferences() {
        user_id=sharedPreferences.getString("user_id","null");
    }

    public static void clear_Share_preferences(){
        editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}
