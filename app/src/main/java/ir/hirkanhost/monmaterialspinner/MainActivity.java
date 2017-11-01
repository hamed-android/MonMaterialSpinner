package ir.hirkanhost.monmaterialspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import fr.ganfra.materialspinner.MaterialSpinner;
import fr.ganfra.materialspinner.MonMaterialSpinner;

public class MainActivity extends AppCompatActivity {

    private MonMaterialSpinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);


        spinner.setItems(null);
    }


}
