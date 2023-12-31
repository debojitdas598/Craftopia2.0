package com.example.craftopia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.privacysandbox.tools.core.model.Types.double
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import org.json.JSONObject

class ItemPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_page)
        val img = findViewById<ImageView>(R.id.img);
        val sellername = findViewById<TextView>(R.id.sellerName);
        val productname = findViewById<TextView>(R.id.itemName);
        val productdetails = findViewById<TextView>(R.id.productdetails);
        val sp = findViewById<TextView>(R.id.sp)
        val cp = findViewById<TextView>(R.id.cp)
        val discount = findViewById<TextView>(R.id.discountpercent)

        val category = intent.getStringExtra("category")
        val index = intent.getIntExtra("index",-1)
        val url ="https://res.cloudinary.com/dvuz0jdzl/raw/upload/v1687538321/Craftopia/databasejson/database_v5sprd.json"
        val queue = Volley.newRequestQueue(this)
        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, url, null,
            { response ->
                // JSON object response
                val jsonArray = response.getJSONArray(category);
                val jsonObject = jsonArray.getJSONObject(index);
                val sellernametxt = jsonObject.getString("sellername")
                val productnametxt = jsonObject.getString("productname")
                val imageurltxt = jsonObject.getString("imageurl")
                val productdetailstxt = jsonObject.getString("productdetails")
                val costpricetxt = jsonObject.getString("costprice")
                val sellingpricetxt = jsonObject.getString("sellingprice")
                val ratingtxt = jsonObject.getString("rating")

                sellername.setText(sellernametxt.toString())
                productname.setText(productnametxt.toString())
                productdetails.setText(productdetailstxt.toString())
                cp.setText(" ₹"+costpricetxt.toString())
                sp.setText("  ₹"+sellingpricetxt.toString())
                Glide.with(this)
                    .load(imageurltxt)
                    .into(img)


                val discount = Math.round(((costpricetxt.toDouble() - sellingpricetxt.toDouble())/costpricetxt.toDouble())*100)

                // Use the JSON string as needed
                // ...

                // Convert the JSON object response to a string
                val responseString = response.toString()

                // Use the responseString as needed
                // ...
            },
            { error ->
                // Handle error
                // ...
            }
        )
        queue.add(jsonObjectRequest)


    }
}