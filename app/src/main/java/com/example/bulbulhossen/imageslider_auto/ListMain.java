package com.example.bulbulhossen.imageslider_auto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;

import static com.gitonway.lee.niftymodaldialogeffects.lib.Effectstype.Fliph;

public class ListMain extends AppCompatActivity {
    // Array of strings...
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){

                    case 0:
                    NiftyDialogBuilder niftyDialogBuilder = NiftyDialogBuilder.getInstance(ListMain.this);
                        niftyDialogBuilder.withMessageColor("#FFFFFF")
                                .withMessage(R.string.bodytext)
                                .withTitle("Bangladesh")
                                .withEffect(Fliph)
                                .withDuration(300)
                                .withDialogColor("#3C3F41")
                                .show();
                        break;
                    case 1:

                        NiftyDialogBuilder niftyDialogBuilder1 = NiftyDialogBuilder.getInstance(ListMain.this);
                        niftyDialogBuilder1.
                                withMessageColor("#FFFFFF")
                                .withMessage(R.string.bodytext)
                                .withTitle("Bangladesh")
                                .withEffect(Fliph)
                                .withDuration(300)
                                .withDialogColor("#3C3F41")
                                .show();
                        break;
                }
            }
        });
    }
}