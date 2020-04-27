package com.kishynskaya.usingfirebase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_child_listener.*


class ChildListenerActivity : AppCompatActivity() {

    lateinit var dataFirebase: FirebaseDatabase
    lateinit var dataLocal: DatabaseReference
    lateinit var childEvents: ChildEventListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_listener)
        dataFirebase = FirebaseDatabase.getInstance()
        dataLocal = dataFirebase.reference.child("NewData")
        childEvents = object : ChildEventListener {
            override fun onCancelled(p0: DatabaseError) {

            }

            override fun onChildMoved(dataSnapshot: DataSnapshot, p1: String?) {

            }

            override fun onChildChanged(dataSnapshot: DataSnapshot, p1: String?) {

            }

            override fun onChildAdded(dataSnapshot: DataSnapshot, p1: String?) {
                var film = dataSnapshot.key
                titleText.text = film

            }

            override fun onChildRemoved(dataSnapshot: DataSnapshot) {

            }

        }
        dataLocal.addChildEventListener(childEvents)
    }
}