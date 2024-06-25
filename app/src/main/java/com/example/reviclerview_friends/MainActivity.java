package com.example.reviclerview_friends;

// MainActivity.java
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Character> characterList = new ArrayList<>();
        characterList.add(new Character("Rachel Green", "A fashion enthusiast working at Ralph Lauren.", R.drawable.rachel));
        characterList.add(new Character("Monica Geller", "A chef who is known for her obsessive cleanliness.", R.drawable.monica));
        characterList.add(new Character("Phoebe Buffay", "A quirky musician with a troubled past.", R.drawable.phoebe));
        characterList.add(new Character("Joey Tribbiani", "A struggling actor who loves food.", R.drawable.joey));
        characterList.add(new Character("Chandler Bing", "A sarcastic executive in statistical analysis and data reconfiguration.", R.drawable.chandler));
        characterList.add(new Character("Ross Geller", "A paleontologist with a history of divorces.", R.drawable.ross));
        characterList.add(new Character("Janice Litman", "Chandler's ex-girlfriend known for her loud voice and laugh.", R.drawable.janice));
        characterList.add(new Character("Gunther", "The manager of Central Perk with an unrequited love for Rachel.", R.drawable.gunther));
        characterList.add(new Character("Mike Hannigan", "Phoebe's husband and a pianist.", R.drawable.mike));
        characterList.add(new Character("Carol Willick", "Ross's first ex-wife.", R.drawable.carol));

        CharacterAdapter adapter = new CharacterAdapter(characterList);
        recyclerView.setAdapter(adapter);
    }
}
