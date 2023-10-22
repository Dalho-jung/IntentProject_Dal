package com.n2isys.intentproject_dal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.n2isys.intentproject_dal.databinding.ActivityMessageBinding
import com.n2isys.intentproject_dal.databinding.ActivityOtherBinding

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var viewbind3 = ActivityMessageBinding.inflate(layoutInflater,null,false)
        setContentView(viewbind3.root)

        val intentMessage = intent.getStringExtra("message")
        viewbind3.receiveMessageTxt.text = intentMessage
    }
}