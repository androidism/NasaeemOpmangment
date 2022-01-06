package org.ismail.nasaeemopmangment;

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
    EditText target, team, location,date;
    Spinner depart,name,point;
    Button add_tasks;
    Integer numTask;
    int chi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        getSupportActionBar().hide();

        fl_back = findViewById(R.id.fl_back);

        fl_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                finishAffinity();
                System.exit(0);
           //     Intent intent = new Intent(Add_Task.this, MainActivity2.class);
             //   startActivity(intent);

                //Toast.makeText(Add_Task.this, "شكراً لأنك ماضفت مهمة", Toast.LENGTH_SHORT).show();
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
        date=findViewById(R.id.date);





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
                if (location.getText().toString().equals("")||target.getText().toString().equals("")||team.getText().toString().equals("")||date.getText().toString().equals("")) {
                    Toast.makeText(Add_Task.this, "يرجى عدم ترك بيانات فارغة", Toast.LENGTH_SHORT).show();
                }
                else{
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
                            mDatabase.child("Tasks").child("1").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");

                            break;
                        case 2:
                            numTask++;
                            mDatabase.child("Tasks").child("2").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("2").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("2").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("2").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("2").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("2").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("2").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 3:
                            numTask++;
                            mDatabase.child("Tasks").child("3").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("3").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("3").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("3").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("3").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("3").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("3").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 4:
                            numTask++;
                            mDatabase.child("Tasks").child("4").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("4").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("4").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("4").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("4").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("4").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("4").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 5:
                            numTask++;
                            mDatabase.child("Tasks").child("5").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("5").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("5").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("5").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("5").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("5").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("5").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 6:
                            numTask++;
                            mDatabase.child("Tasks").child("6").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("6").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("6").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("6").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("6").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("6").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("6").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 7:
                            numTask++;
                            mDatabase.child("Tasks").child("7").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("7").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("7").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("7").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("7").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("7").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("7").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 8:
                            numTask++;
                            mDatabase.child("Tasks").child("8").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("8").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("8").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("8").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("8").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("8").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("8").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 9:
                            numTask++;
                            mDatabase.child("Tasks").child("9").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("9").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("9").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("9").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("9").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("9").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("9").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 10:
                            numTask++;
                            mDatabase.child("Tasks").child("10").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("10").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("10").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("10").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("10").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("10").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("10").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 11:
                            numTask++;
                            mDatabase.child("Tasks").child("11").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("11").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("11").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("11").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("11").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("11").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("11").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 12:
                            numTask++;
                            mDatabase.child("Tasks").child("12").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("12").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("12").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("12").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("12").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("12").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("12").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 13:
                            numTask++;
                            mDatabase.child("Tasks").child("13").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("13").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("13").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("13").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("13").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("13").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("13").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 14:
                            numTask++;
                            mDatabase.child("Tasks").child("14").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("14").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("14").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("14").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("14").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("14").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("14").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 15:
                            numTask++;
                            mDatabase.child("Tasks").child("15").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("15").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("15").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("15").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("15").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("15").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("15").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 16:
                            numTask++;
                            mDatabase.child("Tasks").child("16").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("16").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("16").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("16").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("16").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("16").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("16").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 17:
                            numTask++;
                            mDatabase.child("Tasks").child("17").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("17").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("17").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("17").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("17").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("17").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("17").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 18:
                            numTask++;
                            mDatabase.child("Tasks").child("18").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("18").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("18").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("18").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("18").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("18").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("18").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 19:
                            numTask++;
                            mDatabase.child("Tasks").child("19").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("19").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("19").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("19").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("19").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("19").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("19").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 20:
                            numTask++;
                            mDatabase.child("Tasks").child("20").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("20").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("20").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("20").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("20").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("20").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("20").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 21:
                            numTask++;
                            mDatabase.child("Tasks").child("21").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("21").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("21").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("21").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("21").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("21").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("21").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 22:
                            numTask++;
                            mDatabase.child("Tasks").child("22").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("22").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("22").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("22").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("22").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("22").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("22").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 23:
                            numTask++;
                            mDatabase.child("Tasks").child("23").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("23").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("23").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("23").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("23").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("23").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("23").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 24:
                            numTask++;
                            mDatabase.child("Tasks").child("24").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("24").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("24").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("24").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("24").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("24").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("24").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 25:
                            numTask++;
                            mDatabase.child("Tasks").child("25").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("25").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("25").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("25").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("25").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("25").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("25").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 26:
                            numTask++;
                            mDatabase.child("Tasks").child("26").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("26").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("26").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("26").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("26").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("26").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("26").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 27:
                            numTask++;
                            mDatabase.child("Tasks").child("27").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("27").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("27").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("27").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("27").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("27").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("27").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 28:
                            numTask++;
                            mDatabase.child("Tasks").child("28").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("28").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("28").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("28").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("28").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("28").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("28").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 29:
                            numTask++;
                            mDatabase.child("Tasks").child("29").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("29").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("29").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("29").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("29").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("29").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("29").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 30:
                            numTask++;
                            mDatabase.child("Tasks").child("30").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("30").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("30").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("30").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("30").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("30").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("30").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 31:

                            numTask++;
                            mDatabase.child("Tasks").child("31").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("31").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("31").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("31").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("31").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("31").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("31").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");

                            break;
                        case 32:
                            numTask++;
                            mDatabase.child("Tasks").child("32").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("32").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("32").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("32").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("32").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("32").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("32").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 33:
                            numTask++;
                            mDatabase.child("Tasks").child("33").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("33").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("33").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("33").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("33").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("33").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("33").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 34:
                            numTask++;
                            mDatabase.child("Tasks").child("34").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("34").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("34").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("34").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("34").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("34").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("34").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 35:
                            numTask++;
                            mDatabase.child("Tasks").child("35").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("35").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("35").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("35").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("35").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("35").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("35").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 36:
                            numTask++;
                            mDatabase.child("Tasks").child("36").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("36").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("36").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("36").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("36").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("36").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("36").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 37:
                            numTask++;
                            mDatabase.child("Tasks").child("37").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("37").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("37").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("37").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("37").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("37").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("37").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 38:
                            numTask++;
                            mDatabase.child("Tasks").child("38").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("38").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("38").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("38").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("38").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("38").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("38").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 39:
                            numTask++;
                            mDatabase.child("Tasks").child("39").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("39").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("39").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("39").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("39").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("39").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("39").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 40:
                            numTask++;
                            mDatabase.child("Tasks").child("40").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("40").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("40").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("40").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("40").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("40").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("40").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 41:

                            numTask++;
                            mDatabase.child("Tasks").child("41").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("41").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("41").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("41").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("41").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("41").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("41").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");

                            break;
                        case 42:
                            numTask++;
                            mDatabase.child("Tasks").child("42").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("42").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("42").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("42").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("42").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("42").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("42").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 43:
                            numTask++;
                            mDatabase.child("Tasks").child("43").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("43").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("43").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("43").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("43").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("43").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("43").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 44:
                            numTask++;
                            mDatabase.child("Tasks").child("44").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("44").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("44").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("44").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("44").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("44").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("44").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 45:
                            numTask++;
                            mDatabase.child("Tasks").child("45").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("45").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("45").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("45").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("45").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("45").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("45").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 46:
                            numTask++;
                            mDatabase.child("Tasks").child("46").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("46").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("46").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("46").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("46").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("46").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("46").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 47:
                            numTask++;
                            mDatabase.child("Tasks").child("47").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("47").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("47").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("47").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("47").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("47").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("47").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 48:
                            numTask++;
                            mDatabase.child("Tasks").child("48").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("48").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("48").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("48").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("48").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("48").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("48").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 49:
                            numTask++;
                            mDatabase.child("Tasks").child("49").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("49").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("49").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("49").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("49").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("49").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("49").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 50:
                            numTask++;
                            mDatabase.child("Tasks").child("50").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("50").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("50").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("50").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("50").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("50").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("50").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 51:

                            numTask++;
                            mDatabase.child("Tasks").child("51").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("51").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("51").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("51").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("51").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("51").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("51").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");

                            break;
                        case 52:
                            numTask++;
                            mDatabase.child("Tasks").child("52").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("52").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("52").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("52").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("52").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("52").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("52").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 53:
                            numTask++;
                            mDatabase.child("Tasks").child("53").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("53").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("53").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("53").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("53").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("53").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("53").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 54:
                            numTask++;
                            mDatabase.child("Tasks").child("54").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("54").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("54").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("54").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("54").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("54").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("54").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 55:
                            numTask++;
                            mDatabase.child("Tasks").child("55").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("55").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("55").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("55").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("55").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("55").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("55").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 56:
                            numTask++;
                            mDatabase.child("Tasks").child("56").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("56").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("56").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("56").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("56").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("56").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("56").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 57:
                            numTask++;
                            mDatabase.child("Tasks").child("57").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("57").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("57").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("57").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("57").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("57").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("57").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 58:
                            numTask++;
                            mDatabase.child("Tasks").child("58").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("58").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("58").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("58").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("58").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("58").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("58").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 59:
                            numTask++;
                            mDatabase.child("Tasks").child("59").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("59").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("59").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("59").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("59").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("59").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("59").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 60:
                            numTask++;
                            mDatabase.child("Tasks").child("60").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("60").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("60").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("60").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("60").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("60").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("60").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 61:

                            numTask++;
                            mDatabase.child("Tasks").child("61").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("61").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("61").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("61").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("61").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("61").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("61").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");

                            break;
                        case 62:
                            numTask++;
                            mDatabase.child("Tasks").child("62").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("62").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("62").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("62").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("62").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("62").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("62").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 63:
                            numTask++;
                            mDatabase.child("Tasks").child("63").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("63").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("63").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("63").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("63").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("63").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("63").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 64:
                            numTask++;
                            mDatabase.child("Tasks").child("64").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("64").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("64").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("64").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("64").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("64").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("64").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 65:
                            numTask++;
                            mDatabase.child("Tasks").child("65").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("65").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("65").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("65").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("65").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("65").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("65").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 66:
                            numTask++;
                            mDatabase.child("Tasks").child("66").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("66").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("66").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("66").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("66").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("66").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("66").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 67:
                            numTask++;
                            mDatabase.child("Tasks").child("67").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("67").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("67").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("67").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("67").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("67").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("67").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 68:
                            numTask++;
                            mDatabase.child("Tasks").child("68").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("68").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("68").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("68").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("68").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("68").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("68").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 69:
                            numTask++;
                            mDatabase.child("Tasks").child("69").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("69").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("69").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("69").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("69").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("69").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("69").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 70:
                            numTask++;
                            mDatabase.child("Tasks").child("70").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("70").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("70").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("70").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("70").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("70").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("70").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 71:

                            numTask++;
                            mDatabase.child("Tasks").child("71").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("71").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("71").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("71").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("71").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("71").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("71").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");

                            break;
                        case 72:
                            numTask++;
                            mDatabase.child("Tasks").child("72").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("72").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("72").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("72").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("72").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("72").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("72").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 73:
                            numTask++;
                            mDatabase.child("Tasks").child("73").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("73").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("73").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("73").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("73").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("73").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("73").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 74:
                            numTask++;
                            mDatabase.child("Tasks").child("74").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("74").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("74").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("74").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("74").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("74").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("74").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 75:
                            numTask++;
                            mDatabase.child("Tasks").child("75").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("75").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("75").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("75").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("75").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("75").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("75").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 76:
                            numTask++;
                            mDatabase.child("Tasks").child("76").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("76").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("76").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("76").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("76").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("76").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("76").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 77:
                            numTask++;
                            mDatabase.child("Tasks").child("77").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("77").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("77").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("77").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("77").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("77").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("77").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 78:
                            numTask++;
                            mDatabase.child("Tasks").child("78").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("78").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("78").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("78").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("78").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("78").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("78").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 79:
                            numTask++;
                            mDatabase.child("Tasks").child("79").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("79").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("79").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("79").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("79").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("79").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("79").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 80:
                            numTask++;
                            mDatabase.child("Tasks").child("80").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("80").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("80").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("80").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("80").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("80").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("80").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 81:

                            numTask++;
                            mDatabase.child("Tasks").child("81").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("81").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("81").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("81").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("81").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("81").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("81").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");

                            break;
                        case 82:
                            numTask++;
                            mDatabase.child("Tasks").child("82").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("82").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("82").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("82").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("82").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("82").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("82").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 83:
                            numTask++;
                            mDatabase.child("Tasks").child("83").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("83").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("83").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("83").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("83").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("83").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("83").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 84:
                            numTask++;
                            mDatabase.child("Tasks").child("84").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("84").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("84").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("84").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("84").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("84").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("84").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 85:
                            numTask++;
                            mDatabase.child("Tasks").child("85").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("85").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("85").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("85").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("85").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("85").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("85").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 86:
                            numTask++;
                            mDatabase.child("Tasks").child("86").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("86").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("86").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("86").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("86").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("86").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("86").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 87:
                            numTask++;
                            mDatabase.child("Tasks").child("87").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("87").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("87").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("87").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("87").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("87").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("87").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 88:
                            numTask++;
                            mDatabase.child("Tasks").child("88").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("88").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("88").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("88").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("88").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("88").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("88").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 89:
                            numTask++;
                            mDatabase.child("Tasks").child("89").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("89").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("89").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("89").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("89").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("89").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("89").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 90:
                            numTask++;
                            mDatabase.child("Tasks").child("90").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("90").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("90").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("90").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("90").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("90").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("90").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 91:

                            numTask++;
                            mDatabase.child("Tasks").child("91").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("91").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("91").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("91").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("91").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("91").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("91").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");

                            break;
                        case 92:
                            numTask++;
                            mDatabase.child("Tasks").child("92").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("92").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("92").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("92").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("92").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("92").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("92").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 93:
                            numTask++;
                            mDatabase.child("Tasks").child("93").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("93").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("93").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("93").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("93").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("93").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("93").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 94:
                            numTask++;
                            mDatabase.child("Tasks").child("94").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("94").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("94").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("94").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("94").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("94").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("94").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 95:
                            numTask++;
                            mDatabase.child("Tasks").child("95").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("95").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("95").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("95").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("95").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("95").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("95").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 96:
                            numTask++;
                            mDatabase.child("Tasks").child("96").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("96").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("96").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("96").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("96").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("96").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("96").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 97:
                            numTask++;
                            mDatabase.child("Tasks").child("97").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("97").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("97").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("97").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("97").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("97").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("97").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 98:
                            numTask++;
                            mDatabase.child("Tasks").child("98").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("98").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("98").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("98").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("98").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("98").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("98").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 99:
                            numTask++;
                            mDatabase.child("Tasks").child("99").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("99").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("99").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("99").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("99").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("99").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("99").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                        case 100:
                            numTask++;
                            mDatabase.child("Tasks").child("100").child("target").setValue(target.getText().toString());
                            mDatabase.child("Tasks").child("100").child("name").setValue(name.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("100").child("location").setValue(location.getText().toString());
                            mDatabase.child("Tasks").child("100").child("depart").setValue(depart.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("100").child("point").setValue(point.getSelectedItem().toString());
                            mDatabase.child("Tasks").child("100").child("team").setValue(team.getText().toString());
                            mDatabase.child("Tasks").child("100").child("date").setValue(date.getText().toString());
                            mDatabase.child("numTask").setValue(numTask);
                            target.setText("");
                            location.setText("");
                            team.setText("");
                            date.setText("");
                            break;
                    }
                 Toast.makeText(Add_Task.this, "تم رفع المهمة بالتوفيق", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
   }

