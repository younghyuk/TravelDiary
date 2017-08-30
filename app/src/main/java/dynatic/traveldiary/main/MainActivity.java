package dynatic.traveldiary.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import dynatic.traveldiary.R;
import dynatic.traveldiary.base.BaseActivity;
import kyora.itineraryalgorithms.ItineraryAlgorithms;

public class MainActivity extends BaseActivity {

    private Button btnCheck;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Init Test

        View view = new TextView(this);
        view.setOnClickListener(v -> {
        });

        btnCheck = (Button) findViewById(R.id.btnCheck);
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                ItineraryAlgorithms itr = new ItineraryAlgorithms();
                txtResult.setText(itr.PrintAARCheck());
            }
        });

    }
}
