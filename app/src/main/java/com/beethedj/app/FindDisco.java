package com.beethedj.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.HashMap;

public class FindDisco extends AppCompatActivity {

    private HashMap<String , String> discoInfo;
    private TextView nameDisco;
    private TextView infoDisco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_disco);


        final String[] DISCOS = new String[] {
                "Discoteca Merlin" , "Pacha Barcelona" , "Otto Zutz" , "Institut Poblenou",
                "Boveda" , "Bling Bling" , "Sala Arena Barcelona" , "Arena Blanes",
                "Elephant" , "Sutton Barcelona" , "Opium Barcelona" , "Señor Lobo",
                "Sala Monasterio" , "Boulevard Barcelona" , "Sala Apolo"
        };

        final String[] INFO = new String[] {
                getString(R.string.merlin) , getString(R.string.pacha) , getString(R.string.otto),
                getString(R.string.institut) , getString(R.string.boveda)
        };

        discoInfo = new HashMap<>();
        nameDisco = (TextView) findViewById(R.id.nameDisco);
        infoDisco = (TextView) findViewById(R.id.infoDisco);

        int x = 0;
        for (String i : INFO) {
            discoInfo.put(DISCOS[x] , i);
            x++;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this ,
                android.R.layout.simple_dropdown_item_1line , DISCOS);
        final AutoCompleteTextView autoText = (AutoCompleteTextView) findViewById(R.id.auto_text);
        autoText.setAdapter(adapter);

        final String[] name = {""};

        autoText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                name[0] = autoText.getText().toString();
                nameDisco.setText(name[0]);

                String info = discoInfo.get(name[0]);
                infoDisco.setText(info);
            }
        });



        Button entrar = (Button) findViewById(R.id.go_in_disco);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!name[0].equalsIgnoreCase("")) {
                    Intent i = new Intent(FindDisco.this , SelectedDisco.class);
                    i.putExtra("name" , name[0]);
                    startActivity(i);
                }

            }
        });

        ImageView logo = (ImageView) findViewById(R.id.logo_app);
        Picasso.with(getApplicationContext()).load(R.mipmap.icon_app).into(logo);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
