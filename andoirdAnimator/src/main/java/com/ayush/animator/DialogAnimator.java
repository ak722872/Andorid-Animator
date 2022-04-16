package com.ayush.animator;

import android.app.Dialog;

public class DialogAnimator {
    public static void  SLIDE_UP_SLIDE_DOWN (Dialog dialog){
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
    }
    public static void  SLIDE_IN_RIGHT_SLIDE_OUT_RIGHT (Dialog dialog){
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation2;
    }
    public static void  SLIDE_IN_LEFT_SLIDE_OUT_RIGHT (Dialog dialog){
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation4;
    }
    public static void  SLIDE_IN_LEFT_SLIDE_OUT_LEFT (Dialog dialog){
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation3;
    }
    public static void  SLIDE_IN_RIGHT_SLIDE_OUT_LEFT (Dialog dialog){
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation5;
    }



}
