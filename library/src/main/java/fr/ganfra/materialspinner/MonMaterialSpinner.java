package fr.ganfra.materialspinner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by hamed on 11/1/2017.
 */

public class MonMaterialSpinner extends MaterialSpinner implements Events  {


    public void init(){

    }

    //Constructors :
    public MonMaterialSpinner(Context context) {
        super(context);
        init();
    }
    public MonMaterialSpinner(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public MonMaterialSpinner(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void setItems(ArrayList<MonItem> items){

        MyArrayAdapter arr=new MyArrayAdapter(getContext(), 0);

        if(items!=null)
            arr.addAll(items);

        arr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        setAdapter(arr);

    }

    @Override
    public void OnItemSelected() {

    }




}
