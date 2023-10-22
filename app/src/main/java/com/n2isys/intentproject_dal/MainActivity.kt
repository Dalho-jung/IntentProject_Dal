package com.n2isys.intentproject_dal

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.Toast
import com.n2isys.intentproject_dal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val REQUEST_FOR_NICKNAME = 1005
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var viewbind = ActivityMainBinding.inflate(layoutInflater,null,false)

        setContentView(viewbind.root)

        viewbind.moveOtherBtn.setOnClickListener {

            //다른화면으로 이동
            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)

        }

        viewbind.sendMessageBtn.setOnClickListener {
//          입력한 내용을 변수ㅠ에 저장
            val inputMessage = viewbind.messageEdt.text.toString()
            val myIntent = Intent(this,MessageActivity::class.java)
            myIntent.putExtra("message",inputMessage)

            startActivity(myIntent)
        }

        viewbind.editNicknameBtn.setOnClickListener {

            val myIntent = Intent(this,EditNicknameActivity::class.java)
            startActivityForResult(myIntent,REQUEST_FOR_NICKNAME)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // 닉네임을 관련된거냐?
        if(requestCode == REQUEST_FOR_NICKNAME){
            if(resultCode == Activity.RESULT_OK){
                val newNicname = data?.getStringExtra("nickname")
                Toast.makeText(this , newNicname ,Toast.LENGTH_SHORT).show()
            }
        }
    }
}