package com.naya.pro.hero.heroes

import com.naya.pro.hero.util.RandomUtil

case class King() extends Hero {
  override var name: String = "King"
  override var power: Int = RandomUtil.between(5, 15)
  override var hp: Int = RandomUtil.between(5, 15)

  override def kick(enemy: Hero): Unit = {
    enemy.hp = enemy.hp - power

  }

  override def isAlive(): Boolean = super.isAlive()
}
