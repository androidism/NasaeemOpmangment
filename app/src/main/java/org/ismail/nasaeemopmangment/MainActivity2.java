package org.ismail.nasaeemopmangment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity2 extends AppCompatActivity {
    FloatingActionButton add_task, edit_task;
    ExtendedFloatingActionButton fab;
    TextView ta_add, ta_edit;


    //EditText name1,name2,name3,name4,name5;

   // EditText target1 ,target2,target3,target4,target5;

  //  EditText team1,team2,team3,team4,team5;

  //  EditText location1,location2,location3,location4,location5;
TextView name1,target1,team1,location1,Section1;



    Boolean isAllFABVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        add_task = findViewById(R.id.add_task);
        edit_task = findViewById(R.id.edit_task);
        fab = findViewById(R.id.fab);
        ta_add = findViewById(R.id.ta_add);
        ta_edit = findViewById(R.id.ta_edit);

        ta_add.setVisibility(View.GONE);
        ta_edit.setVisibility(View.GONE);
        edit_task.setVisibility(View.GONE);
        add_task.setVisibility(View.GONE);

        isAllFABVisible=false;

        fab.shrink();




        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference mDatabase = database.getReference("Tasks");

// Read from the database
        mDatabase.child("name").child("-MpSFLv5row9RFyb81v9").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                name1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                //   Log.w(TAG, "Failed to read value.", error.toException());
            }
        });


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!isAllFABVisible) {
                    add_task.show();
                    edit_task.show();
                    ta_add.setVisibility(View.VISIBLE);
                    ta_edit.setVisibility(View.VISIBLE);

                    fab.extend();
                    fab.setIconTintResource(R.color.design_default_color_error);
                    fab.setRotation(44);


                    isAllFABVisible = true;


                } else {
                    fab.setRotation(180);
                    add_task.hide();
                    edit_task.hide();
                    ta_edit.setVisibility(View.GONE);
                    ta_add.setVisibility(View.GONE);
                    fab.shrink();
                    fab.setIconTintResource(R.color.ic_cansl_background);

                    isAllFABVisible = false;


                }

                add_task.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity2.this, Add_Task.class);
                        startActivity(intent);


                        /*
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference mDatabase = database.getReference("nm");
                        mDatabase.addValueEventListener (new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                // This method is called once with the initial value and again
                                // whenever data at this location is updated.
                                String textView2  = dataSnapshot.getValue(String.class);
                                Log.d(TAG,textView2.toString());
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {
                               // Log.w(TAG, "Failed to read value.", error.toException());

                            }

                        });*/

                        Toast.makeText(MainActivity2.this, "ضيف المهمة من بعد إذنك", Toast.LENGTH_SHORT).show();
                    }
                });


                name1 = findViewById(R.id.name1);
                Section1 = findViewById(R.id.Section1);
                target1 = findViewById(R.id.target1);
                team1 = findViewById(R.id.team1);
                location1 = findViewById(R.id.location1);






                      //  Toast.makeText(MainActivity2.this, "بالتوفيق في مهمتك ولاتنسى تتأكد من الموافقة عليها", Toast.LENGTH_SHORT).show();

            }
        });




    }

}