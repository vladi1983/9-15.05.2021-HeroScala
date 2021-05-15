package com.naya.pro.hero.heroes

trait Hero {
  var name: String
  var power: Int
  var hp: Int

  def isAlive(): Boolean = {
    if (hp <= 0) false else true
  }

  def kick(enemy: Hero): Unit
}
