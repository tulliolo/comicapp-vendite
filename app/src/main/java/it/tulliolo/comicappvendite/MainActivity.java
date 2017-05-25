package it.tulliolo.comicappvendite;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(getLocalClassName(), "onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BottomNavigationView bnw = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bnw.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return true;
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            switchSection(bnw.getSelectedItemId());
        }
    }

    private boolean isLayoutSingle() {
        return (findViewById(R.id.fragment_details_container) == null);
    }

    private void switchSection(@IdRes int id) {
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = null;
        Fragment fragmentDetails = null;

        if (!isLayoutSingle()) {
            fragmentDetails = fm.findFragmentById(R.id.fragment_details_container);
        }

        switch (id) {
            case R.id.menu_item_catalogue:
                fragment = new CatalogueFragment();
                break;
            case R.id.menu_item_sales:
                fragment = new CatalogueFragment();
                break;
            case R.id.menu_item_reports:
                fragment = new CatalogueFragment();
                break;
            default:
                fragment = new CatalogueFragment();
                break;
        }

        if (fragmentDetails != null) {
            fm.beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .remove(fragmentDetails)
                    .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit();
        } else {
            fm.beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .commit();
        }
    }
}