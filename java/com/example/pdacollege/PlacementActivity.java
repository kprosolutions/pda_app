package com.example.pdacollege;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlacementActivity extends AppCompatActivity {
    TextView me;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placement);
        me=findViewById(R.id.me);
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/pdacollege-940c1.appspot.com/o/z.pdf?alt=media&token=2a8da456-ce9b-4580-b8fc-98495b090a32");
                DownloadManager.Request request =new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });
    }
}
