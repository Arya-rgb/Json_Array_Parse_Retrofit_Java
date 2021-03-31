package com.project.latihanjsonarray;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {
    @GET("absenaktif.php")
    Call<List<PelajarModel>> getPelajarJson();
}
