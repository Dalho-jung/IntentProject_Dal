package com.n2isys.intentproject_dal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.n2isys.intentproject_dal.databinding.ActivityEditNicknameBinding
import com.n2isys.intentproject_dal.databinding.ActivityOtherBinding

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var viewbind2 = ActivityEditNicknameBinding.inflate(layoutInflater,null,false)

        setContentView(viewbind2.root)
    }
}