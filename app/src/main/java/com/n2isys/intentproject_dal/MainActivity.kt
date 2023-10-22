package com.n2isys.intentproject_dal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.n2isys.intentproject_dal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var viewbind = ActivityMainBinding.inflate(layoutInflater,null,false)

        setContentView(viewbind.root)

    }
}