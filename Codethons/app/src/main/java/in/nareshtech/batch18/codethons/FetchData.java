package in.nareshtech.batch18.codethons;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

public class FetchData extends AsyncTask<String,Void,String> {

    private Context context;
    private ProgressBar progressBar;
    private RecyclerView recyclerView;

    public FetchData(Context context,ProgressBar progressBar, RecyclerView recyclerView) {
        this.context = context;
        this.progressBar = progressBar;
        this.recyclerView = recyclerView;
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
        List<Contests> contestsList = new ArrayList<>();
        try {
            JSONArray allData = new JSONArray(s);
            for(int i=0; i<allData.length(); i++){
                // logic to parse individual objects must go here
                JSONObject obj = allData.getJSONObject(i);
                String name = obj.getString("name");
                String start = obj.getString("start_time");
                String end = obj.getString("end_time");
                String duration = obj.getString("duration");
                String siteUrl = obj.getString("url");
                String siteName = obj.getString("site");
                Contests contests = new Contests(name,start,end,duration,siteUrl,siteName);
                contestsList.add(contests);
            }
            ContestsAdapter adapter = new ContestsAdapter(context,contestsList);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
