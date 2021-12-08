package org.ismail.nasaeemopmangment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Add_Task extends AppCompatActivity {

    FloatingActionButton fl_back;
    EditText target, team, location;
    Spinner depart,name,point;
    Button add_tasks;
    Integer numTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        getSupportActionBar().hide();

        fl_back = findViewById(R.id.fl_back);

        fl_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Add_Task.this, MainActivity2.class);
                startActivity(intent);

                Toast.makeText(Add_Task.this, "شكراً لأنك ماضفت مهمة", Toast.LENGTH_SHORT).show();
            }
        });

// Write a message to the database
        add_tasks = findViewById(R.id.add_task);
        name = findViewById(R.id.name);
        target = findViewById(R.id.target);
        team = findViewById(R.id.team);
        location = findViewById(R.id.location);
        depart = findViewById(R.id.depart);
        point= findViewById(R.id.point);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference mDatabase = database.getReference("numTask");
        mDatabase.addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                numTask = dataSnapshot.getValue(Integer.class);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        add_tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference mDatabase = database.getReference();
                switch (numTask) {
                    case 1:

                        numTask++;
                        mDatabase.child("Tasks").child("1").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("1").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("1").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("1").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("1").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("1").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);

                        break;
                    case 2:
                        numTask++;
                        mDatabase.child("Tasks").child("2").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("2").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("2").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("2").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("2").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("2").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 3:
                        numTask++;
                        mDatabase.child("Tasks").child("3").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("3").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("3").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("3").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("3").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("3").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 4:
                        numTask++;
                        mDatabase.child("Tasks").child("4").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("4").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("4").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("4").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("4").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("4").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 5:
                        numTask++;
                        mDatabase.child("Tasks").child("5").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("5").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("5").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("5").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("5").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("5").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 6:
                        numTask++;
                        mDatabase.child("Tasks").child("6").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("6").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("6").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("6").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("6").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("6").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 7:
                        numTask++;
                        mDatabase.child("Tasks").child("7").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("7").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("7").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("7").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("7").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("7").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 8:
                        numTask++;
                        mDatabase.child("Tasks").child("8").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("8").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("8").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("8").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("8").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("8").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 9:
                        numTask++;
                        mDatabase.child("Tasks").child("9").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("9").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("9").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("9").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("9").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("9").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 10:
                        numTask++;
                        mDatabase.child("Tasks").child("10").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("10").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("10").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("10").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("10").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("10").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 11:
                        numTask++;
                        mDatabase.child("Tasks").child("11").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("11").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("11").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("11").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("11").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("11").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 12:
                        numTask++;
                        mDatabase.child("Tasks").child("12").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("12").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("12").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("12").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("12").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("12").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 13:
                        numTask++;
                        mDatabase.child("Tasks").child("13").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("13").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("13").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("13").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("13").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("13").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 14:
                        numTask++;
                        mDatabase.child("Tasks").child("14").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("14").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("14").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("14").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("14").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("14").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 15:
                        numTask++;
                        mDatabase.child("Tasks").child("15").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("15").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("15").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("15").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("15").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("15").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 16:
                        numTask++;
                        mDatabase.child("Tasks").child("16").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("16").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("16").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("16").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("16").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("16").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 17:
                        numTask++;
                        mDatabase.child("Tasks").child("17").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("17").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("17").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("17").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("17").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("17").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 18:
                        numTask++;
                        mDatabase.child("Tasks").child("18").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("18").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("18").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("18").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("18").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("18").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 19:
                        numTask++;
                        mDatabase.child("Tasks").child("19").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("19").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("19").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("19").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("19").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("19").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 20:
                        numTask++;
                        mDatabase.child("Tasks").child("20").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("20").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("20").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("20").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("20").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("20").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 21:
                        numTask++;
                        mDatabase.child("Tasks").child("21").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("21").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("21").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("21").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("21").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("21").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 22:
                        numTask++;
                        mDatabase.child("Tasks").child("22").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("22").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("22").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("22").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("22").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("22").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 23:
                        numTask++;
                        mDatabase.child("Tasks").child("23").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("23").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("23").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("23").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("23").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("23").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 24:
                        numTask++;
                        mDatabase.child("Tasks").child("24").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("24").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("24").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("24").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("24").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("24").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 25:
                        numTask++;
                        mDatabase.child("Tasks").child("25").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("25").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("25").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("25").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("25").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("25").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 26:
                        numTask++;
                        mDatabase.child("Tasks").child("26").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("26").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("26").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("26").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("26").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("26").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 27:
                        numTask++;
                        mDatabase.child("Tasks").child("27").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("27").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("27").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("27").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("27").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("27").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 28:
                        numTask++;
                        mDatabase.child("Tasks").child("28").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("28").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("28").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("28").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("28").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("28").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 29:
                        numTask++;
                        mDatabase.child("Tasks").child("29").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("29").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("29").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("29").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("29").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("29").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;
                    case 30:
                        numTask++;
                        mDatabase.child("Tasks").child("30").child("target").setValue(target.getText().toString());
                        mDatabase.child("Tasks").child("30").child("name").setValue(name.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("30").child("location").setValue(location.getText().toString());
                        mDatabase.child("Tasks").child("30").child("depart").setValue(depart.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("30").child("point").setValue(point.getSelectedItem().toString());
                        mDatabase.child("Tasks").child("30").child("team").setValue(team.getText().toString());
                        mDatabase.child("numTask").setValue(numTask);
                        break;









                }

                Intent intent = new Intent(Add_Task.this, MainActivity2.class);
                startActivity(intent);
                Toast.makeText(Add_Task.this, "بالتوفيق في مهمتك ولاتنسى تتأكد من الموافقة عليها", Toast.LENGTH_SHORT).show();

            }
        });


    }
   }

