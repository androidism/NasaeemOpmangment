package org.ismail.nasaeemopmangment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Add_Task extends AppCompatActivity {

    FloatingActionButton fl_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        getSupportActionBar().hide();

        fl_back=findViewById(R.id.fl_back);

        fl_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Add_Task.this, MainActivity2.class);
                startActivity(intent);

                Toast.makeText(Add_Task.this,"شكراً لأنك ماضفت مهمة",Toast.LENGTH_SHORT).show();
            }
        });




    }
}