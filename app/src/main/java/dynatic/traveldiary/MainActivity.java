package dynatic.traveldiary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import kyora.itineraryalgorithms.ItineraryAlgorithms;

public class MainActivity extends AppCompatActivity {

    private Button btnCheck;
    private TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Init Test

        btnCheck = (Button)findViewById(R.id.btnCheck);
        txtResult = (TextView)findViewById(R.id.txtResult);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                ItineraryAlgorithms itr = new ItineraryAlgorithms();
                txtResult.setText(itr.PrintAARCheck());
            }
        });
    }
}
