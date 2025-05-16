package java_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bmicalculator.R
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.data.*

class ChartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart)

        val bmiChart = findViewById<LineChart>(R.id.bmiChart)

        val bmiValues = listOf(
            Entry(1f, 21.5f),
            Entry(2f, 22.3f),
            Entry(3f, 23.1f),
            Entry(4f, 22.8f),
            Entry(5f, 22.9f)
        )

        val dataSet = LineDataSet(bmiValues, "BMI w czasie").apply {
            lineWidth = 2f
            circleRadius = 4f
        }

        val lineData = LineData(dataSet)
        bmiChart.data = lineData

        bmiChart.description = Description().apply {
            text = "Mockowane dane BMI (dni)"
        }

        bmiChart.invalidate()
    }
}