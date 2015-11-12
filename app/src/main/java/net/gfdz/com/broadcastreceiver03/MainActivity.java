package net.gfdz.com.broadcastreceiver03;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * 发送标准广播
 */

/**
 * 1.因此新建一个 MyBroadcastReceiver继承自 BroadcastReceiver
 * 2. AndroidManifest.xml 中对这个广播接收器进行注册：
 * 3.构建出了一
 个 Intent 对象， 并把要发送的广播的值传入， 然后调用了 Context 的 sendBroadcast()方法将广
 播发送出去，这样所有监听 com.example.broadcasttest.MY_BROADCAST 这条广播的广播接
 收器就会收到消息。此时发出去的广播就是一条标准广播。
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent("com.example.broadcasttest.MY_BROADCAST");
                sendBroadcast(intent);
    }
}
