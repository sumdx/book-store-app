package com.example.bookstore;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        RecyclerView newArrivalRecyclerView = findViewById(R.id.newArrivalRecyclerView);

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Bangladesh","author","This is a book", R.drawable.pridenprejudice,22.2,"not available",4.6));
        bookList.add(new Book("Bangladesh","author","This is a book", R.drawable.pridenprejudice,22.2,"available",4.6));
        bookList.add(new Book("Bangladesh","author","This is a book", R.drawable.pridenprejudice,22.2,"not available",4.6));
        bookList.add(new Book("Bangladesh","author","This is a book", R.drawable.pridenprejudice,22.2,"available",4.6));

        BookAdapter bookAdapter = new BookAdapter(this,bookList);

        newArrivalRecyclerView.setAdapter(bookAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,2);
        gridLayoutManager.setOrientation(GridLayoutManager.VERTICAL);
        newArrivalRecyclerView.setLayoutManager(gridLayoutManager);

        



    }
}