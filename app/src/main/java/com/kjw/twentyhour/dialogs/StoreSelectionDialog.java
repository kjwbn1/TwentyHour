package com.kjw.twentyhour.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.kjw.twentyhour.R;

import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StoreSelectionDialog extends DialogFragment {


    @BindView(R.id.img_store)
    ImageView storeImage;

    @BindView(R.id.store_name)
    TextView storeName;

    @BindView(R.id.store_description)
    TextView storeDescription;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());


        LayoutInflater inflater = getActivity().getLayoutInflater();

        builder.setView(inflater.inflate(R.layout.dialog_store_selection, null));



        AlertDialog dialog = builder.create();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        Window window = dialog.getWindow();
//        window.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        window.setGravity(Gravity.CENTER);

        ButterKnife.bind(this, dialog);

        return dialog;
    }
}