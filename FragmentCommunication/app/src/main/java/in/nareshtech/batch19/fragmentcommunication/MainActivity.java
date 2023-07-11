package in.nareshtech.batch19.fragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SendingFragment.SendingFragmentListener {

    RecevingFragment receivingFragment;
    SendingFragment sendingFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendingFragment = new SendingFragment();
        receivingFragment = new RecevingFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.sending,sendingFragment)
                .replace(R.id.receiving,receivingFragment)
                .commit();
    }

    @Override
    public void sendDatatoRecevingFragment(String data) {
        receivingFragment.updateData(data);
    }
}