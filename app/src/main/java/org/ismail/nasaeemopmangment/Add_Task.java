package org.ismail.nasaeemopmangment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Add_Task extends AppCompatActivity {
    ImageButton imageButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        getSupportActionBar().hide();

        imageButton=findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Add_Task.this, MainActivity2.class);
                startActivity(intent);

                Toast.makeText(Add_Task.this,"ضيف المهمة من بعد إذنك ولاتترك بنود فاضي",Toast.LENGTH_SHORT).show();
            }
        });




    }
}