package org.luthfi.yamahamusicstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvGuitar;
    private ArrayList<Guitar> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGuitar = findViewById(R.id.rv_guitar);
        rvGuitar.setHasFixedSize(true);

        list.addAll(DataGuitar.getListData());
        showRecylerCardView();
    }
    private void showRecylerCardView(){
        rvGuitar.setLayoutManager(new LinearLayoutManager(this));
        CardViewYamaha cardViewYamaha = new CardViewYamaha(list);
        rvGuitar.setAdapter(cardViewYamaha);
    }
}
