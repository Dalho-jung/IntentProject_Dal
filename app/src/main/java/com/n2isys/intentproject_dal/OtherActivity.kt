package com.n2isys.intentproject_dal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.n2isys.intentproject_dal.databinding.ActivityMainBinding
import com.n2isys.intentproject_dal.databinding.ActivityOtherBinding

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var viewbind2 = ActivityOtherBinding.inflate(layoutInflater,null,false)

        setContentView(viewbind2.root)

        viewbind2.returnBtn.setOnClickListener {
//            val myIntent = Intent(this,MainActivity::class.java)
//            startActivity(myIntent)
            finish()

        }
    }
}