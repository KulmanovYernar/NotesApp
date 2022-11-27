package com.example.teamproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

import com.example.teamproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //        private lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
//            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(R.layout.activity_main)

            replaceFragment(HomeFragment.newInstance(),false)
    }

    fun replaceFragment(fragment: Fragment, isTransition:Boolean){
        val fragmentTransition = supportFragmentManager.beginTransaction()

        if(isTransition){
            fragmentTransition.setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out)
        }
        fragmentTransition.replace(R.id.frame_layout,fragment).addToBackStack(fragment.javaClass.simpleName).commit()
    }
}