package com.example.android.miwok;

import android.content.Context;
import android.graphics.Movie;
import android.provider.UserDictionary;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context, 0,words);
    }




    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listcustomView = convertView;
        if (listcustomView==null){
            listcustomView = LayoutInflater.from(getContext()).inflate(R.layout.designlayout,parent,false);

        }

        Word currentWord = getItem(position);

        TextView miwolktv = (TextView) listcustomView.findViewById(R.id.miwoklang);
        miwolktv.setText(currentWord.getMiwoktranslation());

        TextView defaulttv = (TextView) listcustomView.findViewById(R.id.translang);
       defaulttv.setText(currentWord.getDefaulttranslation());
       return listcustomView;








    }
}
