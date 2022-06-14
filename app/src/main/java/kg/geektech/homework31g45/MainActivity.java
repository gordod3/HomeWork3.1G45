package kg.geektech.homework31g45;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.activity_main_recyclerView);
        ArrayList<String> phoneNumbers = new ArrayList<>();
        addPhoneNumbers(phoneNumbers, 20);
        recyclerView.setAdapter(new PhoneNumberAdapter(phoneNumbers));
    }

    private void addPhoneNumbers(ArrayList<String> phoneNumbers, int p) {
        for (int i = 0; i < p; i++) {
            phoneNumbers.add( "+996552757441");
        }
    }
}