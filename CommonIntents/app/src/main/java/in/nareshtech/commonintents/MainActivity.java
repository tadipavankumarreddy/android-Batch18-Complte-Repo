package in.nareshtech.commonintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout maps_til, url_til, phone_til;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maps_til = findViewById(R.id.address_til);
        url_til = findViewById(R.id.url_til);
        phone_til = findViewById(R.id.phone_num);
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

    public void openBrowser(View view) {
        String u = url_til.getEditText().getText().toString();
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+u));
        startActivity(i);
    }


    public void openDailer(View view) {
        String n = phone_til.getEditText().getText().toString();
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+n));
        startActivity(i);
    }
}