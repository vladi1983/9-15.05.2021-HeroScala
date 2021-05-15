package com.naya.pro.hero.heroes

case class Hobbit() extends Hero {
  override var name: String = "Hobbit"
  override var power: Int = 0
  override var hp: Int = 3

  override def isAlive(): Boolean = super.isAlive()

  def toCry(): String = s"Hobbit is crying"

  def kick(enemy: Hero): Unit = {
       println(toCry())
  }
}
