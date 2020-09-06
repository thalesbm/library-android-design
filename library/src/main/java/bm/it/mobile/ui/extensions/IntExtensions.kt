package bm.it.mobile.ui.extensions

import android.content.Context

fun Int.getColor(context: Context) = IntExtensionsImpl.getColor(context, this)