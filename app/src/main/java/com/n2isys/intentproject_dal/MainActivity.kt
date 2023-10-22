package com.n2isys.intentproject_dal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import com.n2isys.intentproject_dal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var viewbind = ActivityMainBinding.inflate(layoutInflater,null,false)

        setContentView(viewbind.root)

        viewbind.moveOtherBtn.setOnClickListener {

            //다른화면으로 이동
            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)

        }

    }
}