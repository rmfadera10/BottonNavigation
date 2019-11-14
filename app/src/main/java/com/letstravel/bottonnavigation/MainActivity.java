package com.letstravel.bottonnavigation;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import fragment.LoginFragment;

public class MainActivity extends AppCompatActivity {
    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = getSupportActionBar();

        //toolbar.setTitle("Shop");
        loadFragment(new LoginFragment());
    }
    private void loadFragment(LoginFragment fragment) {
        // load fragment
        //LoginFragment loginFragment=new LoginFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.loginFragmentContainer, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
