package org.ismail.nasaeemopmangment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import org.ismail.nasaeemopmangment.sub.Firebase;
import org.ismail.nasaeemopmangment.sub.Fun;

import java.util.Locale;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    Context context =this;


    TextInputEditText email;

    TextInputEditText password;

    @Override
    protected  void  onCreate(Bundle savedInstancestate) {
        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }


    public void btn_login(View v){
        try{
            String enteredEmail = email.getText().toString().toLowerCase(Locale.ROOT).trim();
            String enteredPassword = password.getText().toString();
            if (TextUtils.isEmpty(enteredEmail)||TextUtils.isEmpty(enteredPassword)){
                Toast.makeText(context, "All Fields must be Filled", Toast.LENGTH_SHORT).show();
                return;
            }
            if(!Fun.isValidEmail(enteredEmail)){
                email.setError("Invalid email entered");
                return;
            }else{
                email.setError(null);
            }
            Firebase.ref_user
                    .whereEqualTo("email",enteredEmail)
                    .whereEqualTo("password",enteredPassword)
                    .get()
                    .addOnCompleteListener(task -> {
                        if(task.isSuccessful()){
                            for(QueryDocumentSnapshot document: task.getResult()){
                                splash.set_shared_preferences("user_id",document.getId());

                                Intent i = new Intent(context,MainActivity2.class);
                                startActivity(i);
                                finish();
                            }
                            if(task.getResult().isEmpty()){
                                Toast.makeText(context,"InCorrect Login",Toast.LENGTH_LONG).show();
                            }else{
                                Toast.makeText(context,"Field Login",Toast.LENGTH_LONG).show();
                            }
                        }
                    });
        }
        catch (Exception e){
            Toast.makeText(context,"Field oo Login",Toast.LENGTH_LONG).show();
        }
    }
}
