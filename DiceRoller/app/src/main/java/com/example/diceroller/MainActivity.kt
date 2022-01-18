package com.example.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
//            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
//            toast.show()
            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "6"
            rollDice()
        }
    }

    /**
     * tung xúc xắc và hiển thị trên màn hình
     */
    private fun rollDice() {
        //tạo một obj với 6 mặt
        val dice = Dice(6)
        val diceRoll = dice.roll()
        //cập nhật kết quả sau khi diceroll lên màn hình
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

}

/**
 *
 */
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}