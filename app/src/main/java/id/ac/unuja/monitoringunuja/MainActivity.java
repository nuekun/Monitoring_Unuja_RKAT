package id.ac.unuja.monitoringunuja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

import id.ac.unuja.monitoringunuja.Utils.TabAdapter;

public class MainActivity extends AppCompatActivity {
    ViewPager pageMain;
    TabLayout tabMain;
    TabAdapter tabAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Init();

    }

    private void Init() {
        pageMain = findViewById(R.id.mainPage);
        tabAdapter = new TabAdapter(getSupportFragmentManager(),MainActivity.this);
        pageMain.setAdapter(tabAdapter);
        tabMain = findViewById(R.id.mainTab);
        tabMain.setupWithViewPager(pageMain);
        Objects.requireNonNull(getSupportActionBar()).setTitle("RKAT");
    }
}
