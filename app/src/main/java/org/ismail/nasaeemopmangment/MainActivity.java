package org.ismail.nasaeemopmangment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
//import android.content.Intent;
import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
/*
//import com.google.android.ads.mediationtestsuite.activities.HomeActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
*/
public class MainActivity extends AppCompatActivity {
    /*
        EditText usertxt, passtxt;
        Button btnlog;
        DatabaseReference databaseReference;
        FirebaseAuth firebaseAuth;
        FirebaseUser firebaseUser;


    */

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
