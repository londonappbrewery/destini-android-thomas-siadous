package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mStoryText;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Destini", "the button has been pressed!");
                if(mStoryIndex == 1) {
                    displayT3();
                    mStoryIndex = 3;
                }
                else if(mStoryIndex == 2) {
                    displayT3();
                    mStoryIndex = 3;
                }
                else if(mStoryIndex == 3) {
                    displayT6();
                    mStoryIndex = 6;
                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Destini", "the button has been pressed!");
                if(mStoryIndex == 1) {
                    displayT2();
                    mStoryIndex = 2;
                }
                else if(mStoryIndex == 2) {
                    displayT4();
                    mStoryIndex = 4;
                }
                else if(mStoryIndex == 3) {
                    displayT5();
                    mStoryIndex = 5;
                }
            }
        });

    }
        private void displayT2() {
            mStoryText.setText(R.string.T2_Story);
            mButtonTop.setText(R.string.T2_Ans1);
            mButtonBottom.setText(R.string.T2_Ans2);
        }

        private void displayT3() {
            mStoryText.setText(R.string.T3_Story);
            mButtonTop.setText(R.string.T3_Ans1);
            mButtonBottom.setText(R.string.T3_Ans2);
        }

        private void displayT4() {
            mStoryText.setText(R.string.T4_End);
            mButtonTop.setVisibility(View.INVISIBLE);
            mButtonBottom.setVisibility(View.INVISIBLE);
        }

        private void displayT5() {
            mStoryText.setText(R.string.T5_End);
            mButtonTop.setVisibility(View.INVISIBLE);
            mButtonBottom.setVisibility(View.INVISIBLE);
        }

        private void displayT6() {
            mStoryText.setText(R.string.T6_End);
            mButtonTop.setVisibility(View.INVISIBLE);
            mButtonBottom.setVisibility(View.INVISIBLE);
        }

}
