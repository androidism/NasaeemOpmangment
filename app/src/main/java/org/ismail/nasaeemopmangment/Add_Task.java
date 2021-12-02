package org.ismail.nasaeemopmangment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Add_Task extends AppCompatActivity {

    FloatingActionButton fl_back;
    EditText name, target,team,location;
    Spinner depart;
    Button add_tasks;



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

// Write a message to the database
        add_tasks=findViewById(R.id.add_task);
        name=findViewById(R.id.name);
        target=findViewById(R.id.target);
        team=findViewById(R.id.team);
        location=findViewById(R.id.location);
        depart=findViewById(R.id.depart);



        FirebaseDatabase database = FirebaseDatabase.getInstance();


        add_tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference mDatabase = database.getReference("Tasks");

                mDatabase.child("target").push().setValue(target.getText().toString());
                mDatabase.child("name").push().setValue(name.getText().toString());
                mDatabase.child("location").push().setValue(location.getText().toString());
                mDatabase.child("depart").push().setValue(depart.getSelectedItem().toString());
                mDatabase.child("team").push().setValue(team.getText().toString());
                Intent intent = new Intent(Add_Task.this, MainActivity2.class);
                startActivity(intent);
                Toast.makeText(Add_Task.this,"بالتوفيق في مهمتك ولاتنسى تتأكد من الموافقة عليها",Toast.LENGTH_SHORT).show();

            }
        });



}
}