package com.guatemala.primeraplicacion;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class Principal extends ActionBarActivity {
	
	EditText nombrePersona;
	Button botonSaludo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		
		nombrePersona = (EditText)findViewById(R.id.nombreTexto);
		botonSaludo = (Button) findViewById(R.id.botonSaludo);
		
		botonSaludo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	SaludarPersona();
            }
        });
		/*
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		*/
	}
	
	private void SaludarPersona() {
		Intent intent = new Intent(this, Segunda.class);	    
	    String message = nombrePersona.getText().toString();
	    intent.putExtra("nombre", message);
	    startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_principal,
					container, false);
			return rootView;
		}
	}

}
