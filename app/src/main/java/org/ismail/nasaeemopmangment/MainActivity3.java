package org.ismail.nasaeemopmangment;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.signature);
        Thread splashScreenStarter = new Thread() {
            public void run() {
                try {
                    int delay = 0;
                    while (delay < 2000) {
                        sleep(10);
                        delay = delay + 100;
                    }
                    //R.anim.nav_default_pop_exit_anim
                    startActivity(new Intent(MainActivity3.this, Add_Task.class));
                   overridePendingTransition(0,R.anim.nav_default_pop_exit_anim);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }

        };
        splashScreenStarter.start();

    }
}