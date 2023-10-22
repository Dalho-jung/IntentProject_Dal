package com.n2isys.intentproject_dal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.n2isys.intentproject_dal.databinding.ActivityEditNicknameBinding
import com.n2isys.intentproject_dal.databinding.ActivityOtherBinding

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var viewbind2 = ActivityEditNicknameBinding.inflate(layoutInflater,null,false)

        setContentView(viewbind2.root)

        viewbind2.okBtn.setOnClickListener {

            val inputNewNickname = viewbind2.newNicknameEdt.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("nickname",inputNewNickname)
            setResult(RESULT_OK , resultIntent)
            finish()
        }
    }
}