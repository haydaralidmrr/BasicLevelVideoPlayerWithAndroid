package com.alihaydar.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView,videoView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView=findViewById(R.id.videoPlayer);
        videoView2=findViewById(R.id.videoPlayer1);

        //from locale storage

        videoView.setVideoPath("android.resource://"+ getPackageName()+"/"+R.raw.ardaguler);

        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        //from internet urls

        Uri uri=Uri.parse("https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1");
        videoView2.setVideoURI(uri);

        MediaController mediaController1=new MediaController(this);
        mediaController1.setAnchorView(videoView2);
        mediaController1.setMediaPlayer(videoView2);
        videoView2.setMediaController(mediaController1);
        videoView2.start();




    }
}