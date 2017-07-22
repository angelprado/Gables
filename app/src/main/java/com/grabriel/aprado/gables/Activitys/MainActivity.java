package com.grabriel.aprado.gables.Activitys;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.grabriel.aprado.gables.Fragments.FutureItemFragment;
import com.grabriel.aprado.gables.FutureItem;
import com.grabriel.aprado.gables.R;

public class MainActivity extends AppCompatActivity implements FutureItemFragment.OnListFragmentInteractionListener {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.navigation_home:
                    android.support.v4.app.Fragment fg = new FutureItemFragment();
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft  = fm.beginTransaction();
                    ft.replace(R.id.content,fg);
                    ft.commit();
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_notifications:
                    return true;
                case R.id.Setting:
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_home);
    }

    @Override
    public void onListFragmentInteraction(FutureItem item) {

    }
}
