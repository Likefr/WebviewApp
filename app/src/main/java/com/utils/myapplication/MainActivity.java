package com.utils.myapplication;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.utils.myapplication.tencentx5.X5WebViewActivity;

public class MainActivity extends AppCompatActivity {
    public static boolean isLaunch = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        file:///android_asset/index.html
        X5WebViewActivity.loadUrl(this, "file:///android_asset/index.html", "title");
        this.finish();
    }


    public static void start(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        isLaunch = false;
    }

}
