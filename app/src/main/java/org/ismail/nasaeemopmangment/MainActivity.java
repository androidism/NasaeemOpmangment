package org.ismail.nasaeemopmangment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.text.style.UpdateLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {

        EditText usertxt1, passtxt1;
        Button btnlog1;
    //    DatabaseReference databaseReference;
        FirebaseAuth firebaseAuth;
        FirebaseUser firebaseUser;
    String tag = "AnonymousAuth";



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlog1 =findViewById(R.id.btnlog);
        usertxt1 =findViewById(R.id.usertxt);
        passtxt1 =findViewById(R.id.passtxt);

        firebaseAuth = FirebaseAuth.getInstance();

        btnlog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email =usertxt1.getText().toString().trim();
                String pass =passtxt1.getText().toString().trim();

                if (!email.isEmpty()&& !pass.isEmpty())
                {
                    firebaseAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task)
                        {
                            if (task.isSuccessful()) {
                                Toast.makeText(MainActivity.this, "Welcome TO", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                                startActivity(intent);
                            } else
                                {
                                Toast.makeText(MainActivity.this, "Failed Logged", Toast.LENGTH_SHORT).show();
                                }
                            //      if(task.isSuccessful()){
                            //   Log.d(tag,"Completed");
                            //    FirebaseUser user= firebaseAuth.getCurrentUser();
                            //    updateUI(user);
                        }

                              //  Log.w(tag, "linkWithCredential:failure", task.getException());
                              //  Toast.makeText(MainActivity.this,"Failed!",Toast.LENGTH_SHORT).show();
                              //  updateUI(null);

                           // Toast.makeText(MainActivity.this,"Welcome!",Toast.LENGTH_SHORT).show();
                         //   Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                           // startActivity(intent);

                    });
                }
            }

            });

        }

    }

/*
        btnlog =findViewById(R.id.btnlog);
        usertxt =findViewById(R.id.usertxt);
        passtxt =findViewById(R.id.passtxt);

        firebaseAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference().child("User:");

      btnlog.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String txtemail= usertxt.getText().toString().trim();
              String txtpass= passtxt.getText().toString().trim();
              firebaseAuth.createUserWithEmailAndPassword(txtemail,txtpass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                  @Override
                  public void onComplete(@NonNull Task<AuthResult> task) {
                      if(task.isSuccessful()){
                          firebaseUser=task.getResult().getUser();
                          DatabaseReference newyUser =databaseReference.child(firebaseUser.getUid());
                          newyUser.child("User:").setValue(txtemail);
                          newyUser.child("password:").setValue(txtpass);
                          Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                          startActivity(intent);
                          Toast.makeText(MainActivity.this,"Registry_Successfully",Toast.LENGTH_SHORT).show();

                      }else{
                          Toast.makeText(MainActivity.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();

                      }
                  }
              });
          }
      });
    }
}

 */
