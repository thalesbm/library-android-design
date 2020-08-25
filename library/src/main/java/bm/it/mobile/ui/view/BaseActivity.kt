package bm.it.mobile.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(), IActivity {

    abstract fun initView()

    abstract fun getContentView(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initExtras()

        callBeforeLoadXML()

        setContentView(getContentView())

        initView()
    }

    override fun callBeforeLoadXML(){
        // not used here
    }

    override fun initExtras() {
        // not used here
    }
}