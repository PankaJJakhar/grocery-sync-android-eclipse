package master.jakhar.grocery;

import master.jakhar.grocery.R;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class GrocerySyncPreferencesActivity extends PreferenceActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences); 
	}

}