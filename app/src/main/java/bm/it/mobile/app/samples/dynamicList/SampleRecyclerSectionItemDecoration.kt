package bm.it.mobile.app.samples.dynamicList

import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import bm.it.mobile.app.R
import bm.it.mobile.ui.components.list.dynamic.itemDecoration.RecyclerSectionItemDecoration

class SampleRecyclerSectionItemDecoration(@NonNull listener: SectionCallback) :
    RecyclerSectionItemDecoration(listener) {

    override fun getHeaderViewForItem(headerPosition: Int, parent: RecyclerView): View {
        val header: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_dynamic_header, parent, false)

        val tv = header.findViewById<TextView>(R.id.header)
        tv.text = (parent.adapter as SectionCallback).getHeader(headerPosition)

        return header
    }
}
