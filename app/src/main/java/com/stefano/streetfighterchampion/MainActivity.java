package com.stefano.streetfighterchampion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int balrogScore = 0;
    int edScore = 0;
    int bisonScore = 0;

    TextView textWins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Drawable background = getDrawable(R.drawable.background);
        background.setAlpha(80);

        textWins = findViewById(R.id.textWins);
        textWins.setVisibility(View.GONE);

        balrogScore();
        edScore();
        bisonScore();
        whoWin();
    }

    private void balrogScore() {
        Button btnWon1 = findViewById(R.id.btnWon1);
        Button btnLose1 = findViewById(R.id.btnLose1);

        btnWon1.setOnClickListener(view -> {
            balrogScore++;
        });

        btnLose1.setOnClickListener(view -> {
            balrogScore--;
        });
    }

    private void edScore() {
        Button btnWon2 = findViewById(R.id.btnWon2);
        Button btnLose2 = findViewById(R.id.btnLose2);

        btnWon2.setOnClickListener(view -> {
            edScore++;
        });

        btnLose2.setOnClickListener(view -> {
            edScore--;
        });
    }

    private void bisonScore() {
        Button btnWon3 = findViewById(R.id.btnWon3);
        Button btnLose3 = findViewById(R.id.btnLose3);

        btnWon3.setOnClickListener(view -> {
            bisonScore++;
        });

        btnLose3.setOnClickListener(view -> {
            bisonScore--;
        });
    }

    private void whoWin() {
        Button btnWhoWin = findViewById(R.id.btnWhoWon);

        btnWhoWin.setOnClickListener(view -> {
            if (balrogScore > edScore && balrogScore > bisonScore) {
                textWins.setText("Balrog Wins! " + balrogScore + " Wins!");
            } else if (edScore > bisonScore) {
                textWins.setText("Ed Wins! " + edScore + " Wins!");
            } else {
                textWins.setText("Bison Wins! " + bisonScore + " Wins!");
            }
        });

        textWins.setVisibility(View.VISIBLE);
    }
}