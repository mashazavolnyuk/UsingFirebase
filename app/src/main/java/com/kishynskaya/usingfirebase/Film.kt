package com.kishynskaya.usingfirebase

class Film {
    var id: Long = -1
    var title: String = ""
    var idtitle: String = ""

    constructor()
    constructor(idtitle: String = "", id: Long, title: String) {
        this.id = id
        this.title = title
        this.idtitle = idtitle
    }
}