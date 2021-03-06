package scala.basic.abstraction

/**
  * Created by Led on 26/03/2017.
  */

abstract class Robot {
  def useSuperWeapon(weapon: String) : Unit
  def chargeSuperWeapon(weapon: String) : Unit
}

class SuperHero extends Robot {
  override def chargeSuperWeapon(weapon: String ="Sword" ): Unit = {
    println(s" Charging Weapon: $weapon...   ")
  }

  override def useSuperWeapon(weapon: String = "Sword"): Unit = {
    println(s" Aiming Super Weapon: $weapon...")
    println(s" Fire Super Weapon: $weapon...  ")
  }
}

class VoltesV extends SuperHero {
  override def chargeSuperWeapon(weapon: String): Unit = {
    println(s">> Opening chest compartment for $weapon...")
    super.chargeSuperWeapon(weapon)
  }
}

class MazingerZ extends SuperHero {
  override def useSuperWeapon(weapon: String): Unit = {
    println(s">> lift the arm to ready $weapon...")
    super.useSuperWeapon(weapon)
  }

  override def chargeSuperWeapon(weapon: String): Unit = {
    println(s">> initiate full power to activate $weapon...")
    super.chargeSuperWeapon(weapon)
  }
}

class Character {
  // Start of abstraction example 1
  println("**** Generic Hero ****")
  var hero = new SuperHero
  hero.chargeSuperWeapon()
  hero.useSuperWeapon()

  println("**** VoltesV ****")
  hero = new VoltesV
  hero.chargeSuperWeapon("Ultra magnetic top")
  hero.useSuperWeapon("Ultra magnetic top")

  println("*** MazingerZ ***")
  val mz = new MazingerZ
  mz.chargeSuperWeapon("Rocket Punch")
  mz.useSuperWeapon("Rocket Punch")
  // End of abstraction example 1
}
