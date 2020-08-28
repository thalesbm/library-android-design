package bm.it.mobile.ui.components.list.dynamic.adapter

import androidx.recyclerview.widget.RecyclerView
import bm.it.mobile.ui.components.list.dynamic.itemDecoration.RecyclerSectionItemDecoration
import bm.it.mobile.ui.components.list.dynamic.viewHolder.HeaderViewHolder
import bm.it.mobile.ui.components.list.dynamic.viewHolder.ItemViewHolder

abstract class DynamicListAdapter<T>(protected var list: List<T>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(), RecyclerSectionItemDecoration.SectionCallback {

    protected val ITEM_VIEW = 0
    protected val HEADER_VIEW = 1

    protected abstract fun isHeader(position: Int): Boolean

    open fun onCreateViewHolder(
        viewType: Int, itemViewHolder: ItemViewHolder<T>,
        headerViewHolder: HeaderViewHolder<T>
    ): RecyclerView.ViewHolder {
        var viewHolder: RecyclerView.ViewHolder? = null
        when (viewType) {
            ITEM_VIEW -> viewHolder = itemViewHolder
            HEADER_VIEW -> viewHolder = headerViewHolder
        }
        return viewHolder!!
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewType = getItemViewType(position)

        when (viewType) {
            ITEM_VIEW -> {
                val item: T? = list[position]
                if (item != null) {
                    val itemViewHolder: ItemViewHolder<T> = holder as ItemViewHolder<T>
                    itemViewHolder.bind(item)
                }
            }
            HEADER_VIEW -> {
                val header: T? = list!![position]
                if (header != null) {
                    val headerViewHolder: HeaderViewHolder<T> = holder as HeaderViewHolder<T>
                    headerViewHolder.bind(header, position)
                }
            }
        }
    }

    override fun getHeaderPositionForItem(itemPosition: Int): Int {
        var itemPosition = itemPosition

        var headerPosition = if (list.isEmpty()) 0 else 1

        do {
            if (isHeader(itemPosition)) {
                if (itemPosition != 0) {
                    headerPosition = itemPosition
                    break
                }
            }
            itemPosition -= 1
        } while (itemPosition >= 0)
        return headerPosition
    }

    override fun checkHeader(itemPosition: Int): Boolean {
        return list.isNotEmpty() && isHeader(itemPosition)
    }

    override fun getItemViewType(position: Int): Int {
        return if (list.isNotEmpty() && isHeader(position)) {
            HEADER_VIEW
        } else {
            ITEM_VIEW
        }
    }

    override fun getItemCount() = list.size
}
