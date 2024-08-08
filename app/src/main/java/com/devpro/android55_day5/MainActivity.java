package com.devpro.android55_day5;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;
    private ArrayList<Contact> mDataContact;
    private ArrayList<String> mListUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
    }

    private void initView() {
        lvContact = findViewById(R.id.lvContact);

//        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
//                androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,
//                mListUser);
//        lvContact.setAdapter(arrayAdapter);

        ContactAdapter contactAdapter = new ContactAdapter(mDataContact);
        lvContact.setAdapter(contactAdapter);

    }

    private void initData() {
        mListUser = new ArrayList<>();
        for (int i =0 ; i < 10 ; i++){
            mListUser.add("user "+i);
        }


        mDataContact = new ArrayList<>();
        for (int i =0 ; i < 10 ; i++){
            Contact contact = new Contact();
            contact.setUserName("user "+i);
            contact.setPhoneNumber((new Random().nextInt()*10000)+"");
            contact.setAvatar("https://images.pexels.com/photos/1308881/pexels-photo-1308881.jpeg?auto=compress&cs=tinysrgb&w=800");
            mDataContact.add(contact);
        }
    }
}