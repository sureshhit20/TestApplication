package droid10.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DrinkExpert ExpertFunction = new DrinkExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindDrink(View view){
       TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String drinkType = String.valueOf(color.getSelectedItem());

        List<String> brandList = ExpertFunction.getBrands(drinkType);

        StringBuilder SB = new StringBuilder();
        for(String abc: brandList){
            SB.append(abc).append('\n');
        }
        brands.setText(SB);
    }
}
