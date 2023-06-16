package in.vidhvan.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WishActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish);

        textView = findViewById(R.id.textView);

        // Step 1: get the intent
        Intent i = getIntent();
        String data = i.getStringExtra("DATA");
        textView.setText(data);
    }

    public void respondToWish(View view) {
        Intent i = new Intent();
        i.putExtra("RESULT","Thank you");
        setResult(123,i);
        finish();
    }

    public void denyWish(View view) {
        Intent i = new Intent();
        i.putExtra("RESULT","My Birthday is not today");
        setResult(234,i);
        finish();
    }
}