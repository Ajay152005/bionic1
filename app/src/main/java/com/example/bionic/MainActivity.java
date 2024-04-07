package com.example.bionic;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.Gravity;


import com.example.bionic.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private final String[] quotes = {
            "The only way to do great work is to love what you do. - Steve Jobs",
            "Innovation distinguishes between a leader and a follower. - Steve Jobs",
            "Your time is limited, don’t waste it living someone else’s life. - Steve Jobs",
            "Stay hungry, stay foolish. - Steve Jobs",
            "Quality is not an act, it is a habit. - Aristotle"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Hello, World!");
        Button generateQuoteButton = findViewById(R.id.generateQuoteButton);
        generateQuoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Generate a random number to select a quote from the array
                Random random = new Random();
                int randomNumber = random.nextInt(quotes.length);

                // Get the randomly selected quote from the array
                String randomQuote = quotes[randomNumber];

                // Update the TextView with the random quote
                TextView textView = findViewById(R.id.textView);
                textView.setTextSize(24); // Set text size to 24sp (adjust as needed)
                textView.setGravity(Gravity.CENTER);
                textView.setText(randomQuote);
            }
        });

    }
}
