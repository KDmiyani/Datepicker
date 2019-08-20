package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.webkit.WebView;


import static com.example.datepicker.R.id.webview;

public class Webview extends AppCompatActivity {
    EditText edt_url;
    Button btn_load;
    WebView webView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);



        edt_url = findViewById(R.id.edt_turl);
        btn_load = findViewById(R.id.btn_load);
        webView = findViewById(R.id.webview);

        btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = edt_url.getText().toString();
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(view.SCROLLBARS_INSIDE_OVERLAY);

                webView.loadUrl(url);

            }
        });
    }
}
