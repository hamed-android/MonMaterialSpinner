package ir.hirkanhost.monmaterialspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import fr.ganfra.materialspinner.MaterialSpinner;
import fr.ganfra.materialspinner.MonItem;
import fr.ganfra.materialspinner.MonMaterialSpinner;

public class MainActivity extends AppCompatActivity {

    private MonMaterialSpinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);


        MonItem monItem1=new MonItem(1,"حامد عباسی");
        MonItem monItem2=new MonItem(2,"رضا محمدی");
        MonItem monItem3=new MonItem(3,"علی کریمی");

        ArrayList<MonItem> list= new ArrayList<>();
        list.add(monItem1);
        list.add(monItem2);
        list.add(monItem3);

        spinner.setItems(list);
    }


}
