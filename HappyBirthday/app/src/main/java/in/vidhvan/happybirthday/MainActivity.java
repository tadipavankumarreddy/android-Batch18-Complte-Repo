package in.vidhvan.happybirthday;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout til;
    private ActivityResultLauncher<Intent> launcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        til = findViewById(R.id.user_name);

        launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                // This method is invoked when there is a response from the activity that is being called
                // from this activity. all this response will be present in the `result`
                if(result.getResultCode() == 123){
                    Intent i = result.getData();
                    String msg = i.getStringExtra("RESULT");
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                }else{
                    Intent i = result.getData();
                    String msg = i.getStringExtra("RESULT");
                    Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void wishMe(View view) {
        String n = til.getEditText().getText().toString();
        /**
         * we can pass any number of pieces of data through an Intent Object
         * However, every single piece of datum needs to be having a key.*/
        Intent i = new Intent(this,WishActivity.class);
        i.putExtra("DATA",n);
        /*startActivity(i);*/
        launcher.launch(i);
    }
}