package in.nareshtech.androiduicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText person_name, person_age;
    private Button submit;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        person_name = findViewById(R.id.person_name);
        person_age = findViewById(R.id.person_age);
        submit = findViewById(R.id.button);
        textView = findViewById(R.id.result);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = person_name.getText().toString();
                int a = Integer.parseInt(person_age.getText().toString());
                textView.setText(n+"\n"+a);

                //clear the contents of the TextInputEditText boxes
                person_name.getText().clear();
                person_age.getText().clear();
                person_age.clearFocus();
            }
        });
    }
}