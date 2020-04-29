package com.kishynskaya.usingfirebase

class TravelDeal {
    var id: String? = null
    var title: String? = null

    internal constructor() {}
    internal constructor(id: String?, title: String?) {
        this.id = id
        this.title = title
    }
}