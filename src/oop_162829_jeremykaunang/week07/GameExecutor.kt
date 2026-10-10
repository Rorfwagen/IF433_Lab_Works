package oop_162829_jeremykaunang.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter ->
            println("Monster muncul: ${event.monsterName}! Bersiap bertarung.")
        is BattleState.LootDropped ->
            println("Loot didapat: ${event.item.name} (${event.item.rarity}), damage ${event.item.damage}")
        is BattleState.GameOver ->
            println("GAME OVER: ${event.reason}")
        BattleState.SafeZone ->
            println("Kamu berada di Safe Zone. Aman.")
    }
}