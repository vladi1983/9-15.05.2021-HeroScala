package com.naya.pro.quoter

import org.fluttercode.datafactory.impl.DataFactory

object RandomQuoter extends Quoter {

  var messageRandom = new DataFactory().getLastName

  override def printMessage(): Unit = {
    println(messageRandom)
  }
}
