package com.amaker.wlo;


import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class AmusementActivity extends TabActivity {

	private static final String VIDEO_TAB = "video_tab";
	private static final String IMAGE_TAB = "image_tab";
	private TabHost tabHost;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.order_amusement);
		tabHost = getTabHost();

		TabSpec videoSpec = tabHost.newTabSpec(VIDEO_TAB)
				.setIndicator("观看视频", getResources().getDrawable(R.drawable.amusement_video))
				.setContent(R.id.amusement_video_tab);
		tabHost.addTab(videoSpec);

		TabSpec imageSpec = tabHost.newTabSpec(IMAGE_TAB)
				.setIndicator("浏览图片", getResources().getDrawable(R.drawable.amusement_image))
				.setContent(R.id.amusement_image_tab);
		tabHost.addTab(imageSpec);
	}

}
