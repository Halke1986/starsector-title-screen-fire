package com.genir.titlescreenfire

import com.fs.starfarer.api.combat.AutofireAIPlugin
import com.fs.starfarer.api.combat.MissileAPI
import com.fs.starfarer.api.combat.ShipAPI
import com.fs.starfarer.api.combat.WeaponAPI
import org.lwjgl.util.vector.Vector2f

class TitleScreenFireAI(private val weapon: WeaponAPI) : AutofireAIPlugin {
    override fun advance(p0: Float) = Unit
    override fun shouldFire(): Boolean = true
    override fun forceOff() = Unit
    override fun getTarget(): Vector2f? = null
    override fun getTargetShip(): ShipAPI? = null
    override fun getWeapon(): WeaponAPI = weapon
    override fun getTargetMissile(): MissileAPI? = null
}