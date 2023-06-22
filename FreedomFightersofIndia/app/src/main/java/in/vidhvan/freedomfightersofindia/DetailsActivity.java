package in.vidhvan.freedomfightersofindia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView name, life, description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = findViewById(R.id.imageView);
        name = findViewById(R.id.textView);
        life = findViewById(R.id.textView2);
        description = findViewById(R.id.textView3);

        FreedomFighters fighters = (FreedomFighters) getIntent().getSerializableExtra("DATA");
        imageView.setImageResource(fighters.getPhoto());
        name.setText(fighters.getName());
        life.setText(fighters.getActiveYears());
        description.setText(fighters.getDescription());
    }
}