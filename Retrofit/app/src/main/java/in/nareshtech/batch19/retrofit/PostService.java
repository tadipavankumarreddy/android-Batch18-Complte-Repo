package in.nareshtech.batch19.retrofit;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PostService {

    @POST("posts")
    Call<DataResponse> doPost(@Body DataPost post);

    @GET("posts/1")
    Call<Post> getPost();
}
