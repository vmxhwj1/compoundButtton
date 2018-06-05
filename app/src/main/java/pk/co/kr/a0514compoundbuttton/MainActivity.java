package pk.co.kr.a0514compoundbuttton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    CheckBox fontsize;
    RadioGroup fontcolor;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fontsize = (CheckBox)findViewById(R.id.fontsize);
        fontcolor = (RadioGroup)findViewById(R.id.fontcolor);
        toggleButton = (ToggleButton)findViewById(R.id.toggle);

        //fontsize의 값이 변경될 때 수행할 이벤트 처리
        fontsize.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    toggleButton.setTextSize(40);
                }
                else{
                    toggleButton.setTextSize(20);
                }
            }
        });

        //fontcolor의 선택이 변경되었을 때 처리를 위한 처리
        fontcolor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.red:
                        toggleButton.setTextColor(Color.RED);
                        break;
                    case R.id.green:
                        toggleButton.setTextColor(Color.GREEN);
                        break;
                    case R.id.blue:
                        toggleButton.setTextColor(Color.BLUE);
                        break;

                }
            }
        });
    }
}















