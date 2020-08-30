package bm.it.mobile.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import bm.it.mobile.app.samples.dynamicList.SampleDynamicListActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dynamicListButton = findViewById<Button>(R.id.dynamic_list_button)
        dynamicListButton.setOnClickListener {
            startActivity(Intent(this, SampleDynamicListActivity::class.java))
        }
    }
}