package in.nareshtech.batch19.dateandtimepickers;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
    }

    public void pickTime(View view) {
        Calendar c = Calendar.getInstance();

        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog =
                new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        String amOrPm = "AM";
                        if(hourOfDay == 0){
                            hourOfDay = 12;
                            amOrPm = "AM";
                        }

                        if(hourOfDay>12){
                            hourOfDay = hourOfDay-12;
                            amOrPm = "PM";
                        }else{
                            amOrPm = "AM";
                        }

                        tv.setText(hourOfDay+":"+minute+" "+amOrPm);
                    }
                },hour,minute,true);

        timePickerDialog.show();
    }
}