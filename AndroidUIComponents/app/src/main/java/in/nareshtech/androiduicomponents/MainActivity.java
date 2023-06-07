package in.nareshtech.androiduicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText person_name, person_age;
    private Button submit;
    private TextView textView;
    private RadioGroup g;
    private CheckBox english, french, german;
    private String gender = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        person_name = findViewById(R.id.person_name);
        person_age = findViewById(R.id.person_age);
        submit = findViewById(R.id.button);
        textView = findViewById(R.id.result);
        g = findViewById(R.id.gender);
        english = findViewById(R.id.eng);
        french = findViewById(R.id.fren);

        // Get the data as soon as an option is selected
        g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.male){
                    gender = "Male";
                }else{
                    gender = "Female";
                }
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = person_name.getText().toString();
                int a = Integer.parseInt(person_age.getText().toString());
                textView.setText(n+"\n"+a+"\n"+gender);

                //clear the contents of the TextInputEditText boxes
                person_name.getText().clear();
                person_age.getText().clear();
                person_age.clearFocus();
            }
        });
    }
}