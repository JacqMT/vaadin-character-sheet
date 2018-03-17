package com.example.charactersheet

import com.vaadin.server.VaadinRequest
import com.vaadin.ui.UI
import com.vaadin.ui.Label
import com.vaadin.annotations.Theme

@Theme("CharacterSheet")
class CharacterSheetUI : UI() {

    override fun init(request: VaadinRequest) {
        val lbl = Label("Hello vaadin")
        content = lbl
    }
}
