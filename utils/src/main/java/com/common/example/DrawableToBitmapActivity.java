package com.common.example;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import com.common.utils.R;

public class DrawableToBitmapActivity extends ActionBarActivity {

    private TextView tvCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_to_bitmap);

        tvCode = (TextView) findViewById(R.id.drawable_bitmap_tv_code);
        tvCode.setText(
                " \n\n \t CONVERT DRAWABLE TO BITMAP \n\n" +
                        " /**\n" +
                        "     * convert drawable to bitmap\n" +
                        "     *\n" +
                        "     * @param mContext\n" +
                        "     * @param drawable  for convert to bitmap\n" +
                        "     * @return bitmap image\n" +
                        "     */\n" +
                        "    public static Bitmap drawableTobitmap(Context mContext, int drawable) {\n" +
                        "        // TODO Auto-generated method stub\n" +
                        "        Drawable myDrawable = mContext.getResources().getDrawable(drawable);\n" +
                        "        return ((BitmapDrawable) myDrawable).getBitmap();\n" +
                        "    }\n" +
                        "\n" + " \n\n \t CONVERT DRAWABLE TO BITMAP \n\n" +
                        "    /**\n" +
                        "     * convert bitmap to drawable\n" +
                        "     *\n" +
                        "     * @param mContext\n" +
                        "     * @param bitmap   for convert to drawable\n" +
                        "     * @return drawable image\n" +
                        "     */\n" +
                        "    public static Drawable bitmapToDrawable(Context mContext, Bitmap bitmap) {\n" +
                        "        return new BitmapDrawable(bitmap);\n" +
                        "    }");
    }


}
