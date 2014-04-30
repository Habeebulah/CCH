/*package org.grameenfoundation.cch.activity;

import org.digitalcampus.mobile.learning.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.content.Intent;

*//**
 * Created by Afua Ankomah on 3/27/14.
 *//*
public class pochome extends Activity {
	WebView webViewx; //Used to display Point of Care diagnostic tool 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_of_care); //Shows the first screen with all the content categories for Point of Care 
        
        //Count the number of categories that will be displayed, and get a list of those categories so that buttons can be 
        //created for them. Get category names and make this super flexible.
        
        //Create functions for each button so that it will activate a content cantegory once it's clicked. 
        Button myancButton = (Button) findViewById(R.id.ancButton);      
        myancButton.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
            //	Intent i = new Intent();
            //	i.setClassName("com.example.POCAndroidTest","com.example.POCAndroidTest.MyActivity");
           // 	startActivity(i);
                //setContentView(R.layout.question_layout);
                //Webview for Point of Care tool - no more Phonegap for Android dev
            	setContentView(R.layout.visual_aid);
                webViewx = (WebView)findViewById(R.id.webView);
                WebChromeClient wbc = new WebChromeClient(){
                	public void onCloseWebView(WebView w){
                        setContentView(R.layout.point_of_care);
                }    
                };
               webViewx.setWebChromeClient(new WebChromeClient());
                WebSettings webSettings = webViewx.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webViewx.loadUrl("file:///android_asset/html/index.html");
           }

            });
     }
 

                  

    
    @Override

    //The WebView doesn't automatically activate the 'back' button, so this code is needed.
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(event.getAction() == KeyEvent.ACTION_DOWN){
            switch(keyCode)
            {
            case KeyEvent.KEYCODE_BACK: //Captures back 
                if(webViewx.canGoBack()){
                    webViewx.goBack();
                }else{
                    finish();
                }
                return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
    
}*/