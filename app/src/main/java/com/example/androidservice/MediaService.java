package com.example.androidservice;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import androidx.annotation.Nullable;

public class MediaService extends Service
{
    MediaPlayer player;

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        throw  new UnsupportedOperationException("Not extended");
    }

    @Override
    public void onCreate()
    {
        player = MediaPlayer.create(this, R.raw.music);
        player.setLooping(true);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        player.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy()
    {
        player.stop();
    }
}
