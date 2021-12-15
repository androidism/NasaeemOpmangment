package org.ismail.nasaeemopmangment;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TableRow;
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
    public boolean isAppRunning = true;

    public void setIsAppRunning(boolean v){
        isAppRunning = v;
    }

    public boolean isAppRunning(){
        return isAppRunning;
    }




    FloatingActionButton add_task, edit_task;
    ExtendedFloatingActionButton fab;
    TextView ta_add, ta_edit;



TextView name1,point1,target1,team1,location1,Section1,
    name2,point2,target2,team2,location2,Section2,
    name3,point3,target3,team3,location3,Section3,
    name4,point4,target4,team4,location4,Section4,
    name5,point5,target5,team5,location5,Section5;
TableRow Tab1,Tab2,Tab3,Tab4,Tab5,Tab6,Tab7,Tab8,Tab9,Tab10;
    Integer numTask;



    Boolean isAllFABVisible,v,valid=true;


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



                        Toast.makeText(MainActivity2.this, "ضيف المهمة من بعد إذنك", Toast.LENGTH_SHORT).show();
                    }
                });











            }
        });
        name1 = findViewById(R.id.name1);
        point1 = findViewById(R.id.point1);
        Section1 = findViewById(R.id.Section1);
        target1 = findViewById(R.id.target1);
        team1 = findViewById(R.id.team1);
        location1 = findViewById(R.id.location1);

        name2 = findViewById(R.id.name2);
        point2 = findViewById(R.id.point2);
        Section2 = findViewById(R.id.Section2);
        target2 = findViewById(R.id.target2);
        team2 = findViewById(R.id.team2);
        location2 = findViewById(R.id.location2);

        name3 = findViewById(R.id.name3);
        point3 = findViewById(R.id.point3);
        Section3 = findViewById(R.id.Section3);
        target3 = findViewById(R.id.target3);
        team3 = findViewById(R.id.team3);
        location3 = findViewById(R.id.location3);

        name4 = findViewById(R.id.name4);
        point4 = findViewById(R.id.point4);
        Section4 = findViewById(R.id.Section4);
        target4 = findViewById(R.id.target4);
        team4 = findViewById(R.id.team4);
        location4 = findViewById(R.id.location4);

        name5 = findViewById(R.id.name5);
        point5 = findViewById(R.id.point5);
        Section5 = findViewById(R.id.Section5);
        target5 = findViewById(R.id.target5);
        team5 = findViewById(R.id.team5);
        location5 = findViewById(R.id.location5);
        Tab1= findViewById(R.id.Tab1);
        Tab2= findViewById(R.id.Tab2);
        Tab3= findViewById(R.id.Tab3);
        Tab4= findViewById(R.id.Tab4);
        Tab5= findViewById(R.id.Tab5);




    }


    @Override
    public void onResume() {
        v = true;
        super.onResume();
        setIsAppRunning(v);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference num = database.getReference("numTask");
        num.addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                numTask = dataSnapshot.getValue(Integer.class);
                if (numTask == 2)
                    Tab1.setVisibility(View.VISIBLE);
                if (numTask == 3) {
                    Tab1.setVisibility(View.VISIBLE);
                    Tab2.setVisibility(View.VISIBLE);
                }
                if (numTask == 4) {
                    Tab1.setVisibility(View.VISIBLE);
                    Tab2.setVisibility(View.VISIBLE);
                    Tab3.setVisibility(View.VISIBLE);
                }
                if (numTask == 5) {
                    Tab1.setVisibility(View.VISIBLE);
                    Tab2.setVisibility(View.VISIBLE);
                    Tab3.setVisibility(View.VISIBLE);
                    Tab4.setVisibility(View.VISIBLE);
                }
                if (numTask == 6) {
                    Tab1.setVisibility(View.VISIBLE);
                    Tab2.setVisibility(View.VISIBLE);
                    Tab3.setVisibility(View.VISIBLE);
                    Tab4.setVisibility(View.VISIBLE);
                    Tab5.setVisibility(View.VISIBLE);
                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });










      /*   if (numTask==2)
            Tab1.setVisibility(View.VISIBLE);
            Tab2.setVisibility(View.VISIBLE);
            if (numTask==3)
        Tab1.setVisibility(View.VISIBLE);
        Tab2.setVisibility(View.VISIBLE);
        Tab3.setVisibility(View.VISIBLE);
              if (numTask==4)
        Tab1.setVisibility(View.VISIBLE);
        Tab2.setVisibility(View.VISIBLE);
        Tab3.setVisibility(View.VISIBLE);
        Tab4.setVisibility(View.VISIBLE);
              if (numTask==5)
        Tab1.setVisibility(View.VISIBLE);
        Tab2.setVisibility(View.VISIBLE);
        Tab3.setVisibility(View.VISIBLE);
        Tab4.setVisibility(View.VISIBLE);
        Tab5.setVisibility(View.VISIBLE);
*/
        DatabaseReference mDatabase = database.getReference("Tasks");

        // edit_task.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //   public void onClick(View view) {


        mDatabase.child("1").child("depart").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Section1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("1").child("point").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                point1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("1").child("location").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                location1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("1").child("name").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                name1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("1").child("target").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                target1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("1").child("team").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                team1.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        mDatabase.child("2").child("depart").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Section2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("2").child("point").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                point2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("2").child("location").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                location2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("2").child("name").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                name2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("2").child("target").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                target2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("2").child("team").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                team2.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("3").child("depart").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Section3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                //  error.toException();
            }
        });
        mDatabase.child("3").child("point").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                point3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("3").child("location").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                location3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("3").child("name").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                name3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("3").child("target").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                target3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("3").child("team").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                team3.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mDatabase.child("4").child("depart").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Section4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("4").child("point").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                point4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("4").child("location").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                location4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("4").child("name").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                name4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("4").child("target").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                target4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("4").child("team").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                team4.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("depart").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Section5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("point").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                point5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("location").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                location5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("name").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                name5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("target").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                target5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        mDatabase.child("5").child("team").addValueEventListener(new ValueEventListener() {


            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                team5.setText(dataSnapshot.getValue(String.class));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });
        edit_task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isConnected()) {
                    Toast.makeText(getApplicationContext(), "تم التحديث بنجاح", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "لا يوجد اتصال بالأنترنت", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public boolean isConnected() {
        boolean connected = false;
        try {
            ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo nInfo = cm.getActiveNetworkInfo();
            connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();
            return connected;
        } catch (Exception e) {
            Log.e("Connectivity Exception", e.getMessage());
        }
        return connected;




    }

}