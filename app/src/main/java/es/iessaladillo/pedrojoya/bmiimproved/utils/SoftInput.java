package es.iessaladillo.pedrojoya.bmiimproved.utils;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.NonNull;

public final class SoftInput {

    private SoftInput() {
    }

    public static boolean showSoftInput(@NonNull View view) {
        if (view.requestFocus()) {
            InputMethodManager imm = (InputMethodManager) view.getContext().getSystemService(
                (Context.INPUT_METHOD_SERVICE));
            if (imm != null) {
                return imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT);
            }
        }
        return false;
    }

    public static void hideKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext()
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

}
