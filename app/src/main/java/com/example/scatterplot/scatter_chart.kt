package com.example.scatterplot

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.ScatterChart
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.ScatterData
import com.github.mikephil.charting.data.ScatterDataSet


class scatter_chart : AppCompatActivity() {
    private var all_data= ArrayList<String>()
    private var scatterChart: ScatterChart ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scatter_chart)

        scatterChart = findViewById(R.id.scatter)
        scatterChartData()

    }

    fun scatterChartData() {

//        scatterEntries = ArrayList()
//        scatterEntries.add(BarEntry(2f, 0))
//        scatterEntries.add(BarEntry(4f, 1))
//        scatterEntries.add(BarEntry(6f, 1))
//        scatterEntries.add(BarEntry(8f, 3))
//        scatterEntries.add(BarEntry(7f, 4))
//        scatterEntries.add(BarEntry(3f, 3))

        val scatterentry= ArrayList<Entry>()

        val a=scatterentry.add(Entry(1f,175f,"83/67/25"))
        scatterentry.add(Entry(2f,130f,"99/82/50"))
        scatterentry.add(Entry(3f,90f,"67/34/27"))
        scatterentry.add(Entry(4f,210f,"78/50/24"))
        scatterentry.add(Entry(5f,250f,"91/79/86"))


//        val xval = ArrayList<String>()
//        xval.add("11:00 am")
//        xval.add("12:00 am")
//        xval.add("3:00 pm")
//        xval.add("6:00 pm")
//        xval.add("8:00 pm")

        val scatterDataSet = ScatterDataSet(scatterentry, "first")
        scatterDataSet.color= resources.getColor(R.color.black)

        val scatterData = ScatterData(scatterDataSet)
        scatterChart?.data= scatterData
        scatterChart?.setBackgroundColor(resources.getColor(R.color.white))
        scatterChart?.animateXY(3000, 3000)



    }
}