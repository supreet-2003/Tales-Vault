package com.kmp.arandomroom.ui.features.room.composables

class TextCharIterator(val text: String) : Iterator<Char> {
    private var currentIndex = -1

    fun isFirst(): Boolean {
        return currentIndex == -1
    }

    override fun hasNext(): Boolean {
        return currentIndex < text.length - 1
    }

    override fun next(): Char {
        if (currentIndex < text.length) {
            currentIndex++
        }
        return text[currentIndex]
    }
}