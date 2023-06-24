package com.example.craftopia.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.craftopia.R
import com.example.craftopia.categories.Trending
import com.example.craftopia.categories.kitchen

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val kitchenbutton = view.findViewById(R.id.kitchen) as ImageView
        val homedecorbutton = view.findViewById(R.id.homedecor) as ImageView
        val furniturebutton = view.findViewById(R.id.furniture) as ImageView
        val fashionbutton = view.findViewById(R.id.fashion) as ImageView
        val freelancebutton = view.findViewById(R.id.freelance) as ImageView
        val dailyneedsbutton = view.findViewById(R.id.dailyneeds) as ImageView
        val stationerybutton = view.findViewById(R.id.stationery) as ImageView
        val toysandgames = view.findViewById(R.id.toyandgames) as ImageView
        val trendingbutton = view.findViewById(R.id.trending) as ImageView

        kitchenbutton.setOnClickListener {
            val intent = Intent(activity, kitchen::class.java)
            intent.putExtra("key", "kitchen")
            startActivity(intent)

        }
        homedecorbutton.setOnClickListener {
            val intent = Intent(activity, kitchen::class.java)
            intent.putExtra("key", "homedecor")
            startActivity(intent)
        }
         furniturebutton.setOnClickListener {
            val intent = Intent(activity, kitchen::class.java)
            intent.putExtra("key", "furniture")
            startActivity(intent)
        }
         fashionbutton.setOnClickListener {
            val intent = Intent(activity, kitchen::class.java)
            intent.putExtra("key", "fashion")
            startActivity(intent)
        }

         dailyneedsbutton.setOnClickListener {
            val intent = Intent(activity, kitchen::class.java)
            intent.putExtra("key", "dailyneeds")
            startActivity(intent)
        }
        stationerybutton.setOnClickListener {
            val intent = Intent(activity, kitchen::class.java)
            intent.putExtra("key", "stationery")
            startActivity(intent)
        }
        toysandgames.setOnClickListener {
            val intent = Intent(activity, kitchen::class.java)
            intent.putExtra("key", "toysandgames")
            startActivity(intent)
        }
        trendingbutton.setOnClickListener {
            val intent = Intent(activity, Trending::class.java)
            startActivity(intent)
        }


        // Inflate the layout for this fragment
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}