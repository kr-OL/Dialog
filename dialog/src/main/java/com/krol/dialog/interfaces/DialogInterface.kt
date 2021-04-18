package com.krol.dialog.interfaces

/**
 * Created by DevHyeon on 2021.04.17
 * Interface definitions required for the dialogue
 * 1. Show.
 * 2. Dismisses.
 * 3. Cancel.
 * */
interface DialogInterface {
    abstract fun show()

    abstract fun cancel()

    abstract fun dismiss()
}