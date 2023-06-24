package com.example.craftopia.categories

import android.app.DownloadManager.Request
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.android.volley.Request.Method
import com.bumptech.glide.Glide
import com.example.craftopia.ItemPage

import com.example.craftopia.R
import org.json.JSONArray
import org.json.JSONObject


class kitchen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kitchen)
        val queue = Volley.newRequestQueue(this)

        val intentData = intent.getStringExtra("key")
        val img1 = findViewById<ImageView>(R.id.imageview1)
        val img2 = findViewById<ImageView>(R.id.imageview2)
        val img3 = findViewById<ImageView>(R.id.imageview3)
        val img4 = findViewById<ImageView>(R.id.imageview4)
        val img5 = findViewById<ImageView>(R.id.imageview5)
        val img6 = findViewById<ImageView>(R.id.imageview6)
        val img7 = findViewById<ImageView>(R.id.imageview7)
        val img8 = findViewById<ImageView>(R.id.imageview8)
        val img9 = findViewById<ImageView>(R.id.imageview9)
        val img10 = findViewById<ImageView>(R.id.imageview10)

        val sellername1 = findViewById<TextView>(R.id.sellername1)
        val sellername2 = findViewById<TextView>(R.id.sellername2)
        val sellername3 = findViewById<TextView>(R.id.sellername3)
        val sellername4 = findViewById<TextView>(R.id.sellername4)
        val sellername5 = findViewById<TextView>(R.id.sellername5)
        val sellername6 = findViewById<TextView>(R.id.sellername6)
        val sellername7 = findViewById<TextView>(R.id.sellername7)
        val sellername8 = findViewById<TextView>(R.id.sellername8)
        val sellername9 = findViewById<TextView>(R.id.sellername9)
        val sellername10 = findViewById<TextView>(R.id.sellername10)

        val productname1 = findViewById<TextView>(R.id.productname1)
        val productname2 = findViewById<TextView>(R.id.productname2)
        val productname3 = findViewById<TextView>(R.id.productname3)
        val productname4 = findViewById<TextView>(R.id.productname4)
        val productname5 = findViewById<TextView>(R.id.productname5)
        val productname6 = findViewById<TextView>(R.id.productname6)
        val productname7 = findViewById<TextView>(R.id.productname7)
        val productname8 = findViewById<TextView>(R.id.productname8)
        val productname9 = findViewById<TextView>(R.id.productname9)
        val productname10 = findViewById<TextView>(R.id.productname10)

                val costprice1 = findViewById<TextView>(R.id.costprice1)
                val costprice2 = findViewById<TextView>(R.id.costprice2)
                val costprice3 = findViewById<TextView>(R.id.costprice3)
                val costprice4 = findViewById<TextView>(R.id.costprice4)
                val costprice5 = findViewById<TextView>(R.id.costprice5)
                val costprice6 = findViewById<TextView>(R.id.costprice6)
                val costprice7 = findViewById<TextView>(R.id.costprice7)
                val costprice8 = findViewById<TextView>(R.id.costprice8)
                val costprice9 = findViewById<TextView>(R.id.costprice9)
                val costprice10 = findViewById<TextView>(R.id.costprice10)

                val sellingprice1 = findViewById<TextView>(R.id.sellingprice1)
                val sellingprice2 = findViewById<TextView>(R.id.sellingprice2)
                val sellingprice3 = findViewById<TextView>(R.id.sellingprice3)
                val sellingprice4 = findViewById<TextView>(R.id.sellingprice4)
                val sellingprice5 = findViewById<TextView>(R.id.sellingprice5)
                val sellingprice6 = findViewById<TextView>(R.id.sellingprice6)
                val sellingprice7 = findViewById<TextView>(R.id.sellingprice7)
                val sellingprice8 = findViewById<TextView>(R.id.sellingprice8)
                val sellingprice9 = findViewById<TextView>(R.id.sellingprice9)
                val sellingprice10 = findViewById<TextView>(R.id.sellingprice10)

                val cardview1 = findViewById<CardView>(R.id.cardone);
                val cardview2 = findViewById<CardView>(R.id.cardtwo);
                val cardview3 = findViewById<CardView>(R.id.cardthree);
                val cardview4 = findViewById<CardView>(R.id.cardfour);
                val cardview5 = findViewById<CardView>(R.id.cardfive);
                val cardview6 = findViewById<CardView>(R.id.cardsix);
                val cardview7 = findViewById<CardView>(R.id.cardseven);
                val cardview8 = findViewById<CardView>(R.id.cardeight);
                val cardview9 = findViewById<CardView>(R.id.cardnine);
                val cardview10 = findViewById<CardView>(R.id.cardten);



// URL of the JSON endpoint
        val url = "https://res.cloudinary.com/dvuz0jdzl/raw/upload/v1687538321/Craftopia/databasejson/database_v5sprd.json"

// Create a JsonObjectRequest
        val jsonObjectRequest = JsonObjectRequest(
            com.android.volley.Request.Method.GET, url, null,
            { response ->
                // JSON object response
                val jsonString = response.toString()
                val jsonArray = response.getJSONArray(intentData);



                val jsonObject1 = jsonArray.getJSONObject(0);
                val sellernametext1 = jsonObject1.getString("sellername")
                val productnametext1 = jsonObject1.getString("productname")
                val imageurltext1 = jsonObject1.getString("imageurl")
                val productdetailstext1 = jsonObject1.getString("productdetails")
                val costpricetext1 = jsonObject1.getString("costprice")
                val sellingpricetext1 = jsonObject1.getString("sellingprice")
                val ratingtext1 = jsonObject1.getString("rating")
                sellername1.setText(sellernametext1.toString());
                productname1.setText(productnametext1.toString());
                costprice1.setText(" ₹"+costpricetext1.toString())
                sellingprice1.setText(" ₹"+sellingpricetext1.toString());
                Glide.with(this)
                    .load(imageurltext1)
                    .into(img1)


                val jsonObject2 = jsonArray.getJSONObject(1);
                val sellernametext2 = jsonObject2.getString("sellername")
                val productnametext2 = jsonObject2.getString("productname")
                val imageurltext2 = jsonObject2.getString("imageurl")
                val productdetailstext2 = jsonObject2.getString("productdetails")
                val costpricetext2 = jsonObject2.getString("costprice")
                val sellingpricetext2 = jsonObject2.getString("sellingprice")
                val ratingtext2 = jsonObject2.getString("rating")
                sellername2.setText(sellernametext2.toString());
                productname2.setText(productnametext2.toString());
                costprice2.setText(" ₹"+costpricetext2.toString())
                sellingprice2.setText(" ₹"+sellingpricetext2.toString());
                Glide.with(this)
                    .load(imageurltext2)
                    .into(img2)

                val jsonObject3 = jsonArray.getJSONObject(2);
                val sellernametext3 = jsonObject3.getString("sellername")
                val productnametext3 = jsonObject3.getString("productname")
                val imageurltext3 = jsonObject3.getString("imageurl")
                val productdetailstext3 = jsonObject3.getString("productdetails")
                val costpricetext3 = jsonObject3.getString("costprice")
                val sellingpricetext3 = jsonObject3.getString("sellingprice")
                val ratingtext3 = jsonObject3.getString("rating")
                sellername3.setText(sellernametext3.toString());
                productname3.setText(productnametext3.toString());
                costprice3.setText(" ₹"+costpricetext3.toString())
                sellingprice3.setText(" ₹"+sellingpricetext3.toString());
                Glide.with(this)
                    .load(imageurltext3)
                    .into(img3)

                val jsonObject4 = jsonArray.getJSONObject(3);
                val sellernametext4 = jsonObject4.getString("sellername")
                val productnametext4 = jsonObject4.getString("productname")
                val imageurltext4 = jsonObject4.getString("imageurl")
                val productdetailstext4 = jsonObject4.getString("productdetails")
                val costpricetext4 = jsonObject4.getString("costprice")
                val sellingpricetext4 = jsonObject4.getString("sellingprice")
                val ratingtext4 = jsonObject4.getString("rating")
                sellername4.setText(sellernametext4.toString());
                productname4.setText(productnametext4.toString());
                costprice4.setText(" ₹"+costpricetext4.toString())
                sellingprice4.setText(" ₹"+sellingpricetext4.toString());
                Glide.with(this)
                    .load(imageurltext4)
                    .into(img4)

                val jsonObject5 = jsonArray.getJSONObject(4);
                val sellernametext5 = jsonObject5.getString("sellername")
                val productnametext5 = jsonObject5.getString("productname")
                val imageurltext5 = jsonObject5.getString("imageurl")
                val productdetailstext5 = jsonObject5.getString("productdetails")
                val costpricetext5 = jsonObject5.getString("costprice")
                val sellingpricetext5 = jsonObject5.getString("sellingprice")
                val ratingtext5 = jsonObject5.getString("rating")
                sellername5.setText(sellernametext5.toString());
                productname5.setText(productnametext5.toString());
                costprice5.setText(" ₹"+costpricetext5.toString())
                sellingprice5.setText(" ₹"+sellingpricetext5.toString());
                Glide.with(this)
                    .load(imageurltext5)
                    .into(img5)

                val jsonObject6 = jsonArray.getJSONObject(5);
                val sellernametext6 = jsonObject6.getString("sellername")
                val productnametext6 = jsonObject6.getString("productname")
                val imageurltext6 = jsonObject6.getString("imageurl")
                val productdetailstext6 = jsonObject6.getString("productdetails")
                val costpricetext6 = jsonObject6.getString("costprice")
                val sellingpricetext6 = jsonObject6.getString("sellingprice")
                val ratingtext6 = jsonObject6.getString("rating")
                sellername6.setText(sellernametext6.toString());
                productname6.setText(productnametext6.toString());
                costprice6.setText(" ₹"+costpricetext6.toString())
                sellingprice6.setText(" ₹"+sellingpricetext6.toString());
                Glide.with(this)
                    .load(imageurltext6)
                    .into(img6)

                val jsonObject7 = jsonArray.getJSONObject(6);
                val sellernametext7 = jsonObject7.getString("sellername")
                val productnametext7 = jsonObject7.getString("productname")
                val imageurltext7 = jsonObject7.getString("imageurl")
                val productdetailstext7 = jsonObject7.getString("productdetails")
                val costpricetext7 = jsonObject7.getString("costprice")
                val sellingpricetext7 = jsonObject7.getString("sellingprice")
                val ratingtext7 = jsonObject7.getString("rating")
                sellername7.setText(sellernametext7.toString());
                productname7.setText(productnametext7.toString());
                costprice7.setText(" ₹"+costpricetext7.toString())
                sellingprice7.setText(" ₹"+sellingpricetext7.toString());
                Glide.with(this)
                    .load(imageurltext7)
                    .into(img7)

                val jsonObject8 = jsonArray.getJSONObject(7);
                val sellernametext8 = jsonObject8.getString("sellername")
                val productnametext8 = jsonObject8.getString("productname")
                val imageurltext8 = jsonObject8.getString("imageurl")
                val productdetailstext8 = jsonObject8.getString("productdetails")
                val costpricetext8 = jsonObject8.getString("costprice")
                val sellingpricetext8 = jsonObject8.getString("sellingprice")
                val ratingtext8 = jsonObject8.getString("rating")
                sellername8.setText(sellernametext8.toString());
                productname8.setText(productnametext8.toString());
                costprice8.setText(" ₹"+costpricetext8.toString())
                sellingprice8.setText(" ₹"+sellingpricetext8.toString());
                Glide.with(this)
                    .load(imageurltext8)
                    .into(img8)

                val jsonObject9 = jsonArray.getJSONObject(8);
                val sellernametext9 = jsonObject9.getString("sellername")
                val productnametext9 = jsonObject9.getString("productname")
                val imageurltext9 = jsonObject9.getString("imageurl")
                val productdetailstext9 = jsonObject9.getString("productdetails")
                val costpricetext9 = jsonObject9.getString("costprice")
                val sellingpricetext9 = jsonObject9.getString("sellingprice")
                val ratingtext9 = jsonObject9.getString("rating")
                sellername9.setText(sellernametext9.toString());
                productname9.setText(productnametext9.toString());
                costprice9.setText(" ₹"+costpricetext9.toString())
                sellingprice9.setText(" ₹"+sellingpricetext9.toString());
                Glide.with(this)
                    .load(imageurltext9)
                    .into(img9)

                val jsonObject10 = jsonArray.getJSONObject(9);
                val sellernametext10 = jsonObject10.getString("sellername")
                val productnametext10 = jsonObject10.getString("productname")
                val imageurltext10 = jsonObject10.getString("imageurl")
                val productdetailstext10 = jsonObject10.getString("productdetails")
                val costpricetext10 = jsonObject10.getString("costprice")
                val sellingpricetext10 = jsonObject10.getString("sellingprice")
                val ratingtext10 = jsonObject10.getString("rating")
                sellername10.setText(sellernametext10.toString());
                productname10.setText(productnametext10.toString());
                costprice10.setText(" ₹"+costpricetext10.toString())
                sellingprice10.setText(" ₹"+sellingpricetext10.toString());
                Glide.with(this)
                    .load(imageurltext10)
                    .into(img10)




//                sellername3.setText(sellername.toString());
//                productname3.setText(productname.toString());
//                sellername4.setText(sellername.toString());
//                productname4.setText(productname.toString());
//                sellername5.setText(sellername.toString());
//                productname5.setText(productname.toString());
//                sellername6.setText(sellername.toString());
//                productname6.setText(productname.toString());
//                sellername7.setText(sellername.toString());
//                productname7.setText(productname.toString());
//                sellername8.setText(sellername.toString());
//                productname8.setText(productname.toString());
//                sellername9.setText(sellername.toString());
//                productname9.setText(productname.toString());
//                sellername10.setText(sellername.toString());
//                productname10.setText(productname.toString());






//                val jsonObject4 = jsonArray.getJSONObject(3);
//                val jsonObject5 = jsonArray.getJSONObject(4);
//                val jsonObject6 = jsonArray.getJSONObject(5);
//                val jsonObject7 = jsonArray.getJSONObject(6);
//                val jsonObject8 = jsonArray.getJSONObject(7);
//                val jsonObject9 = jsonArray.getJSONObject(8);
//                val jsonObject10 = jsonArray.getJSONObject(9);
                // Use the JSON string as needed
                // ...


                // Convert the JSON object response to a string


                // Use the responseString as needed
                // ...
            },
            { error ->
                // Handle error
                // ...
            }
        )

// Add the request to the RequestQueue
        queue.add(jsonObjectRequest)


        cardview1.setOnClickListener {
            val intent = Intent(this, ItemPage::class.java)
            intent.putExtra("category", intentData)
            intent.putExtra("index", 0)
            startActivity(intent)
        }
        cardview2.setOnClickListener {
            val intent = Intent(this, ItemPage::class.java)
            intent.putExtra("category", intentData)
            intent.putExtra("index", 1)
            startActivity(intent)
        }
  cardview3.setOnClickListener {
            val intent = Intent(this, ItemPage::class.java)
            intent.putExtra("category", intentData)
            intent.putExtra("index", 2)
            startActivity(intent)
        }
        cardview4.setOnClickListener {
            val intent = Intent(this, ItemPage::class.java)
            intent.putExtra("category", intentData)
            intent.putExtra("index", 3)
            startActivity(intent)
        }
        cardview5.setOnClickListener {
            val intent = Intent(this, ItemPage::class.java)
            intent.putExtra("category", intentData)
            intent.putExtra("index", 4)
            startActivity(intent)
        }
        cardview6.setOnClickListener {
            val intent = Intent(this, ItemPage::class.java)
            intent.putExtra("category", intentData)
            intent.putExtra("index", 5)
            startActivity(intent)
        }
  cardview7.setOnClickListener {
            val intent = Intent(this, ItemPage::class.java)
            intent.putExtra("category", intentData)
            intent.putExtra("index", 6)
            startActivity(intent)
        }
        cardview8.setOnClickListener {
            val intent = Intent(this, ItemPage::class.java)
            intent.putExtra("category", intentData)
            intent.putExtra("index", 7)
            startActivity(intent)
        }
cardview9.setOnClickListener {
            val intent = Intent(this, ItemPage::class.java)
            intent.putExtra("category", intentData)
            intent.putExtra("index", 8)
            startActivity(intent)
        }
        cardview10.setOnClickListener {
            val intent = Intent(this, ItemPage::class.java)
            intent.putExtra("category", intentData)
            intent.putExtra("index", 9)
            startActivity(intent)
        }


    }
}


