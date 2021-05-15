package com.naya.pro.hero.services

import com.naya.pro.hero.heroes.Hero


import scala.util.control.Breaks.break


class FightManager {

  def fight(h1: Hero, h2: Hero): Unit = {
    h1.name = h1.name + "1"
    h2.name = h2.name + "2"
    println(s">>>>>>>>>>>>>>>>>>>>>>>>>Fight: " + h1.name + " vs " + h2.name+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
    sleep()

    while (true) {

      if (h1.isAlive()) {
        println(h1.name + " hits " + h2.name)
        h1.kick(h2)
        print(s"Fighter:" + h1.name + " power:" + h1.power + " hp:" + h1.hp + " vs ")
        println(s"Fighter:" + h2.name + " power:" + h2.power + " hp:" + h2.hp)
      } else {
        println(s"Hero " + h1.name + " is dead")
        println(s"Hero " + h2.name + " win !")
        break
      }
      sleep()

      if (h2.isAlive()) {
        println(h2.name + " hits " + h1.name)
        h2.kick(h1)
        print(s"Fighter: " + h1.name + " power:" + h1.power + " hp:" + h1.hp + " vs ")
        println(s"Fighter: " + h2.name + " power:" + h2.power + " hp:" + h2.hp)
      } else {
        println(s"Hero " + h2.name + " is dead")
        println(s"Hero " + h1.name + " win !")
        break
      }
      sleep()
      if (h1.name.contains("Hobbit") && h2.name.contains("Hobbit")) {
        println(s"Crying participants kicked out of the battlefield")
        break
      }
    }
    println(s"The Fight finished !")
  }

  def sleep(): Unit = Thread.sleep(1000)
}
