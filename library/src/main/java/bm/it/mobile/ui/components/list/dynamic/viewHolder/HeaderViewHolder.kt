package bm.it.mobile.ui.components.list.dynamic.viewHolder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class HeaderViewHolder<T>(private val parent: ViewGroup, layout: Int) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(layout, parent, false)
    ) {

    private val velocitiY = -3000

    protected abstract fun initView()

    init {
        initView()
    }

    open fun bind(t: T, position: Int) {
        itemView.setAccessibilityDelegate(object : View.AccessibilityDelegate() {
            override fun performAccessibilityAction(
                host: View,
                action: Int,
                args: Bundle
            ): Boolean {
                if (position == 0) {
                    (parent as RecyclerView).fling(0, velocitiY)
                }
                return super.performAccessibilityAction(host, action, args)
            }
        })
    }
}
