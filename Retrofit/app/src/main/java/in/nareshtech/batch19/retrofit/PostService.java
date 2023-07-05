package in.nareshtech.batch19.retrofit;


import retrofit2.Call;
import retrofit2.http.GET;

public interface PostService {

    @GET("posts/1")
    Call<Post> getPost();
}
