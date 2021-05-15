package com.naya.pro.hero.util

import scala.util.Random

object RandomUtil {
  def between(min: Int, max: Int): Int = {
    Random.between(min, max)
  }
}
