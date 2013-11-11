package ph.adoremus.dj.sandbox.stratpointmockapp;

import java.util.Iterator;
import java.util.Set;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;

public class MapActivity extends Activity implements LocationListener,
		ConnectionCallbacks, OnConnectionFailedListener,
		OnMyLocationButtonClickListener, OnClickListener {

	private MapFragment mapFragment;
	private GoogleMap map;
	private LocationManager locationManager;
	private LocationClient locationClient;
	private String provider;
	private Criteria criteria;

	private Button btnSMSRecepient;
	private EditText smsRecepient;

	private static final LocationRequest REQUEST = LocationRequest.create()
			.setInterval(5000).setFastestInterval(16)
			.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);

		btnSMSRecepient = (Button) findViewById(R.id.btnSMSRecepient);
		smsRecepient = (EditText) findViewById(R.id.smsRecepient);

		btnSMSRecepient.setOnClickListener(this);
		smsRecepient.setOnClickListener(this);

		mapFragment = ((MapFragment) getFragmentManager().findFragmentById(
				R.id.map));
		map = mapFragment.getMap();
		map.setMyLocationEnabled(true);
		map.setOnMyLocationButtonClickListener(this);
		locationClient = new LocationClient(getApplicationContext(), this, this);
		locationClient.connect();

	}

	@Override
	public boolean onMyLocationButtonClick() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onConnectionFailed(ConnectionResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onConnected(Bundle connectionHint) {
		Location current = locationClient.getLastLocation();
		LatLng llCurrent = new LatLng(current.getLatitude(),
				current.getLongitude());
		map.animateCamera(CameraUpdateFactory.newLatLngZoom(llCurrent, 10),
				2000, null);
	}

	@Override
	public void onDisconnected() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onLocationChanged(Location location) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClick(View v) {
		if (v.getId() == btnSMSRecepient.getId()) {
			Location current = locationClient.getLastLocation();
			LatLng llCurrent = new LatLng(current.getLatitude(),
					current.getLongitude());

			// Intent iSMS = new Intent(Intent.ACTION_VIEW);
			// iSMS.setType("vnd.android-dir/mms-sms");
			// iSMS.putExtra("address",
			// smsRecepient.getEditableText().toString());
			// iSMS.putExtra("sms_body", "My Current location is : ("
			// + llCurrent.latitude + "," + llCurrent.longitude + ")");
			// startActivity(iSMS);
			String phoneNo = smsRecepient.getEditableText().toString();
			String sms = "My Current location is : (" + llCurrent.latitude
					+ "," + llCurrent.longitude + ")";
			try {
				SmsManager smsManager = SmsManager.getDefault();
				smsManager.sendTextMessage(phoneNo, null, sms, null, null);
				Toast.makeText(getApplicationContext(), "SMS Sent!",
						Toast.LENGTH_LONG).show();
			} catch (Exception e) {
				Toast.makeText(getApplicationContext(),
						"SMS faild, please try again later!", Toast.LENGTH_LONG)
						.show();
				Log.e("APP", e.getMessage());
			}
		} else if (v.getId() == smsRecepient.getId()) {
			// Toast.makeText(getApplicationContext(),
			// "I will call Contacts picker later", Toast.LENGTH_LONG)
			// .show();
			Intent contactPickerIntent = new Intent(Intent.ACTION_PICK,
					Contacts.CONTENT_URI);
			startActivityForResult(contactPickerIntent, 1001);
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode == RESULT_OK) {
			switch (requestCode) {
			case 1001:
				// Bundle extras = data.getExtras();
				// Set<String> keys = extras.keySet();
				// Iterator<String> iterate = keys.iterator();
				// while (iterate.hasNext()) {
				// String key = iterate.next();
				// }
				Uri result = data.getData();
				String id = result.getLastPathSegment();

				Cursor c = getContentResolver().query(Phone.CONTENT_URI, null,
						Phone.CONTACT_ID + "=?", new String[] { id }, null);
				if (c.moveToFirst()) {
					for (int i = 0; i < c.getColumnNames().length; i++) {
						String col = c.getColumnNames()[i];
						Log.i("APP",
								col + " " + c.getString(c.getColumnIndex(col)));
					}
					smsRecepient.setText(c.getString(c
							.getColumnIndex(Phone.DATA1)));
				}
				break;

			default:
				break;
			}
		} else {
			Toast.makeText(getApplicationContext(),
					"There was a problem, please try again later.",
					Toast.LENGTH_LONG).show();
		}
	}
}
