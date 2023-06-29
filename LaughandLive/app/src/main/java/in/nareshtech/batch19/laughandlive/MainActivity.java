package in.nareshtech.batch19.laughandlive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    private TextView jokeTv;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jokeTv = findViewById(R.id.joke_tv);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);
    }

    public void getAJoke(View view) {
        progressBar.setVisibility(View.VISIBLE);
        ExecutorService service = Executors.newSingleThreadExecutor();
        String link = "https://api.chucknorris.io/jokes/random";

        StringBuilder builder = new StringBuilder();

        service.execute(new Runnable() {
            @Override
            public void run() {
                // this run() method runs on a separate thread
                try {
                    URL url = new URL(link);
                    HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
                    InputStream is = connection.getInputStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    String line = "";
                    while((line = br.readLine())!=null){
                        builder.append(line);
                    }

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            // This one quickly switches the thread from a worker thread to main thread
                            Gson gson = new Gson();
                            Joke j = gson.fromJson(builder.toString(),Joke.class);
                            jokeTv.setText(j.getValue());
                            progressBar.setVisibility(View.INVISIBLE);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}