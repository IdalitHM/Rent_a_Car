package com.example.rentacar;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Rent extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] rental={"Enterprise Car Rental", "Hertz","Thrifty","Avis","Dollar","Budget"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.carship, rental));

    }
    protected void onListIItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.enterprise.com/en/car-rental/deals/everyday-low-rates.html?irgwc=1&mcid=ImpactRadius:13013:333524&ir_cid=c4ed518dNd73011e98d1342010a246d07")));
                break;

            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hertz.com/rentacar/reservation/?id=31322&LinkType=HZLK")));
                break;

            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://beta.thrifty.com/?iata=00170201&SiteID=Cty0dj6o3sg-tR9QOdOnWTZwc4k8nfCXGw")));
                break;

            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.avis.com/en/home?utm_source=partnerize&utm_medium=affiliate&utm_campaign=futurepublishing-1100l10026-1100l459&utm_content=Other-1101l29853-D486602&ARCIATA=0103202Q&AWD_NUMBER=D486602&clickref=1011l6yZWEsF&dclid=CNK7ions5eQCFQV3wQodmy0M8g")));
                break;

            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dollar.com/?iata=00170201")));
                break;

            case 5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.budget.com/en/home?utm_source=partnerize&utm_medium=affiliate&utm_campaign=futurepublishing-1100l10026-1101l467&utm_content=Other-1100l29763-D956102&AWD_NUMBER=D956102&ARCIATA=0103202Q&clickref=1101l6yVqdNS&dclid=CKOE8I3s5eQCFQVjwQodruwAlA")));
                break;
        }
    }

}
