package com.peress.gondola_chofer;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by matt on 18-11-17.
 */

public class FirebaseInit {
    private static FirebaseDatabase database;

    public static void initDatabase(){
        database=FirebaseDatabase.getInstance();

    }

    public static DatabaseReference refRootDatabase(){
        return database.getReference();
    }
}
