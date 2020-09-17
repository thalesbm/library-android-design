package bm.it.mobile.ui.helpers

import android.content.Context
import android.util.DisplayMetrics

object ViewHelpers {

    fun calculateNoOfColumns(context: Context, columnSize: Int): Int {
        val displayMetrics: DisplayMetrics = context.resources.displayMetrics
        val screenWidthDp = displayMetrics.widthPixels / displayMetrics.density
        return (screenWidthDp / columnSize + 0.5).toInt()
    }
}
