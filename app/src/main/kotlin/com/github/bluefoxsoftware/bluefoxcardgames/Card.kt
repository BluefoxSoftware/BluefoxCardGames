package com.github.bluefoxsoftware.bluefoxcardgames

enum class Suite {
    SPADES,
    HEARTS,
    CLUBS,
    DIAMONDS,
    JOKER
}
enum class Number {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    JOKER
}

class Card(cardSuite: Suite, cardNumber: Number) {
    val suite: Suite
    val number: Number
    init {
        this.suite = cardSuite
        this.number = cardNumber
    }

    override fun equals(other: Any?): Boolean {
        return this.suite == (other as Card).suite && this.number == (other as Card).number
    }
}

enum class CardGroup(list: List<Card>) {
    ALL(listOf(
        Card(Suite.SPADES, Number.ACE),
        Card(Suite.SPADES, Number.TWO),
        Card(Suite.SPADES, Number.THREE),
        Card(Suite.SPADES, Number.FOUR),
        Card(Suite.SPADES, Number.FIVE),
        Card(Suite.SPADES, Number.SIX),
        Card(Suite.SPADES, Number.SEVEN),
        Card(Suite.SPADES, Number.EIGHT),
        Card(Suite.SPADES, Number.NINE),
        Card(Suite.SPADES, Number.TEN),
        Card(Suite.SPADES, Number.JACK),
        Card(Suite.SPADES, Number.QUEEN),
        Card(Suite.SPADES, Number.KING),

        Card(Suite.HEARTS, Number.ACE),
        Card(Suite.HEARTS, Number.TWO),
        Card(Suite.HEARTS, Number.THREE),
        Card(Suite.HEARTS, Number.FOUR),
        Card(Suite.HEARTS, Number.FIVE),
        Card(Suite.HEARTS, Number.SIX),
        Card(Suite.HEARTS, Number.SEVEN),
        Card(Suite.HEARTS, Number.EIGHT),
        Card(Suite.HEARTS, Number.NINE),
        Card(Suite.HEARTS, Number.TEN),
        Card(Suite.HEARTS, Number.JACK),
        Card(Suite.HEARTS, Number.QUEEN),
        Card(Suite.HEARTS, Number.KING),

        Card(Suite.CLUBS, Number.ACE),
        Card(Suite.CLUBS, Number.TWO),
        Card(Suite.CLUBS, Number.THREE),
        Card(Suite.CLUBS, Number.FOUR),
        Card(Suite.CLUBS, Number.FIVE),
        Card(Suite.CLUBS, Number.SIX),
        Card(Suite.CLUBS, Number.SEVEN),
        Card(Suite.CLUBS, Number.EIGHT),
        Card(Suite.CLUBS, Number.NINE),
        Card(Suite.CLUBS, Number.TEN),
        Card(Suite.CLUBS, Number.JACK),
        Card(Suite.CLUBS, Number.QUEEN),
        Card(Suite.CLUBS, Number.KING),

        Card(Suite.DIAMONDS, Number.ACE),
        Card(Suite.DIAMONDS, Number.TWO),
        Card(Suite.DIAMONDS, Number.THREE),
        Card(Suite.DIAMONDS, Number.FOUR),
        Card(Suite.DIAMONDS, Number.FIVE),
        Card(Suite.DIAMONDS, Number.SIX),
        Card(Suite.DIAMONDS, Number.SEVEN),
        Card(Suite.DIAMONDS, Number.EIGHT),
        Card(Suite.DIAMONDS, Number.NINE),
        Card(Suite.DIAMONDS, Number.TEN),
        Card(Suite.DIAMONDS, Number.JACK),
        Card(Suite.DIAMONDS, Number.QUEEN),
        Card(Suite.DIAMONDS, Number.KING),

        Card(Suite.JOKER, Number.JOKER),
        Card(Suite.JOKER, Number.JOKER)
    )),
    SPADES(listOf(
        Card(Suite.SPADES, Number.ACE),
        Card(Suite.SPADES, Number.TWO),
        Card(Suite.SPADES, Number.THREE),
        Card(Suite.SPADES, Number.FOUR),
        Card(Suite.SPADES, Number.FIVE),
        Card(Suite.SPADES, Number.SIX),
        Card(Suite.SPADES, Number.SEVEN),
        Card(Suite.SPADES, Number.EIGHT),
        Card(Suite.SPADES, Number.NINE),
        Card(Suite.SPADES, Number.TEN),
        Card(Suite.SPADES, Number.JACK),
        Card(Suite.SPADES, Number.QUEEN),
        Card(Suite.SPADES, Number.KING)
    )),
    JOKERS(listOf(
        Card(Suite.JOKER, Number.JOKER),
        Card(Suite.JOKER, Number.JOKER)
    ))
}