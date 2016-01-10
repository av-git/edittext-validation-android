package com.orogersilva.edittextvalidation.activities;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.orogersilva.edittextvalidation.R;
import com.orogersilva.edittextvalidation.utils.StringUtils;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    // region FIELDS

    @Bind(R.id.user_name_editText)
    EditText mUserNameEditText;

    // endregion

    // region ACTIVITY LIFECYCLE METHODS

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    // endregion

    // region OTHER METHODS

    @OnClick(R.id.save_user_button)
    public void onClickSave() {

        String userName = mUserNameEditText.getText().toString();

        if (StringUtils.isNullOrEmpty(userName)) {
            mUserNameEditText.setError(getString(R.string.required_name_message));
        }
    }

    // endregion
}
