package bm.it.mobile.app.samples.dynamicList

import android.view.ViewGroup
import android.widget.TextView
import bm.it.mobile.app.R
import bm.it.mobile.ui.components.list.dynamic.viewHolder.ItemViewHolder

class SampleItemViewHolder(parent: ViewGroup) :
    ItemViewHolder<SampleDynamicListModel>(parent, R.layout.adapter_dynamic_item) {

    private lateinit var mTextDescription: TextView
    private lateinit var mTextPrice: TextView

    override fun initView() {
        mTextDescription = itemView.findViewById(R.id.description)
        mTextPrice = itemView.findViewById(R.id.price)
    }

    override fun bind(item: SampleDynamicListModel) {
        super.bind(item)
        mTextDescription.text = item.description
        mTextPrice.text = item.value

    }
}
