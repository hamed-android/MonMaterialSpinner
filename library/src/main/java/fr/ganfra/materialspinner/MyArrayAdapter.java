package fr.ganfra.materialspinner;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;

/**
 * Created by hamed on 11/1/2017.
 */

public class MyArrayAdapter extends ArrayAdapter<MonItem> {
    public MyArrayAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView==null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.sp1,parent,false);
        }
        MonItem item = getItem(position);

        TextView text1 = convertView.findViewById(android.R.id.text1);

        //text1.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);

        text1.setText(item.getTitle());




        return convertView;
    }
}
