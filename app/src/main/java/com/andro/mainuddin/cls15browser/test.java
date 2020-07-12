package com.andro.mainuddin.cls15browser;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class test extends AppCompatActivity {

    List<User> uList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );


        uList = new ArrayList();

        uList.add(new User("Akash","http://fb.com/user1",R.drawable.tintin_thumb));
        uList.add(new User("Sany","http://fb.com/user2",R.drawable.snowy_thumb));
        uList.add(new User("Tamim","http://fb.com/user3",R.drawable.tintin_thumb));
        uList.add(new User("Tutul","http://fb.com/user4",R.drawable.obelix_thumb));
        uList.add(new User("Sultan","http://fb.com/user1",R.drawable.tintin_thumb));
        uList.add(new User("Mahmudur","http://fb.com/user2",R.drawable.snowy_thumb));
        uList.add(new User("Rifat","http://fb.com/user3",R.drawable.tintin_thumb));
        uList.add(new User("Hridoy","http://fb.com/user4",R.drawable.obelix_thumb));



    }
}
