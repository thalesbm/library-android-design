package bm.it.mobile.app.samples.dynamicList

import android.os.Bundle
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import bm.it.mobile.app.R
import java.util.*

class SampleDynamicListActivity : AppCompatActivity() {

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_list)
        init()
    }

    private fun init() {
        val adapter =
            SampleListStatementAdapter(
                createList()
            )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(
            SampleRecyclerSectionItemDecoration(
                adapter
            )
        )
        recyclerView.adapter = adapter
    }

    private fun createList(): List<SampleDynamicListModel> {
        val list: MutableList<SampleDynamicListModel> = ArrayList()

        for (i in 0..9) {
            val header =
                SampleDynamicListModel(
                    header = "10/10/2018",
                    hasHeader = true
                )
            list.add(header)
            for (j in 0..6) {
                val item =
                    SampleDynamicListModel(
                        header = "10/10/2018",
                        value = "R$ 10,00",
                        description = "POUPANÇA",
                        hasHeader = false
                    )
                list.add(item)
            }
        }
        return list
    }
}