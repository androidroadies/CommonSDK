package com.common.example;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.common.utils.Common;
import com.common.utils.R;

public class DateDifferenceActivity extends ActionBarActivity {


    EditText et_Url;
    Button btnOpenUrl;
    private DateDifferenceActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_difference);
        mContext = DateDifferenceActivity.this;
        init();

    }

    private void init() {

        et_Url = (EditText) findViewById(R.id.et_address);
        btnOpenUrl = (Button) findViewById(R.id.btnOpenMap);

        btnOpenUrl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (Common.isNetworkAvailable(mContext)) {
                    if (Common.isEmptyEditText(et_Url)) {
                        boolean created = Common.createFolder(mContext, Environment.getExternalStorageDirectory().getPath(), "TestFolder");
                        if (created)
                            Common.showAlertDialog(mContext, getString(R.string.app_name), "Folder Created  " + Environment.getExternalStorageDirectory().getPath() + "/TestFolder", false);
                        else
                            Common.showAlertDialog(mContext, getString(R.string.app_name), "Folder Not Created OR Folder is already Created", false);
                    } else {
                        boolean created = Common.createFolder(mContext, Environment.getExternalStorageDirectory().getPath(), et_Url.getText().toString());
                        if (created)
                            Common.showAlertDialog(mContext, getString(R.string.app_name), "Folder Created  " + Environment.getExternalStorageDirectory().getPath() + "/" + et_Url.getText().toString(), false);
                        else
                            Common.showAlertDialog(mContext, getString(R.string.app_name), "Folder Not Created OR Folder is already Created", false);
                    }
                } else {
                    Common.showNETWORDDisabledAlert(mContext);
                }

            }
        });
    }

}
