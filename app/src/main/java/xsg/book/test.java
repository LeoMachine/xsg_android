package xsg.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import xsg.book.login_regist.Login_noToken;
import xsg.book.login_regist.Regist;
import xsg.book.mainFunctions.releaseRequirements;
import xsg.book.main_inteface.main_interface;
import xsg.book.mine.mine;

public class test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void login(View view) {
        Intent intent;
        intent = new Intent(this, Login_noToken.class);
        startActivityForResult(intent, 0);
    }

    public void zhuce1(View view) {
        Intent intent;
        intent = new Intent(this, Regist.class);
        startActivityForResult(intent, 0);
    }

    public void requirement(View view) {
        Intent intent;
        intent = new Intent(this, releaseRequirements.class);
        startActivityForResult(intent, 0);
    }
    public void mine(View view) {
        Intent intent;
        intent = new Intent(this, mine.class);
        startActivityForResult(intent, 0);
    }
    public void main(View view) {
        Intent intent;
        intent = new Intent(this, main_interface.class);
        startActivityForResult(intent, 0);
    }

}
