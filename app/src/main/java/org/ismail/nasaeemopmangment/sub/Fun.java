package org.ismail.nasaeemopmangment.sub;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import org.ismail.nasaeemopmangment.R;

public class Fun {
    public static boolean isValidEmail(String email){
        String emailpattern ="[a-zA-Z0-9._-]+@nasaeemkhair.org";
        return email.matches(emailpattern);
    }
    public static void pushFragment(FragmentActivity activity, Fragment fragment,String title){
       // activity.getSupportFragmentManager().beginTransaction().replace(con,fragment,title);
    }
}
