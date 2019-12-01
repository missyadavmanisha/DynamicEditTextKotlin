package net.geeksforgeeks.dynamicedittextkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editLinearLayout = findViewById<LinearLayout>(R.id.editTextLinearLayout)
        val buttonShow = findViewById<Button>(R.id.buttonShow)

        // Create EditText
        val editText = EditText(this)
        editText.setHint("Enter something")
        editText.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        editText.setPadding(20, 20, 20, 20)

        // Add EditText to LinearLayout
        editLinearLayout?.addView(editText)

        buttonShow?.setOnClickListener { Toast.makeText(this@MainActivity, editText.text, Toast.LENGTH_LONG).show() }
    }
}
