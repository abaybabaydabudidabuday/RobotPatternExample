package kz.beeline.testapp.robots

import kz.beeline.testapp.R
import kz.beeline.testapp.interfaces.BaseTestRobot

class MainRobot: BaseTestRobot(){

    fun setName(name: String) = fillEditText(R.id.nameET,name)

    fun setPassword (pass: String ) = fillEditText(R.id.pswET,pass)

    fun clickSubmit () = clickButton(R.id.btnSubmit)

    fun matchErrorText(err: String) = matchText(textView(R.id.textView2), err)


}