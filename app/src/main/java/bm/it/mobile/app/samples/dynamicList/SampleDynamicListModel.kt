package bm.it.mobile.app.samples.dynamicList

import android.os.Parcelable
import bm.it.mobile.ui.components.list.dynamic.viewData.DynamicListViewData
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SampleDynamicListModel(
    var header: String = "",
    var description: String = "",
    var value: String = "",
    var hasHeader: Boolean
) :
    DynamicListViewData(hasHeader), Parcelable
