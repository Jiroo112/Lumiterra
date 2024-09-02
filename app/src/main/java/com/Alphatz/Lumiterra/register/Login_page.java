package com.Alphatz.Lumiterra.register;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.Alphatz.Lumiterra.R;

public class Login_page extends AppCompatActivity {

    TextView regist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        regist = findViewById(R.id.singup);
        regist.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        SpannableString spannableString = new SpannableString(regist.getText().toString());
                        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                        regist.setText(spannableString);
                        return true;

                    case MotionEvent.ACTION_UP:
                        regist.setText(regist.getText().toString());
                        Intent intent = new Intent(Login_page.this, regis.class);
                        startActivity(intent);
                        return true;
                }
                return false;
            }
        });
    }
}