package com.naya.pro.quoter

class QuoterAggregator {

  var messages: List[Quoter] = List(MessageQuoter("Hello world!!!"), RandomQuoter, new ShakespearQuoter())

  def printQuoters(): Unit = {
    messages.foreach(_.printMessage())
  }

}
