package com.noelchew.materialdialogwrapper.library;

import android.content.Context;
import android.text.TextUtils;

import com.afollestad.materialdialogs.MaterialDialog;

import java.util.ArrayList;
import java.util.Arrays;

public class MaterialDialogWrapper {

    public static void showAlertDialogWithOK(Context context, int message) {
        showAlertDialogWithOK(context, context.getString(message));
    }

    public static void showAlertDialogWithOK(Context context, String message) {
        showAlertDialogWithOK(context, "", message);
    }

    public static void showAlertDialogWithOK(Context context, int title, int message) {
        showAlertDialogWithOK(context, context.getString(title), context.getString(message));
    }

    public static void showAlertDialogWithOK(Context context, String title, String message) {
        MaterialDialog.Builder builder = new MaterialDialog.Builder(context);
        if (!TextUtils.isEmpty(title)) {
            builder.title(title);
        }
        builder.content(message)
                .positiveText(R.string.alert_dialog_util_ok)
                .show();
    }





    public static void showAlertDialog(Context context, int message) {
        showAlertDialog(context, context.getString(message));
    }

    public static void showAlertDialog(Context context, String message) {
        showAlertDialog(context, null, message);
    }

    public static void showAlertDialog(Context context, int title, int message) {
        showAlertDialog(context, context.getString(title), context.getString(message));
    }

    public static void showAlertDialog(Context context, String title, String message) {
        MaterialDialog.Builder builder = new MaterialDialog.Builder(context);
        if (!TextUtils.isEmpty(title)) {
            builder.title(title);
        }
        builder.content(message)
                .show();
    }








    public static void showAlertDialogWithSelections(Context context, int title, ArrayList<String> selectionArrayList, MaterialDialog.ListCallback listCallback) {
        showAlertDialogWithSelections(context, context.getString(title), selectionArrayList, listCallback);
    }

    public static void showAlertDialogWithSelections(Context context, int title, MaterialDialog.ListCallback listCallback, String... selections) {
        ArrayList<String> selectionArrayList = new ArrayList<>(Arrays.asList(selections));
        showAlertDialogWithSelections(context, context.getString(title), selectionArrayList, listCallback);
    }

    public static void showAlertDialogWithSelections(Context context, String title, MaterialDialog.ListCallback listCallback, String... selections) {
        ArrayList<String> selectionArrayList = new ArrayList<>(Arrays.asList(selections));
        showAlertDialogWithSelections(context, title, selectionArrayList, listCallback);
    }

    public static void showAlertDialogWithSelections(Context context, ArrayList<String> selectionArrayList, MaterialDialog.ListCallback listCallback) {
        showAlertDialogWithSelections(context, null, selectionArrayList, listCallback);
    }

    public static void showAlertDialogWithSelections(Context context, String title, ArrayList<String> selectionArrayList, MaterialDialog.ListCallback listCallback) {
        CharSequence[] tmpSelections = new CharSequence[selectionArrayList.size()];
        for (int i = 0; i < selectionArrayList.size(); i++) {
            tmpSelections[i] = selectionArrayList.get(i);
        }

        final CharSequence[] selections = tmpSelections;

        MaterialDialog.Builder builder = new MaterialDialog.Builder(context);

        if (!TextUtils.isEmpty(title)) {
            builder.title(title);
        }
        builder.items(selections)
                .itemsCallback(listCallback)
                .show();
    }

}