package in.nareshtech.batch19.understandingfragments2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Handling the button clicks here
    public void loadFragment(View view) {
        // Inorder to load a fragment we need two components
        // FragmentManager
        // FragmentTransaction

        Fragment fragment = new FirstFragment();

        if(view.getId() == R.id.button){
            //logic
            fragment = new SecondFragment();
        }

        if(view.getId() == R.id.button2){
            //logic
            fragment = new FirstFragment();
        }

        FragmentManager manager = getSupportFragmentManager();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container,fragment);
        transaction.commit();
    }
}