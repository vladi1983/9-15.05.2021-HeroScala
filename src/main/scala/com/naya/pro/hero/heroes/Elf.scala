package com.naya.pro.hero.heroes

case class Elf() extends Hero {
  override var name: String = "Elf"
  override var power: Int = 10
  override var hp: Int = 10

  override def kick(enemy: Hero): Unit = {
    if (power > enemy.power) {
      enemy.hp = 0
    } else {
      enemy.power = enemy.power - 1
    }
  }

  override def isAlive(): Boolean = super.isAlive()


}
