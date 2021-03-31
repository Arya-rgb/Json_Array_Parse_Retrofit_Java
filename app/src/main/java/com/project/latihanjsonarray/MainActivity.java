package com.project.latihanjsonarray;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ArrayList<PelajarModel> pelajarModel =new ArrayList<>();
    private PelajaranAdapter pelajarAdapter;
    private RecyclerView pelajar_recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pelajar_recyclerview=(RecyclerView)findViewById(R.id.rv_pelajar);
        pelajar_recyclerview.setLayoutManager(new LinearLayoutManager(this));

        getPelajarList();

    }

    private void getPelajarList() {

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://alihyaabsendata.000webhostapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RequestInterface requestInterface=retrofit.create(RequestInterface.class);
        Call<List<PelajarModel>> call=requestInterface.getPelajarJson();

        call.enqueue(new Callback<List<PelajarModel>>() {

            @Override
            public void onResponse(Call<List<PelajarModel>> call, Response<List<PelajarModel>> response) {
                pelajarModel=new ArrayList<>(response.body());
                pelajarAdapter=new PelajaranAdapter(MainActivity.this,pelajarModel);
                pelajar_recyclerview.setAdapter(pelajarAdapter);
                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<PelajarModel>> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Failed",Toast.LENGTH_SHORT).show();
            }
        });

    }
}