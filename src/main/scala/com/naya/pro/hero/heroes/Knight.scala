package com.naya.pro.hero.heroes

import com.naya.pro.hero.util.RandomUtil

case class Knight() extends Hero {
  override var name: String = "Knight"
  var power: Int = RandomUtil.between(2, 12)
  var hp: Int = RandomUtil.between(2, 12)

  override def kick(enemy: Hero): Unit = {
    enemy.hp = enemy.hp - power
  }

  override def isAlive(): Boolean = super.isAlive()
}
