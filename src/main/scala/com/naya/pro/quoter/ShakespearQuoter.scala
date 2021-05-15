package com.naya.pro.quoter

class ShakespearQuoter(val message: String = "to be or not to be") extends Quoter {
  override def printMessage(): Unit = println(message)
}
