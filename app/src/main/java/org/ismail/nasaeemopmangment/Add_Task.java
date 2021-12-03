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
    int numTask=1 , x=1;



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
                switch (numTask) {
                    case 1:


                        mDatabase.child("1").child("target").setValue(target.getText().toString());
                        mDatabase.child("1").child("name").setValue(name.getText().toString());
                        mDatabase.child("1").child("location").setValue(location.getText().toString());
                        mDatabase.child("1").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("1").child("team").setValue(team.getText().toString());
                        numTask=2;
                        break;
                    case 2:
                        mDatabase.child("2").child("target").setValue(target.getText().toString());
                        mDatabase.child("2").child("name").setValue(name.getText().toString());
                        mDatabase.child("2").child("location").setValue(location.getText().toString());
                        mDatabase.child("2").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("2").child("team").setValue(team.getText().toString());
                        numTask=numTask+x;
                        break;
                }

                Intent intent = new Intent(Add_Task.this, MainActivity2.class);
                startActivity(intent);
                Toast.makeText(Add_Task.this, "بالتوفيق في مهمتك ولاتنسى تتأكد من الموافقة عليها", Toast.LENGTH_SHORT).show();

            }
        });



}
}