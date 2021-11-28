package org.ismail.nasaeemopmangment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

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
   /*     FirebaseDatabase database = FirebaseDatabase.getInstance();



        add_tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference  mDatabase = database.getReference("Tasks");

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

*/
    }

}