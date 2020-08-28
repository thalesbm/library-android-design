package bm.it.mobile.app.samples.dynamicList

import android.view.ViewGroup
import android.widget.TextView
import bm.it.mobile.app.R
import bm.it.mobile.ui.components.list.dynamic.viewHolder.HeaderViewHolder

class SampleHeaderViewHolder(parent: ViewGroup) :
    HeaderViewHolder<SampleDynamicListModel>(parent, R.layout.adapter_dynamic_header) {

    private lateinit var mTextDate: TextView

    override fun initView() {
        mTextDate = itemView.findViewById(R.id.header)
    }

    override fun bind(item: SampleDynamicListModel, position: Int) {
        super.bind(item, position)
        mTextDate.text = item.header
    }
}
