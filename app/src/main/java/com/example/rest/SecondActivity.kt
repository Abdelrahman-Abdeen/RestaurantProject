package com.example.rest

import RestaurantDatabaseHelper
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")


    var numof1 :Int = 0
    var numof2 :Int =0
    var numof3 :Int=0
    var numof4 : Int=0
    var numof5 :Int = 0
    var numof6 :Int =0
    var numof7 :Int=0
    var numof8 : Int=0
    var numof9: Int =0

    var numm1 =0
    var numm2 =0
    var numm3 =0
    var numm4 =0
    var numm5 =0
    var numm6 =0
    var numm7 =0
    var numm8 =0
    var numm9 =0
    var total :Double=0.0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        //val bundle: Bundle? = intent.extras


        var price :Double=0.0
        var priceTxt: TextView = findViewById(R.id.price)

        val img1 :ImageView = findViewById(R.id.imageView)
        val img2 :ImageView = findViewById(R.id.imageView2)
        val img3 : ImageView =findViewById(R.id.imageView3)

        val price1:TextView =findViewById(R.id.price1)
        val price2:TextView =findViewById(R.id.price2)
        val price3:TextView = findViewById(R.id.price3)

        val type = intent.getStringExtra("key")
        total = intent.getDoubleExtra("price",0.0)


         numm1 =intent.getIntExtra("numm1",0)
         numm2 =intent.getIntExtra("numm2",0)
         numm3 =intent.getIntExtra("numm3",0)
         numm4 =intent.getIntExtra("numm4",0)
         numm5 =intent.getIntExtra("numm5",0)
         numm6 =intent.getIntExtra("numm6",0)
         numm7 =intent.getIntExtra("numm7",0)
         numm8 =intent.getIntExtra("numm8",0)
         numm9 =intent.getIntExtra("numm9",0)

        priceTxt.text=total.toString()

        if (type == "burger"){
            img1.setImageResource(R.drawable.burger1)
            img2.setImageResource(R.drawable.burger1)
            img3.setImageResource(R.drawable.burger1)

            price1.text="2.00"
            price2.text="2.50"
            price3.text="3.00"

            val text1 :TextView = findViewById(R.id.textView2)
            text1.text="Chicken Burger"
            val text2 : TextView = findViewById(R.id.textView6)
            text2.text = "Beef Burger"
            val text3 : TextView =findViewById(R.id.textView4)
            text3.text ="Smocked Burger"
            val add1 : ImageButton = findViewById(R.id.increment1)
            val num1 : TextView = findViewById(R.id.num1)
            num1.text=numm1.toString()
            var sum1 :Int = num1.text.toString().toInt()


            add1.setOnClickListener {
                sum1= sum1+1
                num1.text = sum1.toString()
                total=total+2.0
                priceTxt.text = total.toString()
                numof1++
                numm1++

                Toast.makeText(this,"Added to basket",Toast.LENGTH_SHORT).show()
            }
            val sub1 : ImageButton = findViewById(R.id.decrement1)

            sub1.setOnClickListener {
                if(sum1 !=0){
                    sum1 = sum1 - 1;
                    num1.text = sum1.toString()
                    total=total-2.0
                    priceTxt.text = total.toString()

                    numof1--
                    numm1--
                    Toast.makeText(this,"item removed from basket",Toast.LENGTH_SHORT).show()
                }}

            val add2 : ImageButton = findViewById(R.id.increment2)
            val num2: TextView = findViewById(R.id.num2)
            val sub2 : ImageButton = findViewById(R.id.decrement2)
            num2.text=numm2.toString()
            var sum2:Int = num2.text.toString().toInt()

            add2.setOnClickListener {
                sum2=sum2+1
                num2.text = sum2.toString()
                total=total+2.5
                priceTxt.text = total.toString()
                numof2++
                numm2++
                Toast.makeText(this,"Added to basket",Toast.LENGTH_SHORT).show()
            }
            sub2.setOnClickListener {
                if(sum2!=0){
                    sum2=sum2-1
                    num2.text=sum2.toString()
                    total=total-2.5
                    priceTxt.text = total.toString()
                    numof2--
                    numm2--
                    Toast.makeText(this,"item removed from basket",Toast.LENGTH_SHORT).show()
                }
            }

            val add3 : ImageButton = findViewById(R.id.increment3)
            val num3: TextView = findViewById(R.id.num3)
            val sub3 : ImageButton = findViewById(R.id.decrement3)
            num3.text=numm3.toString()
            var sum3:Int = num3.text.toString().toInt()

            add3.setOnClickListener {
                sum3=sum3+1
                num3.text = sum3.toString()
                total=total+3.0
                priceTxt.text = total.toString()
                numof3++
                numm3++
                Toast.makeText(this,"Added to basket",Toast.LENGTH_SHORT).show()
            }
            sub3.setOnClickListener {
                if(sum3!=0){
                    sum3=sum3-1
                    num3.text=sum3.toString()
                    total=total-3.0
                    priceTxt.text = total.toString()
                    numof3--
                    numm3--
                    Toast.makeText(this,"item removed from basket",Toast.LENGTH_SHORT).show()
                }
            }
        }
        // myBtn.text="Chicken Burger"
            if (type == "shawerma") {
                //myBtn.text = "Shawerma Super"
                img1.setImageResource(R.drawable.shawerma1)
                img2.setImageResource(R.drawable.shawerma1)
                img3.setImageResource(R.drawable.shawerma1)
                price1.text="1.75"
                price2.text="2.50"
                price3.text="3.50"



                val add1: ImageButton = findViewById(R.id.increment1)
                val num1: TextView = findViewById(R.id.num1)

                num1.text=numm4.toString()
                var sum1: Int = num1.text.toString().toInt()

                add1.setOnClickListener {
                    sum1 = sum1 + 1
                    num1.text = sum1.toString()
                    total = total + 1.75
                    priceTxt.text = total.toString()
                    numof4++
                    numm4++

                    Toast.makeText(this, "Added to basket", Toast.LENGTH_SHORT).show()
                }
                val sub1: ImageButton = findViewById(R.id.decrement1)

                sub1.setOnClickListener {
                    if (sum1 != 0) {
                        sum1 = sum1 - 1;
                        num1.text = sum1.toString()
                        total = total - 1.75
                        priceTxt.text = total.toString()
                        numof4--
                        numm4--

                        Toast.makeText(this, "item removed from basket", Toast.LENGTH_SHORT).show()
                    }
                }

                val add2: ImageButton = findViewById(R.id.increment2)
                val num2: TextView = findViewById(R.id.num2)
                val sub2: ImageButton = findViewById(R.id.decrement2)
                num2.text=numm5.toString()
                var sum2: Int = num2.text.toString().toInt()

                add2.setOnClickListener {
                    sum2 = sum2 + 1
                    num2.text = sum2.toString()
                    total = total + 2.5
                    priceTxt.text = total.toString()
                    numof5++
                    numm5++
                    Toast.makeText(this, "Added to basket", Toast.LENGTH_SHORT).show()
                }
                sub2.setOnClickListener {
                    if (sum2 != 0) {
                        sum2 = sum2 - 1
                        num2.text = sum2.toString()
                        total = total - 2.5
                        priceTxt.text = total.toString()
                        numof5--
                        numm5--
                        Toast.makeText(this, "item removed from basket", Toast.LENGTH_SHORT).show()
                    }
                }

                val add3: ImageButton = findViewById(R.id.increment3)
                val num3: TextView = findViewById(R.id.num3)
                val sub3: ImageButton = findViewById(R.id.decrement3)
                num3.text=numm6.toString()
                var sum3: Int = num3.text.toString().toInt()

                add3.setOnClickListener {
                    sum3 = sum3 + 1
                    num3.text = sum3.toString()
                    total = total + 3.5
                    priceTxt.text = total.toString()
                    numof6++
                    numm6++
                    Toast.makeText(this, "Added to basket", Toast.LENGTH_SHORT).show()
                }
                sub3.setOnClickListener {
                    if (sum3 != 0) {
                        sum3 = sum3 - 1
                        num3.text = sum3.toString()
                        total = total - 3.5
                        priceTxt.text = total.toString()
                        numof6--
                        numm6--
                        Toast.makeText(this, "item removed from basket", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        if (type == "pizza"){

            img1.setImageResource(R.drawable.pizza1)
            img2.setImageResource(R.drawable.pizza1)
            img3.setImageResource(R.drawable.pizza1)




            price1.text="2.00"
            price2.text="2.00"
            price3.text="2.50"

            val text1 :TextView = findViewById(R.id.textView2)
            text1.text="Matgareta Pizza"
            val text2 : TextView = findViewById(R.id.textView6)
            text2.text = "Barbeque Pizza"
            val text3 : TextView =findViewById(R.id.textView4)
            text3.text ="Italian Pizaa"
            val add1 : ImageButton = findViewById(R.id.increment1)
            val num1 : TextView = findViewById(R.id.num1)
            num1.text=numm7.toString()
            var sum1 :Int = num1.text.toString().toInt()

            add1.setOnClickListener {
                sum1= sum1+1
                num1.text = sum1.toString()
                total=total+2.0
                priceTxt.text = total.toString()
                numof7++
                numm7++

                Toast.makeText(this,"Added to basket",Toast.LENGTH_SHORT).show()

            }
            val sub1 : ImageButton = findViewById(R.id.decrement1)

            sub1.setOnClickListener {
                if(sum1 !=0){
                    sum1 = sum1 - 1;
                    num1.text = sum1.toString()
                    total=total-2.0
                    priceTxt.text = total.toString()
                    numof7--
                    numm7--

                    Toast.makeText(this,"item removed from basket",Toast.LENGTH_SHORT).show()
                }}

            val add2 : ImageButton = findViewById(R.id.increment2)
            val num2: TextView = findViewById(R.id.num2)
            val sub2 : ImageButton = findViewById(R.id.decrement2)
            num2.text=numm8.toString()
            var sum2:Int = num2.text.toString().toInt()

            add2.setOnClickListener {
                sum2=sum2+1
                num2.text = sum2.toString()
                total=total+2.0
                priceTxt.text = total.toString()
                numof8++
                numm8++

                Toast.makeText(this,"Added to basket",Toast.LENGTH_SHORT).show()
            }
            sub2.setOnClickListener {
                if(sum2!=0){
                    sum2=sum2-1
                    num2.text=sum2.toString()
                    total=total-2.0
                    priceTxt.text = total.toString()
                    numof8--
                    numm8--
                    Toast.makeText(this,"item removed from basket",Toast.LENGTH_SHORT).show()
                }
            }

            val add3 : ImageButton = findViewById(R.id.increment3)
            val num3: TextView = findViewById(R.id.num3)
            val sub3 : ImageButton = findViewById(R.id.decrement3)
            num3.text=numm9.toString()
            var sum3:Int = num3.text.toString().toInt()

            add3.setOnClickListener {
                sum3=sum3+1
                num3.text = sum3.toString()
                total=total+2.5
                priceTxt.text = total.toString()
                numof9++
                numm9++
                Toast.makeText(this,"Added to basket",Toast.LENGTH_SHORT).show()
            }
            sub3.setOnClickListener {
                if(sum3!=0){
                    sum3=sum3-1
                    num3.text=sum3.toString()
                    total=total-2.5
                    priceTxt.text = total.toString()
                    numof9--
                    numm9--
                    Toast.makeText(this,"item removed from basket",Toast.LENGTH_SHORT).show()
                }
            }
        }
        // myBtn.text = "margareta"
        val back : Button = findViewById(R.id.backBtn)
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("price", total)
            intent.putExtra("num1",numm1)
            intent.putExtra("num2",numm2)
            intent.putExtra("num3",numm3)
            intent.putExtra("num4",numm4)
            intent.putExtra("num5",numm5)
            intent.putExtra("num6",numm6)
            intent.putExtra("num7",numm7)
            intent.putExtra("num8",numm8)
            intent.putExtra("num9",numm9)

            startActivity(intent)
            finish()
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
            R.id.item0-> {val dialog_var = CustomDialog(numm1,numm2,numm3,numm4,numm5,numm6,numm7,numm8,numm9,total)
                dialog_var.show(supportFragmentManager,"Custom Dialog")}
            R.id.menu-> {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("price", total)
                intent.putExtra("num1",numm1)
                intent.putExtra("num2",numm2)
                intent.putExtra("num3",numm3)
                intent.putExtra("num4",numm4)
                intent.putExtra("num5",numm5)
                intent.putExtra("num6",numm6)
                intent.putExtra("num7",numm7)
                intent.putExtra("num8",numm8)
                intent.putExtra("num9",numm9)

                startActivity(intent)
                finish()
            }
        }
        return true
    }
}