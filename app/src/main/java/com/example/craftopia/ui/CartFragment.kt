package com.example.craftopia.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.craftopia.Cart
import com.example.craftopia.R
import com.google.firebase.firestore.FirebaseFirestore

class CartFragment : Fragment() {

    private var orderList = ArrayList<Cart>()
    private val mFirestore = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getOrderList()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cart, container, false)
    }

    private fun getOrderList(){
        mFirestore.collection("CART_ITEMS")
            .get()
            .addOnSuccessListener { document->
                Log.e(activity?.javaClass?.simpleName,document.documents.toString())
                orderList = ArrayList()

                for(i in document.documents)
                {
                    val cartItem = i.toObject(Cart::class.java)!!

//                    cartItem.id = i.id
                    orderList.add(cartItem)
                }
                Log.e("@@@@",orderList.toString())

            }
            .addOnFailureListener { e->
                Toast.makeText(context,e.toString(),Toast.LENGTH_SHORT).show()
            }
    }
}