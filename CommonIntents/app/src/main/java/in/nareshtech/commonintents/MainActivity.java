package in.nareshtech.commonintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout maps_til;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maps_til = findViewById(R.id.address_til);
    }

    public void openMaps(View view) {
        // logic to open the maps with the address given.
        String address = maps_til.getEditText().getText().toString();
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:0,0?q="+address));

        // Start the acitivty
        startActivity(i);
    }
}