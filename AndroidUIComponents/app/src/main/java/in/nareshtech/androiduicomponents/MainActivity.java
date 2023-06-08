package in.nareshtech.androiduicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText person_name, person_age;
    private Button submit;
    private TextView textView;
    private RadioGroup g;
    private CheckBox english, french, german;
    private String gender = "";

    private List<String> countries;
    private Spinner spinner;

    private String country = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intializeTheViews();

        intializeTheList();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,countries);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // when the item is selected, we come to this method
                if(parent.getItemAtPosition(position).toString().equals("SELECT YOUR COUNTRY")){
                    Toast.makeText(MainActivity.this, "Please select your country", Toast.LENGTH_SHORT).show();
                }else{
                    country = parent.getItemAtPosition(position).toString();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // when nothing is selected we come here
            }
        });

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
                int a;
                if(n.isEmpty()){
                    person_name.setError("Please enter your name");
                }
                if(person_age.getText().toString().isEmpty()){
                    a = 0;
                    person_age.setError("Age cannot be null");
                }else{
                  a = Integer.parseInt(person_age.getText().toString());
                }
                String lang = "";
                if(english.isChecked()){
                    lang = lang+"English ";
                }
                if(german.isChecked()){
                    lang += "German ";
                }
                if(french.isChecked()){
                    lang+= "French ";
                }
                textView.setText(n+"\n"+a+"\n"+gender+"\n"+lang+"\n"+country);

                //clear the contents of the TextInputEditText boxes
                person_name.getText().clear();
                person_age.getText().clear();
                person_age.clearFocus();
            }
        });
    }



    private void intializeTheList() {
        countries = new ArrayList<>();
        countries.add("SELECT YOUR COUNTRY");
        countries.add("INDIA");
        countries.add("Pakistan");
        countries.add("USA");
        countries.add("Russia");
    }

    private void intializeTheViews() {
        person_name = findViewById(R.id.person_name);
        person_age = findViewById(R.id.person_age);
        submit = findViewById(R.id.button);
        textView = findViewById(R.id.result);
        g = findViewById(R.id.gender);
        english = findViewById(R.id.eng);
        french = findViewById(R.id.fren);
        german = findViewById(R.id.germ);
        spinner = findViewById(R.id.spinner);
    }
}