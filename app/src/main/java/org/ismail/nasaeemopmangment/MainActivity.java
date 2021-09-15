package org.ismail.nasaeemopmangment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity {
/*
    EditText usertxt;
    String usertxt2;
    DatabaseReference myRef;

 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database
    //    FirebaseDatabase database = FirebaseDatabase.getInstance();
     //   myRef = database.getReference();


    }
    /*
    public void click1 (View v){

        usertxt = findViewById(R.id.usertxt);

        usertxt2 = (usertxt.getText().toString());
        myRef.child("User:").setValue(usertxt2);

    }

     */
}