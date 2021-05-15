package com.naya.pro.hero.services

import com.naya.pro.hero.heroes.Hero
import com.naya.pro.hero.util.RandomUtil
import org.reflections.Reflections
import scala.jdk.CollectionConverters.CollectionHasAsScala


class HeroFactory {
  val reflect = new Reflections("com.naya.pro.hero.heroes");
  val randomHero = RandomUtil.between(0, getAllTypeHero().size)

  def createHero(): Hero = {
    val list = getAllTypeHero();
    list(randomHero).newInstance();
  }

  def getAllTypeHero(): List[Class[_ <: Hero]] = {
    val set = reflect.getSubTypesOf(classOf[Hero])
    set.asScala.toList
  }
}
