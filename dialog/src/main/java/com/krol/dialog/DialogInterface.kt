package com.krol.dialog

/**
 * Created by DevHyeon on 2021.04.17
 * Interface definitions required for the dialogue
 * 1. Show.
 * 2. Dismisses.
 * 3. Cancel.
 * */
interface DialogInterface {
    val POSITIVE : Int get() = 0
    val NEGATIVE : Int get() = -1

    abstract fun show()

    abstract fun cancel()

    abstract fun dismiss()
}