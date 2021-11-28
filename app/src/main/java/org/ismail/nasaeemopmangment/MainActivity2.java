package org.ismail.nasaeemopmangment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity2 extends AppCompatActivity {
    FloatingActionButton add_task, edit_task;
    ExtendedFloatingActionButton fab;
    TextView ta_add, ta_edit;

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

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 if (!isAllFABVisible){
                     add_task.show();
                     edit_task.show();
                     ta_add.setVisibility(View.VISIBLE);
                     ta_edit.setVisibility(View.VISIBLE);

                     fab.extend();
                     fab.setIconTintResource(R.color.design_default_color_error);
                     fab.setRotation(44);


                     isAllFABVisible=true;


                 }else {
                     fab.setRotation(180);
                     add_task.hide();
                     edit_task.hide();
                     ta_edit.setVisibility(View.GONE);
                     ta_add.setVisibility(View.GONE);
                     fab.shrink();
                     fab.setIconTintResource(R.color.ic_cansl_background);

                     isAllFABVisible=false;


                 }

                add_task.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        Toast.makeText(MainActivity2.this,"ضيف المهمة من بعد إذنك",Toast.LENGTH_SHORT).show();
                    }
                });
                edit_task.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity2.this,"أعطي الموفقة لو سمحت",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        FirebaseDatabase database = FirebaseDatabase.getInstance();
/*Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

*/
    }

}