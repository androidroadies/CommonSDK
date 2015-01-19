package com.common.example;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import com.common.utils.R;

public class PreventClickActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevent_click);

        TextView tvCode = (TextView) findViewById(R.id.prevent_double_click_tv_code);
        tvCode.setText(
                " \n \t Code to Prevent View from getting clicked more than once \n\n" +
                        " /**\n" +
                        "     * Preventing any view from getting clicked for particular time\n" +
                        "     *\n" +
                        "     * @param view\n" +
                        "     */\n" +
                        "    public static void preventDoubleClick(final View view) {\n" +
                        "        view.setEnabled(false);\n" +
                        "\n" +
                        "        new Handler().postDelayed(new Runnable() {\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void run() {\n" +
                        "                view.setEnabled(true);\n" +
                        "            }\n" +
                        "        }, MIN_CLICK_INTERVAL);\n" +
                        "    }");
    }


}
