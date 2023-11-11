package com.genir.titlescreenfire

import com.fs.starfarer.api.BaseModPlugin
import com.fs.starfarer.api.GameState
import com.fs.starfarer.api.Global
import com.fs.starfarer.api.PluginPick
import com.fs.starfarer.api.campaign.CampaignPlugin
import com.fs.starfarer.api.combat.AutofireAIPlugin
import com.fs.starfarer.api.combat.WeaponAPI


class TitleScreenFireBasePlugin : BaseModPlugin() {
    override fun pickWeaponAutofireAI(weapon: WeaponAPI): PluginPick<AutofireAIPlugin>? =
        when (Global.getCurrentState()) {
            GameState.TITLE -> PluginPick(TitleScreenFireAI(weapon), CampaignPlugin.PickPriority.MOD_SPECIFIC)
            else -> null
        }
}