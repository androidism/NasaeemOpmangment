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
    private FirebaseAuth mAuth;
    // FirebaseUser mUser;
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


        btnlog = findViewById(R.id.btnlog);
        progressDialog=new ProgressDialog(this);
        usertxt =findViewById(R.id.usertxt);
        passtxt = findViewById(R.id.passtxt);
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                perforLogin();
            }

        });
        }


    private void perforLogin() {

        String email = usertxt.getText().toString().trim();
        String pass = passtxt.getText().toString().trim();

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            usertxt.setError("Enter this your email !");
            usertxt.requestFocus();
            return;
        }
        if (pass.isEmpty()) {
            passtxt.setError("Enter this your password !");
            passtxt.requestFocus();
            return;
        }
        if (pass.length() < 6) {
            passtxt.setError("Min password  length is 6 Characters!");
            passtxt.requestFocus();
            return;
        }
/*
        mAuth.signInWithEmailAndPassword(email, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                         //   Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                        //    updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                         //   Log.w(TAG, "signInWithEmail:failure", task.getException());
                        //    Toast.makeText(EmailPasswordActivity.this, "Authentication failed.",
                               //     Toast.LENGTH_SHORT).show();
                           // updateUI(null);
                        }
                    }
                });
*/



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
                    Toast.makeText(MainActivity.this,"يرجى كتابة الإيميل وكلمة السر بشكل صحيح"+task.getException(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private void sendUserToNextActivity() {
        Intent intent=new Intent(MainActivity.this,Add_Task.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    };



    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser mAuthCurrentUser = mAuth.getCurrentUser();
        if(mAuthCurrentUser != null){
            Intent intent=new Intent(MainActivity.this,Add_Task.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        }
        else {

        }
    }

    }
