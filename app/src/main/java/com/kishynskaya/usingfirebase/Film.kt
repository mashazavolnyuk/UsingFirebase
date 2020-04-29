package com.kishynskaya.usingfirebase

data class Film(var title: String ="") {
    var id: String? = null
//    var title: String = ""

    internal constructor() : this(""){}
//    internal constructor(title: String = "") {
//        this.title = title
//    }
}