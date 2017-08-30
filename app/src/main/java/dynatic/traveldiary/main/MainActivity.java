package dynatic.traveldiary.main;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import dynatic.traveldiary.R;
import dynatic.traveldiary.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Init Test

        View view = new TextView(this);
        view.setOnClickListener(v -> {
        });

    }
}
