package org.ismail.nasaeemopmangment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {
     FirebaseAuth mAuth;
     FirebaseUser mUser;
     Button btnlog;
     EditText usertxt;
     EditText passtxt;
     String parentDbName = "User";
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mAuth = FirebaseAuth.getInstance();
        mUser=mAuth.getCurrentUser();
        btnlog =(Button) findViewById(R.id.btnlog);
        progressDialog=new ProgressDialog(this);
        usertxt =(EditText) findViewById(R.id.usertxt);
        passtxt =(EditText) findViewById(R.id.passtxt);
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                perforLogin();
            }

        });
        }


    private void perforLogin() {

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
        mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful())
                {
                    progressDialog.dismiss();
                    sendUserToNextActivity();
                    Toast.makeText(MainActivity.this, "تم الدخول بنجاح",Toast.LENGTH_SHORT).show();
                }else
                {
                    progressDialog.dismiss();
                    Toast.makeText(MainActivity.this,""+task.getException(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void sendUserToNextActivity() {
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
    @Override public void onStart() {

        super.onStart();
    }

    }
