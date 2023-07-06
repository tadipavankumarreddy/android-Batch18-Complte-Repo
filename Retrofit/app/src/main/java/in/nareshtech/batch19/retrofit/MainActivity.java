package in.nareshtech.batch19.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    Retrofit retrofit;
    PostService postService;

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        postService = retrofit.create(PostService.class);
    }

    public void postData(View view) {
        // we are supposed to post data
        DataPost post = new DataPost(1,"Pavan","Kumar");
        postService.doPost(post).enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                DataResponse dataResponse = response.body();
                Toast.makeText(MainActivity.this, dataResponse.getBody(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Better Luck Next Time", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void getData(View view) {
        postService.getPost().enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                Post p = response.body();
                tv.setText("");
                tv.append(p.getBody()+" "+p.getTitle()+" "+p.getId());
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}