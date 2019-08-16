package com.phong.com.phong.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.phong.baitaprenluyentugiai3_1.R;
import com.phong.model.TyGiaHoiDoai;

public class TyGiaHoiDoaiAdapter extends ArrayAdapter<TyGiaHoiDoai> {
    Activity context;
    int resource;
    public TyGiaHoiDoaiAdapter(Activity context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater =this.context.getLayoutInflater();
        View customView =inflater.inflate(this.resource, null);
        ImageView imgHinh = (ImageView) customView.findViewById(R.id.imgHinh);
        TextView txtTenNuoc = (TextView) customView.findViewById(R.id.txtTenNuoc);
        TextView txtMuaTM = (TextView) customView.findViewById(R.id.txtMuaTM);
        TextView txtMuaCK = (TextView) customView.findViewById(R.id.txtMuaCK);
        TextView txtBanTM = (TextView) customView.findViewById(R.id.txtBanTM);
        TextView txtBanCK = (TextView) customView.findViewById(R.id.txtBanCK);
        TyGiaHoiDoai tyGiaHoiDoai = getItem(position);
        imgHinh.setImageResource(tyGiaHoiDoai.getHinh());
        txtTenNuoc.setText(tyGiaHoiDoai.getTenNuoc());
        txtMuaTM.setText(tyGiaHoiDoai.getMuaTM() + "");
        txtMuaCK.setText(tyGiaHoiDoai.getMuaCK() + "");
        txtBanTM.setText(tyGiaHoiDoai.getBanTM() + "");
        txtBanCK.setText(tyGiaHoiDoai.getBanCK() + "");
        return customView;
    }
}
