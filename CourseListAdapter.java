package com.example.mysqlconnect;

import android.app.Activity;
import android.graphics.drawable.LayerDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mysqlconnect.R;
import com.example.mysqlconnect.LibUtils;
import java.util.ArrayList;

/**
 * Created by Sonali on 7/20/2016.
 */
public class CourseListAdapter extends BaseAdapter {
    Activity context;
    ArrayList<String> array;

    public CourseListAdapter(Activity context, ArrayList<String> array) {
        this.context = context;
        this.array = array;
    }

    @Override
    public int getCount() {
        return array.size();
    }

    @Override
    public String getItem(int position) {
        return array.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = View.inflate(context, R.layout.adapt_course_list_row,null);

        LinearLayout rlv_view = (LinearLayout) view.findViewById(R.id.rl_view);
        LinearLayout llv_view = (LinearLayout)view.findViewById(R.id.ll_view);
        TextView tv_name = (TextView) view.findViewById(R.id.tv_course_list_row);

        String text = array.get(position);

        int height = LibUtils.getHeightResolution(context,25);
        int height_l = LibUtils.getHeightResolution(context,32);


        LayerDrawable layerDrawable = (LayerDrawable) context.getResources().getDrawable(R.drawable.background);
        layerDrawable.setLayerInset(0, 0, 0, 0, 0); //top half
        layerDrawable.setLayerInset(1, 0, height, 0,0 ); //bottom half
        rlv_view.setBackground(layerDrawable);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,height_l);
        params.setMargins(10,10,10,10);

        tv_name.setLayoutParams(params);
        llv_view.setLayoutParams(params);

        params.gravity = Gravity.CENTER;
        if (text != null) {
            tv_name.setText(text);
        }
        return view;
    }
}
