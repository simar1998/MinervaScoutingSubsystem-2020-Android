package com.example.minervascoutingsubsystemandroid.communications.subroutines;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.provider.SyncStateContract;
import android.text.format.Formatter;
import android.util.Log;

import java.lang.ref.WeakReference;
import java.net.InetAddress;
/**
 * @author Simarpal Kalsi
 * @author Stack Overflow
 * Live Long and Prosper
 */
public class NetworkCrawlerSubroutine extends AsyncTask<Void, Void, Void> {

    private static final String TAG = SyncStateContract.Constants._COUNT + "nstask";

    private WeakReference<Context> mContextRef;

    public NetworkCrawlerSubroutine(Context context) {
        mContextRef = new WeakReference<>(context);
    }

    @Override
    protected Void doInBackground(Void... voids) {
        Log.d(TAG, "Let's sniff the network");

        try {
            Context context = mContextRef.get();

            if (context != null) {

                ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
                assert cm != null;
                NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
                WifiManager wm = (WifiManager) context.getApplicationContext().getSystemService(Context.WIFI_SERVICE);

                assert wm != null;
                WifiInfo connectionInfo = wm.getConnectionInfo();
                int ipAddress = connectionInfo.getIpAddress();
                String ipString = Formatter.formatIpAddress(ipAddress);


                Log.d(TAG, "activeNetwork: " + activeNetwork);
                Log.d(TAG, "ipString: " + ipString);

                String prefix = ipString.substring(0, ipString.lastIndexOf(".") + 1);
                Log.d(TAG, "prefix: " + prefix);

                for (int i = 0; i < 255; i++) {
                    String testIp = prefix + i;

                    InetAddress address = InetAddress.getByName(testIp);
                    boolean reachable = address.isReachable(1000);
                    String hostName = address.getCanonicalHostName();

                    if (reachable) {
                        Log.i(TAG, "Host: " + hostName + "(" + testIp + ") is reachable!");
                    }
                }
            }
        } catch (Throwable t) {
            Log.e(TAG, "An error has been thrown in the NetworkSniff Module", t);
        }

        return null;
    }

    //TODO
    public void checkIPForCompatibility(){

    }

}