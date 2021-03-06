package com.example.pdacollege;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ElectricallActivity extends AppCompatActivity {
    TextView tex14,tex15,tex16,tex17,tex18,tex19,tex20,tex21,tex23,tex25,tex27,tex28,tex29,tex30,tex31,tex32,te12;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricall);
        tex14=findViewById(R.id.tex14);
        tex15=findViewById(R.id.tex15);
        tex16=findViewById(R.id.tex16);
        tex17=findViewById(R.id.tex17);
        tex18=findViewById(R.id.tex18);
        tex19=findViewById(R.id.tex19);
        tex20=findViewById(R.id.tex20);
        tex21=findViewById(R.id.tex21);
        tex23=findViewById(R.id.tex23);
        tex25=findViewById(R.id.tex25);
        tex27=findViewById(R.id.tex27);
        tex28=findViewById(R.id.tex28);
        tex29=findViewById(R.id.tex29);
        tex30=findViewById(R.id.tex30);
        tex31=findViewById(R.id.tex31);
        tex32=findViewById(R.id.tex32);
        te12=findViewById(R.id.te12);

        tex25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fa=new Intent(ElectricallActivity.this,ElectricalActivity.class);
                startActivity(fa);
            }
        });

        tex14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/i-ii.pdf?alt=media&token=882efeb3-34ca-4d84-90a6-113f72267f1f");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/1SEM%20SYLLABUS%20WITH%20CO'S.pdf?alt=media&token=c5118add-c180-4604-b7f9-d1cd043afaca");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/iii-iv.pdf?alt=media&token=ed480b14-7c1e-4044-a09a-a6d5ee3ac97c");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/2015_III-IV_sem_syllabus_and_Scheme_of_Teaching_and_Examina.pdf?alt=media&token=6748668c-3f45-4883-9e9b-3cd11888c3d3");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/v-vi.pdf?alt=media&token=0fc55edd-c0b5-4fd6-8723-32fbd3e84544");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/V%20%26%20vi%20SYALLABUS%20WITH%20CO'S.pdf?alt=media&token=18b7492c-c745-4cb6-9038-d0b3e6a59ae3");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/vii-viii.pdf?alt=media&token=0d924f65-d5c8-441b-809b-39e5b96b3028");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/VII%20%26%20Viii%20SYLLABUS%20WITH%20CO'S.pdf?alt=media&token=a5e2ddd2-4501-4ef8-8ff2-dac6c0eda424");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/publications.pdf?alt=media&token=45f03201-56e0-48f0-9400-c67f8e49fa4a");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });

        tex27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/EEResearch1.pdf?alt=media&token=b5e223c7-4421-4961-babd-f60637b057aa");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/E1.pdf?alt=media&token=71cf0d28-355f-4b99-bd1b-b9802d2966db");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/E2.pdf?alt=media&token=7ca76539-d823-4490-96ea-68bee7415e99");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/E3.pdf?alt=media&token=7b970dfc-a89d-4098-a4ef-6bbaf20623f4");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });

        tex31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/eee-infra.pdf?alt=media&token=c6f874aa-7dc8-4289-8582-00860570532e");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        tex32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/eee-gallery.pdf?alt=media&token=dd122e2c-ef7a-44f3-bf08-c848745c94e9");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
        te12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/bo.pdf?alt=media&token=70159e73-8aa4-4e7c-a307-76f4d6ae6556");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });



    }
}
