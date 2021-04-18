package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.AndroidHttpClient;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);
        tv.setText(BuildConfig.APPLICATION_ID + "," + BuildConfig.VERSION_NAME + "," + BuildConfig.VERSION_CODE);
        // 添加了 useLibrary 'org.apache.http.legacy' 后，就把它当成了一个共享库。
        String[] systemSharedLibraryNames = getPackageManager().getSystemSharedLibraryNames();
        tv.append("\n");
        tv.append(Arrays.toString(systemSharedLibraryNames));

        // 使用一下 org.apache.http.legacy 的类
        try {
            AndroidHttpClient androidHttpClient = AndroidHttpClient.newInstance("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}