/*package org.grameenfoundation.cch.activity;

import java.util.Observable;
import java.util.Observer;

import org.digitalcampus.mobile.learning.R;
import org.digitalcampus.oppia.activity.OppiaMobileActivity;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class CCHDashBoard extends Activity implements Observer{
	Intent myIntent ;
	// declare updater class member here (or in the Application)
		@SuppressWarnings("unused")
		private AutoUpdateApk aua;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.e("name ", "habeeb");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cch_activity_dashboard);
		aua = new AutoUpdateApk(getApplicationContext());	// <-- don't forget to instantiate

		aua.addObserver(this);
	}
	
	
	@Override
	public void update(Observable observable, Object data) {
		if( ((String)data).equalsIgnoreCase(AutoUpdateApk.AUTOUPDATE_GOT_UPDATE) ) {
			android.util.Log.e("AutoUpdateApkActivity", "Have just received update!");
		}
		if( ((String)data).equalsIgnoreCase(AutoUpdateApk.AUTOUPDATE_HAVE_UPDATE) ) {
			android.util.Log.e("AutoUpdateApkActivity", "There's an update available!");
		}
	}
	
	public void onEPClick(View view){
		myIntent = new Intent(getApplicationContext(), CCHEventPlanner.class );
		startActivity(myIntent);
		finish();  
	}
	
	public void onPOCClick(View view){
		myIntent = new Intent(getApplicationContext(), pochome.class );
		startActivity(myIntent);
		finish();    
	}
	
	public void onLearnClick(View view){
		myIntent = new Intent(getApplicationContext(), OppiaMobileActivity.class );
		startActivity(myIntent);
		finish();    
	}
	@Override
	protected void onStop() {
	    super.onStop();  // Always call the superclass method first

	}
	
	@Override
	protected void onStart() {
	    super.onStart();  // Always call the superclass method first	    
	   
	}

	@Override
	protected void onRestart() {
	    super.onRestart();  // Always call the superclass method first
	    
	    // Activity being restarted from stopped state    
	}

}
*/