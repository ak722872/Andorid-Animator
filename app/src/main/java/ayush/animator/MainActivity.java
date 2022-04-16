package ayush.animator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


import com.google.android.material.bottomsheet.BottomSheetDialog;


public class MainActivity extends AppCompatActivity {
    CardView view2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view2 = findViewById(R.id.view);
    }
    public void btnClick(View view) {
        animateView.slideDownInvisible(view2,520);
    }
    public void btnClickSlideUp(View view) {
        anima.slideRightVisible(view2);

    }
}