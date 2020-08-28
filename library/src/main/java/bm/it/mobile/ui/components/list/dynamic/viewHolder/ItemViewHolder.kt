package bm.it.mobile.ui.components.list.dynamic.viewHolder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class ItemViewHolder<T>(var parent: ViewGroup, layout: Int) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(layout, parent, false)
    ) {

    protected abstract fun initView()

    init {
        initView()
    }

    open fun bind(t: T) {}
}
