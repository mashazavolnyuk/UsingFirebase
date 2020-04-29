package com.kishynskaya.usingfirebase

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import com.google.firebase.database.ktx.getValue
import kotlinx.android.synthetic.main.activity_child_listener.*


class ChildListenerActivity : AppCompatActivity() {

    lateinit var dataFirebase: FirebaseDatabase
    lateinit var dataLocal: DatabaseReference
    lateinit var childEvents: ChildEventListener
    var TAG = "ChildListenerActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_listener)
        dataFirebase = FirebaseDatabase.getInstance()
        dataLocal = dataFirebase.reference.child("NewData")
        childEvents = object : ChildEventListener {
            override fun onCancelled(databaseError: DatabaseError) {
                throw databaseError.toException()
            }

            override fun onChildMoved(dataSnapshot: DataSnapshot, p1: String?) {

            }

            override fun onChildChanged(dataSnapshot: DataSnapshot, p1: String?) {

            }

            override fun onChildAdded(dataSnapshot: DataSnapshot, p1: String?) {
                Log.d(TAG, "onChildAdded:" + dataSnapshot.key!!)
                var film = dataSnapshot.getValue<String>()
                titleText.text = film?.let { Film(it).title }

            }

            override fun onChildRemoved(dataSnapshot: DataSnapshot) {

            }

        }
        dataLocal.addChildEventListener(childEvents)
    }
}