package in.nareshtech.batch18.codethons;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class FetchData extends AsyncTask<String,Void,String> {

    private ProgressBar progressBar;
    private TextView textView;

    public FetchData(ProgressBar progressBar, TextView textView) {
        this.progressBar = progressBar;
        this.textView = textView;
    }

    // this method runs on the Worker Thread (in the background)
    @Override
    protected String doInBackground(String... strings) {
        String link = strings[0];
        // Convert this link to a URL
        try {
            URL url = new URL(link);
            // Open a connection
            HttpsURLConnection connection =
                    (HttpsURLConnection) url.openConnection();
            // Read the entire inputstream from the link
            InputStream is = connection.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = "";
            StringBuilder builder = new StringBuilder();
            while((line=br.readLine())!=null){
                builder.append(line);
            }
            return builder.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        progressBar.setVisibility(View.INVISIBLE);
        textView.setText(s);
    }
}
