package com.example.btl;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView rv = findViewById(R.id.rvLessons);
        rv.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Lesson> lessons = new ArrayList<>();
        lessons.add(new Lesson("Basic Greetings", "Learn how to say hello and goodbye", "+50 XP", 100));
        lessons.add(new Lesson("Common Phrases", "Essential everyday expressions", "+30 XP", 60));
        lessons.add(new Lesson("Numbers & Counting", "Count from 1 to 100", "+30 XP", 0));
        lessons.add(new Lesson("Food & Drinks", "Order at restaurants and cafes", "+30 XP", 0));
        lessons.add(new Lesson("Basic Greetings", "Learn how to say hello and goodbye", "+50 XP", 100));
        lessons.add(new Lesson("Common Phrases", "Essential everyday expressions", "+30 XP", 60));
        lessons.add(new Lesson("Numbers & Counting", "Count from 1 to 100", "+30 XP", 0));
        lessons.add(new Lesson("Food & Drinks", "Order at restaurants and cafes", "+30 XP", 0));

        rv.setAdapter(new LessonAdapter(lessons));
    }
}
