package com.wooyj.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 *
 * Created on 2022/09/23
 *
 * navigation 된 화면을 보여주는 activity.
 *
 * @author wooyj
 *
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}