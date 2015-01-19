package com.common.example;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

import com.common.utils.Common;
import com.common.utils.R;

public class BlurEffectActivity extends ActionBarActivity {

    private ImageView ivBlur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blur_effect);

        ivBlur = (ImageView) findViewById(R.id.blur_effect_iv_blur);

        ivBlur.setImageDrawable(Common.blurEffectsOnDrawable(this, R.drawable.ic_launcher, 5));
    }

}
