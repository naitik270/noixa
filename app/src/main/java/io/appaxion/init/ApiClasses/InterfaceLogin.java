package io.appaxion.init.ApiClasses;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface InterfaceLogin {

    @POST("api/api_users_v2.php")
    Call<ClsLoginParams> callLoginAPIBody(@Body ClsLoginParams obj);

}
