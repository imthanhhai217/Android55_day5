package com.devpro.android55_day5;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContactAdapter extends BaseAdapter {
    private ArrayList<Contact> mListContact;

    public ContactAdapter(ArrayList<Contact> listContact) {
        this.mListContact = listContact;
    }

    @Override
    public int getCount() {
        return mListContact != null ? mListContact.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return mListContact.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View contactView;
        if (convertView == null){
            contactView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_contact,parent,false);
        }else {
            contactView = convertView;
        }

        Contact contact = mListContact.get(position);
        ImageView imgAvatar = contactView.findViewById(R.id.imgAvatar);
        TextView tvUserName = contactView.findViewById(R.id.tvUserName);
        TextView tvPhoneNumber = contactView.findViewById(R.id.tvPhoneNumber);

        tvUserName.setText(contact.getUserName());
        tvPhoneNumber.setText(contact.getPhoneNumber());
        Glide.with(parent.getContext()).load(contact.getAvatar()).into(imgAvatar);

        return contactView;
    }
}
