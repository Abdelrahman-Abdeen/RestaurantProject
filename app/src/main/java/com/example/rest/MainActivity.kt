package com.example.rest

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private val CALL_PERMISSION_REQUEST_CODE = 123

    @SuppressLint("MissingInflatedId")

    var numof1 =0
    var  numof2 = 0
    var  numof3=  0
    var numof4= 0
    var numof5= 0
    var  numof6= 0
    var  numof7= 0
    var  numof8= 0
    var  numof9= 0
    var total :Double=0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        intent.putExtra("recordId", 123) // Replace 123 with the actual record ID


        val Burger: Button = findViewById(R.id.button1)
        val Pizza: Button = findViewById(R.id.button2)
        val Shawerma: Button = findViewById(R.id.button3)
        val totalTxt :TextView = findViewById(R.id.total)
         total = intent.getDoubleExtra("price",0.0)
        totalTxt.text= total.toString()

        numof1 =intent.getIntExtra("num1",0)
          numof2 = intent.getIntExtra("num2",0)
         numof3=  intent.getIntExtra("num3",0)
         numof4= intent.getIntExtra("num4",0)
         numof5= intent.getIntExtra("num5",0)
         numof6= intent.getIntExtra("num6",0)
         numof7= intent.getIntExtra("num7",0)
          numof8= intent.getIntExtra("num8",0)
          numof9= intent.getIntExtra("num9",0)
        var type: String = ""


        Shawerma.setOnClickListener {
            type = "shawerma"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", type)
            intent.putExtra("price", total)
            intent.putExtra("numm1",numof1)
            intent.putExtra("numm2",numof2)
            intent.putExtra("numm3",numof3)
            intent.putExtra("numm4",numof4)
            intent.putExtra("numm5",numof5)
            intent.putExtra("numm6",numof6)
            intent.putExtra("numm7",numof7)
            intent.putExtra("numm8",numof8)
            intent.putExtra("numm9",numof9)
            startActivity(intent)

        }
        Burger.setOnClickListener {
            type = "burger"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", type)
            intent.putExtra("price", total)
            intent.putExtra("numm1",numof1)
            intent.putExtra("numm2",numof2)
            intent.putExtra("numm3",numof3)
            intent.putExtra("numm4",numof4)
            intent.putExtra("numm5",numof5)
            intent.putExtra("numm6",numof6)
            intent.putExtra("numm7",numof7)
            intent.putExtra("numm8",numof8)
            intent.putExtra("numm9",numof9)



            startActivity(intent)

        }
        Pizza.setOnClickListener {
            type = "pizza"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", type)
            intent.putExtra("price", total)
            intent.putExtra("numm1",numof1)
            intent.putExtra("numm2",numof2)
            intent.putExtra("numm3",numof3)
            intent.putExtra("numm4",numof4)
            intent.putExtra("numm5",numof5)
            intent.putExtra("numm6",numof6)
            intent.putExtra("numm7",numof7)
            intent.putExtra("numm8",numof8)
            intent.putExtra("numm9",numof9)
            startActivity(intent)

        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        val inflater=menuInflater
        inflater.inflate(R.menu.first_menu,menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.contact -> {


                val phoneNumber = "0799439774"
                val dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialIntent)

            }

            R.id.item0-> {
                val dialog_var = CustomDialog(
                    numof1,
                    numof2,
                    numof3,
                    numof4,
                    numof5,
                    numof6,
                    numof7,
                    numof8,
                    numof9,total
                )

                dialog_var.show(supportFragmentManager, "Custom Dialog")
            }
            R.id.location-> {
                val mapsLink = "https://goo.gl/maps/Gi5WRL8aKeyvf6mKA"
                val mapIntentUri = Uri.parse(mapsLink)
                val mapIntent = Intent(Intent.ACTION_VIEW, mapIntentUri)
                mapIntent.setPackage("com.google.android.apps.maps") // Use Google Maps app
                startActivity(mapIntent)
            }
        }
        return true
    }



}