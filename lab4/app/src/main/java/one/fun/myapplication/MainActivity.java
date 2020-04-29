package one.fun.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MusicLibraryItem> musicLibraryItems = new ArrayList<>();

        musicLibraryItems.add(new MusicLibraryItem(R.drawable.key,
                Utils.BORN_TO_DIE.replace("_", " "),
                Utils.AUTHOR_LANA1));
        musicLibraryItems.add(new MusicLibraryItem(R.drawable.key,
                Utils.SUMMERTIME_SADNESS.replace("_", " "),
                Utils.AUTHOR_LANA3));
        musicLibraryItems.add(new MusicLibraryItem(R.drawable.key,
                Utils.VIDEO_GAMES.replace("_", " "),
                Utils.AUTHOR_LANA2));
        musicLibraryItems.add(new MusicLibraryItem(R.drawable.key,
                Utils.YOUNG_AND_BEAUTIFUL.replace("_", " "),
                Utils.AUTHOR_LANA4));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new MusicLibraryAdapter(musicLibraryItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }


}
