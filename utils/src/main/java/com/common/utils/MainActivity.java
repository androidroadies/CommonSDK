package com.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.common.example.AddressOnMapActivity;
import com.common.example.AppIconAct;
import com.common.example.ArraylistToStringActivity;
import com.common.example.BackGroundMusicStartStopAct;
import com.common.example.BluetoothOrWifiOnOffAct;
import com.common.example.BlurEffectActivity;
import com.common.example.ChooseProfileActivity;
import com.common.example.CreateFolderActivity;
import com.common.example.DateDifferenceActivity;
import com.common.example.DateFormateAct;
import com.common.example.DownloadImageFromUrlAct;
import com.common.example.DrawableToBitmapActivity;
import com.common.example.EmailContactsScreenShotActivity;
import com.common.example.FileCountActivity;
import com.common.example.GetCurrentLocationAct;
import com.common.example.GetPrefAct;
import com.common.example.GetRandomNumberAct;
import com.common.example.ImageVideoActivity;
import com.common.example.OpenUrlINBrowserAct;
import com.common.example.PickCaptureActivity;
import com.common.example.PinchZoomImageViewAct;
import com.common.example.PostFixForNumberAct;
import com.common.example.PreventClickActivity;
import com.common.example.RoundedBitmapActivity;
import com.common.example.SaveImageInPreference;
import com.common.example.ScreenModeDis_Ean_Act;
import com.common.example.SendLocatoNotificationAct;
import com.common.example.SetPrefAct;
import com.common.example.StringToDateActivity;
import com.common.example.ToastActivity;
import com.common.example.UrlValidationRippleActivity;
import com.common.example.ValidationAct;
import com.common.example.VerticalTextViewsActivity;
import com.common.example.VolumeActivity;

public class MainActivity extends Activity {

    Context mContext;
    Activity mActivity;
    ListView sdkFunctionalityList;
    private TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = MainActivity.this;
        mActivity = MainActivity.this;

        tvText = (TextView) findViewById(R.id.text);
        String[] sdkFunctionalityListValue = new String[]{
                "Validations",/* 0 */
                "Internet Availability",/* 1 */
                "Date Formats",/* 2 */
                "Device Id",/* 3 */
                "Set Preferences",/* 4 */
                "Get Preferences",/* 5 */
                "Get Current Location",/* 6 */
                "PinchZoom Image",/* 7 */
                "Get Application Icon",/* 8 */
                "Send Notification",/* 9 */
                "Get Random Character from A to Z",/* 10 */
                "Screen Sleep mode on off",/* 11 */
                "Open image from path",/* 12 */
                "Open video from path",/* 13 */
                "Open Url in Browser",/* 14 */
                "Show Address on Map",/* 15 */
                "Create Folder or Directory",/* 16 */
                "Download Image From Url",/* 17 */
                "Open Date Picker",/* 18 */
                "Open Time Picker",/* 19 */
                "Get files count in directory",/* 20 */
                "Get Date Difference",/* 21 */
                "Convert String Date to DateFormat",/* 22 */
                "Get Device Height",/* 23 */
                "Get Device Width",/* 24 */
                "Genrate Random Number",/* 25 */
                "PostFixForNumber",/* 26 */
                "Convert Comma Separated String to ArrayList and ViseVersa",/* 27 */
                "Music ON OFF",/* 28 */
                "Apply Blur Effect on Image",/* 29 */
                "Drawable to bitmap and ViceVersa",/* 30 */
                "Set Device Volume as App Volume",/* 31 */
                "Set and Get image from Preferences",/* 32 */
                "Application version",/* 33 */
                "Vertical TextViews",/* 34 */
                "SDCard Available?",/* 35 */
                "Show Share Dialog",/* 36 */
                "Change Device Profile",/* 37 */
                "Change Bitmap to Rounded Cornered",/* 38 */
                "Show Toast",/* 39 */
                "Prevent Double Click",/* 40 */
                "Bluetooth/wifi On Off",/* 41 */
                "Pick/Capture Image/Video and preview",/* 42 */
                "Url Validation & Ripple Effect",/* 43 */
                "Contacts with EmailId & ScreenShot",/* 44 */
                "Social Integration"/* 45 */
        };

        sdkFunctionalityList = (ListView) findViewById(R.id.Md_list_company);

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, sdkFunctionalityListValue);
        sdkFunctionalityList.setAdapter(stringArrayAdapter);

        sdkFunctionalityList.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                selectedListItem(position);
            }

        });

        sdkFunctionalityList.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                tvText.setText("");
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

            }
        });
    }

    protected void selectedListItem(int position) {
        Intent intent = null;

        switch (position) {
            case 0:
                intent = new Intent(mContext, ValidationAct.class);
                break;
            case 1:
                if (Common.isNetworkAvailable(mContext))
                    Common.showAlertDialog(this, getString(R.string.app_name), "Internet Connection is Available.", false);
                else
                    Common.showAlertDialog(this, getString(R.string.app_name), "Internet Connection is NOT Available.", false);
                break;
            case 2:
                intent = new Intent(mContext, DateFormateAct.class);
                break;
            case 3:
                Common.showAlertDialog(this, "", "Your device id is:" + Common.getDeviceId(mContext), false);
                break;
            case 4:
                intent = new Intent(mContext, SetPrefAct.class);
                break;
            case 5:
                intent = new Intent(mContext, GetPrefAct.class);
                break;
            case 6:
                intent = new Intent(mContext, GetCurrentLocationAct.class);
                break;
            case 7:
                intent = new Intent(mContext, PinchZoomImageViewAct.class);
                break;
            case 8:
                intent = new Intent(mContext, AppIconAct.class);
                break;
            case 9:
                intent = new Intent(mContext, SendLocatoNotificationAct.class);
                break;
            case 10:
                tvText.setText(Common.getRandomCharacter() + "");
                break;
            case 11:
                intent = new Intent(mContext, ScreenModeDis_Ean_Act.class);
                break;
            case 12:
                intent = new Intent(mContext, ImageVideoActivity.class);
                intent.putExtra("image", true);
                break;
            case 13:
                intent = new Intent(mContext, ImageVideoActivity.class);
                intent.putExtra("image", false);
                break;
            case 14:
                intent = new Intent(mContext, OpenUrlINBrowserAct.class);
                break;
            case 15:
                intent = new Intent(mContext, AddressOnMapActivity.class);
                break;
            case 16:
                intent = new Intent(mContext, CreateFolderActivity.class);
                break;
            case 17:
                intent = new Intent(mContext, DownloadImageFromUrlAct.class);
                break;
            case 18:
                Common.showDatePickerDialog(mContext, "yyyy-MM-dd", tvText);
                break;
            case 19:
                Common.showTimePickerDialog(mContext, tvText);
                break;
            case 20:
                intent = new Intent(mContext, FileCountActivity.class);
//                tvText.setText("Total " + Common.getFileCounts("jpg", Environment.getExternalStorageDirectory().getPath()) + " JPG file's");
                break;
            case 21:
                intent = new Intent(mContext, DateDifferenceActivity.class);
//                tvText.setText("Difference is " + Common.calculateDays(new Date("1/12/2014"), new Date("1/12/2015")));
                break;
            case 22:
                intent = new Intent(mContext, StringToDateActivity.class);
//                tvText.setText("Date in milliseconds : " + Common.stringToDate("01/12/2014", "dd/MM/yyyy").getTime());
                break;
            case 23:
                Common.showAlertDialog(this, getString(R.string.app_name), "Your Device height is:" + Common.getDeviceHeight(mContext), false);
                break;
            case 24:
                Common.showAlertDialog(this, getString(R.string.app_name), "Your Device Width is:" + Common.getDeviceWidth(mContext), false);
                break;
            case 25:
                intent = new Intent(mContext, GetRandomNumberAct.class);
                break;
            case 26:
                intent = new Intent(mContext, PostFixForNumberAct.class);
                break;
            case 27:
                intent = new Intent(mContext, ArraylistToStringActivity.class);
                break;
            case 28:
                intent = new Intent(mContext, BackGroundMusicStartStopAct.class);
                break;
            case 29:
                intent = new Intent(mContext, BlurEffectActivity.class);
                break;
            case 30:
                intent = new Intent(mContext, DrawableToBitmapActivity.class);
                break;
            case 31:
                intent = new Intent(mContext, VolumeActivity.class);
//                Common.showAlertDialog(mContext, getString(R.string.app_name), "In Development", false);
                break;
            case 32:
                intent = new Intent(mContext, SaveImageInPreference.class);
                break;
            case 33:
                Common.showAlertDialog(this, getString(R.string.app_name), "Your App version is:" + Common.getAppVersionCode(mContext), false);
                break;
            case 34:
                intent = new Intent(mContext, VerticalTextViewsActivity.class);
                break;
            case 35:
                if (Common.isSDCardAvailable(mContext))
                    Common.showAlertDialog(this, getString(R.string.app_name), "SDCard Is Available ", false);
                else
                    Common.showAlertDialog(this, getString(R.string.app_name), "SDCard Is Not Available ", false);
                break;
            case 36:
                Common.openShareDialog(mContext, "Share Title", "", "Share Text", "Share Subject");
                break;
            case 37:
                intent = new Intent(mContext, ChooseProfileActivity.class);
//                Common.chooseProfile(mContext, 0); // 0= Silent , 1= Vibrate , 2 = Normal
                break;
            case 38:
                intent = new Intent(mContext, RoundedBitmapActivity.class);
                break;
            case 39:
                intent = new Intent(mContext, ToastActivity.class);
//                Common.showAlertDialog(mContext, "", "Test Toast", true);
                break;
            case 40:
                intent = new Intent(mContext, PreventClickActivity.class);
                break;
            case 41:
                intent = new Intent(mContext, BluetoothOrWifiOnOffAct.class);
                break;
            case 42:
                intent = new Intent(mContext, PickCaptureActivity.class);
                break;
            case 43:
                intent = new Intent(mContext, UrlValidationRippleActivity.class);
                break;
            case 44:
                intent = new Intent(mContext, EmailContactsScreenShotActivity.class);
                break;
            case 45:
                intent = new Intent(mContext, com.common.example.CommonActivity.class);
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}