package com.krol.dialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.krol.dialog.enums.Gravity
import com.krol.dialog.enums.ThemeStyle
import com.krol.dialog.fragment.BottomFragment
import com.krol.dialog.fragment.CenterFragment

class Dialog {
    var mGravity = Gravity.CENTER

    fun gravity(type : Gravity) : Dialog {
        when(type) {
            Gravity.CENTER -> {
                return this
            }
            Gravity.BOTTOM -> {
                Gravity.BOTTOM
                return this
            }
        }
    }

    fun show(activity: AppCompatActivity) {
        val fragmentManager = activity.supportFragmentManager
        val newFragment = CenterFragment()
        newFragment.show(fragmentManager, "dialog")
    }

}