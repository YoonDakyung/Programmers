const solution = (bandage, health, attacks) => {
  let time = 0
  let currentHealth = health
  for (const [attackTime, damage] of attacks) {
    let healTime = attackTime - 1 - time
    currentHealth = currentHealth + bandage[1] * healTime
    while (healTime >= bandage[0]) {
      currentHealth += bandage[2]
      healTime -= bandage[0]
    }
    if (currentHealth >= health) currentHealth = health
    currentHealth -= damage
    time = attackTime

    if (currentHealth <= 0) return -1
  }
  if (currentHealth <= 0) return -1
  return currentHealth
}