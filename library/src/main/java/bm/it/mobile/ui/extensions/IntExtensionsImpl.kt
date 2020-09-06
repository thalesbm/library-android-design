package bm.it.mobile.ui.extensions

import android.content.Context
import androidx.core.content.ContextCompat

object IntExtensionsImpl {

    fun getColor(context: Context, id: Int) =
        ContextCompat.getColor(context, id)
}