package bm.it.mobile.app.samples.dynamicList

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import bm.it.mobile.app.samples.dynamicList.SampleDynamicListModel
import bm.it.mobile.app.samples.dynamicList.SampleHeaderViewHolder
import bm.it.mobile.app.samples.dynamicList.SampleItemViewHolder
import bm.it.mobile.ui.components.list.dynamic.adapter.DynamicListAdapter
import bm.it.mobile.ui.components.list.dynamic.itemDecoration.RecyclerSectionItemDecoration

class SampleListStatementAdapter(list: List<SampleDynamicListModel>) :
    DynamicListAdapter<SampleDynamicListModel>(list),
    RecyclerSectionItemDecoration.SectionCallback {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return super.onCreateViewHolder(
            viewType,
            SampleItemViewHolder(parent),
            SampleHeaderViewHolder(parent)
        )
    }

    override fun getHeader(itemPosition: Int): String {
        return list[itemPosition].header
    }

    override fun isHeader(itemPosition: Int): Boolean {
        return list[itemPosition].isHeader ?: false
    }
}
