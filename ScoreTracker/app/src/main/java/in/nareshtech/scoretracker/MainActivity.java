package in.nareshtech.scoretracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView result;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result123);

        if(savedInstanceState!=null && savedInstanceState.containsKey("CURRENT")){
            // If this condition is true, there is a prev value stored in the bundle object
            count = savedInstanceState.getInt("CURRENT");
            result.setText(String.valueOf(count));
        }
    }
    public void incrementScore(View view) {
        // This method's responsibility is to increase the existing score by one and display it on the TextView
        count++;
        result.setText(String.valueOf(count));
    }
    public void decrementScore(View view) {
        // This method's responsibility is to decrease the existing score by one and display it on the TextView
        count--;
        result.setText(String.valueOf(count));
    }
    /**Saving the instance state the data can be stored inside the outstate bundle object with a key*
     * Use this key to retrieve the value when a new instance of the activity is created
     */
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("CURRENT",count);
    }

    /**This method is responsible of attaching the menus.xml to the activity*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menus,menu);
        return true;
    }

    /**This method will get your menu items into action.*/
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.menu1){
            count = 0;
            result.setText(String.valueOf(count));
        } else if(item.getItemId() == R.id.menu2){
            Toast.makeText(this, "Second option is choosen", Toast.LENGTH_SHORT).show();
        } else if(item.getItemId() == R.id.menu3){
            Toast.makeText(this, "Third Item is touched", Toast.LENGTH_SHORT).show();
        }

        return true;
    }
}