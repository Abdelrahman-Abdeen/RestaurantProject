package com.example.rest

import RestaurantDatabaseHelper
import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import java.util.ArrayList

class CustomDialog(private var numof1:Int, private val numof2:Int, private val numof3:Int, private val numof4:Int, private val numof5:Int, private val numof6:Int, private val numof7:Int, private val numof8:Int, private val numof9:Int , private var total:Double) :DialogFragment(R.layout.dialog_custom) {

 private lateinit var dbHelper: RestaurantDatabaseHelper

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val finalPrice : TextView = view.findViewById(R.id.finalPrice)

        finalPrice.text = total.toString()

       val order1 : TextView = view.findViewById(R.id.order1)
        val order2 : TextView = view.findViewById(R.id.order2)
        val order3 : TextView = view.findViewById(R.id.order3)
        val order4 : TextView = view.findViewById(R.id.order4)
        val order5 : TextView = view.findViewById(R.id.order5)
        val order6 : TextView = view.findViewById(R.id.order6)
        val order7 : TextView = view.findViewById(R.id.order7)
        val order8 : TextView = view.findViewById(R.id.order8)
        val order9 : TextView = view.findViewById(R.id.order9)
        val orders = arrayOf(order1,order2,order3,order4,order5,order6,order7,order8,order9)

     for(orderTextView in orders){
      orderTextView.visibility = View.GONE
     }
     if (numof1 != 0) {
      orders[0].text = "Chicken Burger               X$numof1               " + (2.00 * numof1)
      orders[0].visibility = View.VISIBLE
     }
     if (numof2 != 0) {
      orders[1].text = "Beef Burger                X$numof2               " + (2.50 * numof2)
      orders[1].visibility = View.VISIBLE

     }
     if (numof3 != 0) {
      orders[2].text = "Smocked Burger                X$numof3               " + (3.00 * numof3)
      orders[2].visibility = View.VISIBLE

     }
     if (numof4 != 0) {
      orders[3].text = "Shawerma single               X$numof4              " + (1.75 * numof4)
      orders[3].visibility = View.VISIBLE

     }
     if (numof5 != 0) {
      orders[4].text = "Shawerma super                X$numof5               " + (2.50 * numof5)
      orders[4].visibility = View.VISIBLE

     }
     if (numof6 != 0) {
      orders[5].text = "Shawerma double                X$numof6               " + (3.50 * numof6)
      orders[5].visibility = View.VISIBLE

     }
     if (numof7 != 0) {
      orders[6].text = "Margareta Pizza                X$numof7             " + (2.00 * numof7)
      orders[6].visibility = View.VISIBLE

     }
     if (numof8 != 0) {
      orders[7].text = "Barbeque Pizza                X$numof8             " + (2.00 * numof8)
      orders[7].visibility = View.VISIBLE

     }
     if (numof9 != 0) {
      orders[8].text = "Italian Pizza               X$numof9             " + (2.50 * numof9)
      orders[8].visibility = View.VISIBLE

     }

        val delivery : CheckBox = view.findViewById(R.id.delivery)
        delivery.setOnCheckedChangeListener { _, checkedId ->
            if (delivery.isChecked) {
                total++
                finalPrice.text = total.toString()
            }
            if(!delivery.isChecked){
                total--
                finalPrice.text=total.toString()
            }
        }
     val cancelbt: Button = view.findViewById(R.id.cancelBT)
        val submitbt : Button = view.findViewById(R.id.submitBT)
        cancelbt.setOnClickListener {
            dismiss()
        }
        submitbt.setOnClickListener {
         if(numof1!=0)
             insertOrder("Chicken Burger", numof1 , 2.0)
         if(numof2!=0)
              insertOrder("Beef Burger", numof2 , 2.5)
         if(numof3!=0)
              insertOrder("Smocked Burger", numof3 , 3.0)
         if(numof4!=0)
              insertOrder("Shawerma Single", numof4 , 1.75)
         if(numof5!=0)
              insertOrder("Shawerma Super", numof5 , 2.5)
         if(numof6!=0)
              insertOrder("Shawerma Double", numof6 , 3.5)
         if(numof7!=0)
              insertOrder("Margareta Pizza", numof7 , 2.0)
         if(numof8!=0)
              insertOrder("Barbeque Pizza", numof8 , 2.0)
         if(numof9!=0)
            insertOrder("Italian Pizza", numof9 , 2.5)




         Toast.makeText(context,"Order placed",Toast.LENGTH_SHORT).show()
            dismiss()
        }

    }


 @SuppressLint("SuspiciousIndentation")
 private fun insertOrder(itemName: String, quantity: Int, price: Double) {
  dbHelper = RestaurantDatabaseHelper(requireContext())
  val db = dbHelper.writableDatabase

  val values = ContentValues().apply {
   put(RestaurantContract.MenuItemEntry.COLUMN_ITEM_NAME, itemName)
   put(RestaurantContract.MenuItemEntry.COLUMN_QUANTITY, quantity)
   put(RestaurantContract.MenuItemEntry.COLUMN_PRICE, price)
  }

  val newRowId = db.insert(RestaurantContract.MenuItemEntry.TABLE_NAME, null, values)
    Toast.makeText(requireContext(),"inserted successfully",Toast.LENGTH_SHORT).show()
 }

  







}