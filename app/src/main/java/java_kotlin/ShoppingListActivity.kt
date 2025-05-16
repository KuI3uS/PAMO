package java_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bmicalculator.R

class ShoppingListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_list)

        val shoppingList = listOf(
            ShoppingItem("Pierś z kurczaka"),
            ShoppingItem("Awokado"),
            ShoppingItem("Jogurt naturalny"),
            ShoppingItem("Cytryna"),
            ShoppingItem("Sałata")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.shoppingRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ShoppingItemAdapter(shoppingList)
    }
}