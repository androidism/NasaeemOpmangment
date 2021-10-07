package org.ismail.nasaeemopmangment.sub;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class Firebase {
    public static CollectionReference ref_user;

    public static void initFirebase(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
   ref_user = db.collection("user");
    }
}
