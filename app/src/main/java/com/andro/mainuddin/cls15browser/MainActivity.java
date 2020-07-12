package com.andro.mainuddin.cls15browser;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView list;
    List<User> userList;

    CustomUserAdapter customUserAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById( R.id.list);


        userList = new ArrayList();

        userList.add(new User("Akash","http://fb.com/user1",R.drawable.tintin_thumb));
        userList.add(new User("Sany","http://fb.com/user2",R.drawable.snowy_thumb));
        userList.add(new User("Tamim","http://fb.com/user3",R.drawable.tintin_thumb));
        userList.add(new User("Tutul","http://fb.com/user4",R.drawable.obelix_thumb));
        userList.add(new User("Sultan","http://fb.com/user1",R.drawable.tintin_thumb));
        userList.add(new User("Mahmudur","http://fb.com/user2",R.drawable.snowy_thumb));
        userList.add(new User("Rifat","http://fb.com/user3",R.drawable.tintin_thumb));
        userList.add(new User("Hridoy","http://fb.com/user4",R.drawable.obelix_thumb));





        customUserAdapter = new CustomUserAdapter(this,R.layout.custom_user_layout, userList);
        list.setAdapter(customUserAdapter);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate( R.menu.menu,menu );

        MenuItem searchItems = menu.findItem( R.id.item_search );
        SearchView searchView = (SearchView) searchItems.getActionView();

        searchView.setOnQueryTextListener( new SearchView.OnQueryTextListener() {


            @Override
            public boolean onQueryTextChange(String newText) {
                ArrayList<User> templist = new ArrayList<>(  );

                for(User temp : userList)
                {
                    if (temp.name.toLowerCase().contains( newText.toLowerCase() ))
                    { templist.add( temp ); }
                }

                CustomUserAdapter adp = new CustomUserAdapter( MainActivity.this,R.layout.custom_user_layout,templist );

                list.setAdapter( adp );


                return true;
            }


            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

        } );

        return super.onCreateOptionsMenu( menu );
    }








//
//    @Override
//    protected void onListItemClick(ListView l, View v, int position, long id) {
//        super.onListItemClick(l, v, position, id);
//
//        User user = customUserAdapter.getItem(position);
//        Intent myIntent= new Intent(
//                Intent.ACTION_VIEW,
//                Uri.parse(user.getUrl()));
//        startActivity(myIntent);
//
//    }
}
