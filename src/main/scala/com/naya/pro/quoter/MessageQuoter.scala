package com.naya.pro.quoter

case class MessageQuoter(messageQuoter: String) extends Quoter {
  override def printMessage(): Unit = println(messageQuoter)
}
