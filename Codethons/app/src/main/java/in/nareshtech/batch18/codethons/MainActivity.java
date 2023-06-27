package in.nareshtech.batch18.codethons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.zip.InflaterInputStream;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProgressBar progressBar;

    private String BASE_URL = "https://kontests.net/api/v1/all";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);

        // As soon as you load the application, you want data
        loadData();
    }

    private void loadData() {
        progressBar.setVisibility(View.VISIBLE);
        FetchData data = new FetchData(this,progressBar,recyclerView);
        data.execute(BASE_URL);
    }

    // TODO 1: Whenever you need Internet access for your app, please
    //  paste the internet Permission on the Manifest file

    // TODO 2: Create a class `FetchData` and extend it to `AsyncTask`
    //  AsyncTask<String, Void, String> - First String -> doInBackground(...) input
    //  Second Void -> Dont want to update the user with progress
    //  Third String -> The return type of doInBackground(...)
    //  Interstingly, the return type of doInBackground(...) will also be the
    //  type of argument that onPostExecute(...) method receive.
}