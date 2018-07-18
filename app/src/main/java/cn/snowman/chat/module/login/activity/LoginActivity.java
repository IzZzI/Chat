package cn.snowman.chat.module.login.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import cn.snowman.chat.R;
import cn.snowman.chat.base.BaseActivity;
import cn.snowman.chat.common.view.AutoCleanEditText;
import cn.snowman.chat.contract.LoginContract;
import cn.snowman.chat.module.login.presenter.LoginPresenter;


public class LoginActivity extends BaseActivity implements LoginContract.ILoginVew {
    private static final int THIRD_PARTY_LOGIN_QQ = 0;
    private static final int THIRD_PARTY_LOGIN_WECHAT = 1;
    private static final int THIRD_PARTY_LOGIN_SINAWEIBO = 2;
    @BindView(R.id.et_login_username)
    AutoCleanEditText mUsernameEditText;
    @BindView(R.id.et_login_password)
    AutoCleanEditText mPasswordEditText;
    //    @BindView(R.id.btn_login_login)
//    Button mLoginButton;
    @BindView(R.id.tv_title)
    TextView mTitleTextView;
    @BindView(R.id.rl_title_include_container)
    RelativeLayout mTitleContainerRelativeLayout;
    private LoginContract.ILoginPresenter mLoginPresenter;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initData();
    }

    private void initView() {
        mTitleTextView.setText(getResources().getString(R.string.login));
        mTitleContainerRelativeLayout.getBackground().setAlpha(255);
    }

    private void initData() {
        mLoginPresenter = new LoginPresenter(this);
//		SharedPreferencesUtil sp = new SharedPreferencesUtil(this);
//		String mUsername = sp.getString(Constant.SP_KEY_USERNAME);
//		String mPassword = sp.getString(Constant.SP_KEY_PASSWORD);
//		if (!StrUtil.strIsNullOrEmpty(mUsername))
//		{
//			mUsernameEditText.setMessage(mUsername);
//			mPasswordEditText.requestFocus();
//			if (!StrUtil.strIsNullOrEmpty(mPassword))
//			{
//				mPasswordEditText.setMessage(mPassword);
//			}
//		}

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

//    @OnClick(
//            {
//                    R.id.btn_login_register,  R.id.btn_back})
//    void OnClick(View v) {
//        switch (v.getId()) {
//            case R.id.btn_login_register:
//                register();
//                break;
////            case R.id.btn_login_login:
////                login();
////                break;
//            case R.id.btn_back:
//                finish();
//                break;
//
//            default:
//                break;
//        }
//    }

    private void register() {
        // 注册成功应该直接进入主页 登录界面应该销毁
        Intent in = new Intent(this, RegisterActivity.class);
        startActivityForResult(in, 2);
    }

    private void login() {
//        if (mProgressGenerator.isRunning()) {
//            return;
//        }
//        final String mUsername = mUsernameEditText.getText().toString().trim();
//        final String mPassword = mPasswordEditText.getText().toString().trim();
//        if ("".equals(mUsername)) {
//            ToastUtil.showToast(this, getResources().getString(R.string.username_is_empty));
//        } else if ("".equals(mPassword)) {
//            ToastUtil.showToast(this, getResources().getString(R.string.password_is_empty));
//        } else {
//            SharedPreferencesUtil sp = new SharedPreferencesUtil(this);
//            sp.putString(Constant.SP_KEY_USERNAME, mUsername);
//            sp.putString(Constant.SP_KEY_PASSWORD, mPassword);
//            mProgressGenerator.start();
//            mHandler.postDelayed(new Runnable() {
//
//                @Override
//                public void run() {
//                    mLoginPresenter.login(mUsername, mPassword);
//                }
//            }, 700);
//
//        }

    }


    @Override
    public void onLoginSuccessed(Object object) {
//        DialogUtil.removeDialog(this);
//        ToastUtil.showToast(this, getResources().getString(R.string.login_success));
//        mProgressGenerator.onSuccessed();
//        setResult(RESULT_OK);
//        finish();
//        overridePendingTransition(R.anim.anim_alpha, R.anim.anim_close);
    }

    @Override
    public void onLoginFailed(String errorMsg) {
//        DialogUtil.removeDialog(this);
//        mProgressGenerator.onError();
//        ToastUtil.showToast(this, errorMsg);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (resultCode == RESULT_OK && requestCode == Constant.REQUESTCODE_REGISTER) {
//            setResult(RESULT_OK);
//            finish();
//            overridePendingTransition(R.anim.anim_alpha, R.anim.anim_close);
//        }
    }

}
