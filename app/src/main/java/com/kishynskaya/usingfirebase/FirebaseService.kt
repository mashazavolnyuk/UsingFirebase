package com.kishynskaya.usingfirebase

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import java.lang.Exception

open class FirebaseService : FirebaseMessagingService() {

    override fun onNewToken(p0: String) {
        super.onNewToken(p0)
    }

    override fun onMessageReceived(remoteMessge: RemoteMessage) {
        super.onMessageReceived(remoteMessge)
        try {
            var data = remoteMessge.data.toString()
            var title = remoteMessge.notification?.title
            var body = remoteMessge.notification?.body
        } catch (e:Exception){

        }

    }

    override fun onDeletedMessages() {
        super.onDeletedMessages()
    }
}