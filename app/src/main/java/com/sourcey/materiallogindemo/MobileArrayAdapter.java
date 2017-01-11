package com.sourcey.materiallogindemo;

/**
 * Created by juan on 10/01/17.
 */

import com.sourcey.materiallogindemo.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MobileArrayAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public MobileArrayAdapter(Context context, String[] values) {
        super(context, R.layout.list_item, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_item, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
        textView.setText(values[position]);

        // Change icon based on name
        String s = values[position];

        System.out.println(s);

        if (s.equals("WindowsMobile")) {
            imageView.setImageResource(R.drawable.avatar);
        } else if (s.equals("iOS")) {
            imageView.setImageResource(R.drawable.cerradura_electronica_autonoma_codigo_y_pastilla_c);
        } else if (s.equals("Blackberry")) {
            imageView.setImageResource(R.drawable.domo_seguridad_camara);
        } else {
            imageView.setImageResource(R.drawable.logo);
        }

        return rowView;
    }
}