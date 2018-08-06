package sg.edu.rp.c346.mywebbrowserenhanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;
    EditText etURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);
        etURL = findViewById(R.id.editTextURL);

        wvMyPage.setWebViewClient(new WebViewClient());

        // Enable JavaScript
        wvMyPage.getSettings().setJavaScriptEnabled(true);

        // Disable file access
        wvMyPage.getSettings().setAllowFileAccess(false);

        // Enable built-in zoom control
        wvMyPage.getSettings().setDisplayZoomControls(true);

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = etURL.getText().toString();

                wvMyPage.loadUrl(url);
            }
        });
    }
}
