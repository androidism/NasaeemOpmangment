package org.ismail.nasaeemopmangment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.ui.auth.data.model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.ismail.Prevalent.Prevalent;

import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private FirebaseAuth mAuth;
    private Button btnlog;
    private EditText usertxt;
    private EditText passtxt;
    private String parentDbName = "User";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

        btnlog =(Button) findViewById(R.id.btnlog);
        btnlog.setOnClickListener(this);

        usertxt =(EditText) findViewById(R.id.usertxt);
        passtxt =(EditText) findViewById(R.id.passtxt);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
        case R.id.btnlog: btnlog();
        break;
        }

}
    private void btnlog() {
     String email= usertxt.getText().toString().trim();
     String pass= passtxt.getText().toString().trim();

     if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
     {
         usertxt.setError("Enter this your email !");
         usertxt.requestFocus();
         return;
     }
        if(pass.isEmpty())
        {
            passtxt.setError("Enter this your password !");
            passtxt.requestFocus();
            return;
        }
        if(pass.length()<6)
        {
            passtxt.setError("Min password  length is 6 Characters!");
            passtxt.requestFocus();
            return;
        }
        /*
        mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>()
        {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    startActivity(new Intent(MainActivity.this  ,MainActivity2.class));
                }
                else
                    {
                        Toast.makeText(MainActivity.this, "Failed To Login!", Toast.LENGTH_LONG).show();
                    }
            }
        });
        */
    }
    private void AllowAccessToAccount(final String email, final String pass)
    {
        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getReference();
        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if (dataSnapshot.child(parentDbName).child(email).exists()){

                    User usersData = dataSnapshot.child(parentDbName).child(email).getValue(User.class);
                    if (usersData.getEmail().equals(email))
                    {
                        if (usersData.getPhoneNumber().equals(pass))
                        {
                           if (parentDbName.equals("User"))
                           {
                                Toast.makeText(MainActivity.this, "logged in Successfully...", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                                Prevalent.currentOnlineUser = usersData;
                                startActivity(intent);
                            }
                        }
                        else
                            {
                            Toast.makeText(MainActivity.this,"Password is incorrect",Toast.LENGTH_SHORT).show();
                            }
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Account with this " + email + " number do not exists.", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}