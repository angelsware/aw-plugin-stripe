package com.angelsware.stripe;

import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.view.ViewGroup;
import android.view.View;
import android.app.Activity;

import com.angelsware.engine.AppActivity;

public class Stripe {
	public static void onCreate() {
/*		AppActivity.getActivity().runOnUiThread(new Runnable() {
			@Override
			public void run() {
				sWebView = new android.webkit.WebView(AppActivity.getActivity());
				sJsInterface = new JsInterface();
				sWebView.setWebChromeClient(new WebChromeClient());
				sWebView.addJavascriptInterface(sJsInterface, "native");
				sWebView.setBackgroundColor(0x00000000);
				WebSettings webSettings = sWebView.getSettings();
				webSettings.setJavaScriptEnabled(true);
				webSettings.setDomStorageEnabled(true);
				AppActivity.getActivity().addContentView(sWebView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
			}
		});*/
	}
}

