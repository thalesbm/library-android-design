package bm.it.mobile.ui.view

import android.R
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar

abstract class BaseToolbarActivity: BaseActivity() {

    abstract fun toolbar(): Toolbar
    abstract fun toolbarTitle(): String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        configureToolbar()
    }

    protected fun configureToolbar() {
        setSupportActionBar(toolbar())
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = toolbarTitle()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.itemId) {
            R.id.home -> onBackPressed()
        }
        return true
    }
}
