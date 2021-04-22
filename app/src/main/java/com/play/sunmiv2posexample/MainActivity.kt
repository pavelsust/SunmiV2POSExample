package com.play.sunmiv2posexample

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.play.sunmiv2posexample.utils.SunmiPrintHelper

class MainActivity : AppCompatActivity() {


    var printer = SunmiPrintHelper.getInstance()

    lateinit var button : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        button = findViewById(R.id.id_button)
        button.setOnClickListener {
            print();
        }

    }

    fun print(){
        try {
            printer.setAlign(1)
            printer.printText("Hello ", 40.0F, false, false)
            printer.feedPaper()
            Log.d("PRINT" , "${SunmiPrintHelper.getInstance().isLabelMode}")
        }catch (e: Exception){
            e.toString()
        }
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}