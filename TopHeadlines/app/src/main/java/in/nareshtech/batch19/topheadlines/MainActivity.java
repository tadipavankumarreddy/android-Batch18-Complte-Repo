package in.nareshtech.batch19.topheadlines;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import in.nareshtech.batch19.topheadlines.ModelClasses.Item;
import in.nareshtech.batch19.topheadlines.ModelClasses.SourceData;
import in.nareshtech.batch19.topheadlines.ModelClasses.VolumeInfo;

public class MainActivity extends AppCompatActivity {

    String link = "https://www.googleapis.com/books/v1/volumes?q=";
    private EditText query;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        query = findViewById(R.id.search_query);
        rv = findViewById(R.id.recyclerview);
    }

    public void fetchData(View view) {
        String qu =query.getText().toString();
        String u = link+qu;

        RequestQueue queue = Volley.newRequestQueue(this);

        StringRequest request = new StringRequest(Request.Method.GET, u, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Gson gson = new Gson();
                SourceData sd = gson.fromJson(response,SourceData.class);
                BooksAdapter adapter = new BooksAdapter(MainActivity.this,sd.getItems());
                rv.setAdapter(adapter);
                rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        queue.add(request);
    }
}