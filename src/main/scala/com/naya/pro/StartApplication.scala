package com.naya.pro

import com.naya.pro.hero.services.{FightManager, HeroFactory}
import com.naya.pro.quoter.QuoterAggregator

object StartApplication {

  def main(args: Array[String]): Unit = {
    //    new QuoterAggregator().printQuoters()

    val hero1 = new HeroFactory().createHero()
    val hero2 = new HeroFactory().createHero()

    new FightManager().fight(hero1, hero2)

  }
}