package cl.com.demo.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author chen
 * @date 2018-9-13
 */

public interface ApiService {

    @GET("/Route.axd?method=vast.Store.manager.list")
    Call<ResponseBody> getManagerData(@Query("StoreId") int id);

}
