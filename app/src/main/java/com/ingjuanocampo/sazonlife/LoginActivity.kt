package com.ingjuanocampo.sazonlife

import android.content.Intent
import com.firebase.ui.auth.AuthUI
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.ingjuanocampo.common.base.activity.BaseActivity

class LoginActivity: BaseActivity() {

    override fun onResume() {
        super.onResume()

        // Enable Firestore logging
        FirebaseFirestore.setLoggingEnabled(true)

        // Start sign in if necessary
        resolveSignInFlow()


    }

    private fun resolveSignInFlow() {
        // Start sign in if necessary
        if (shouldStartSignIn()) {
            startSignIn()
            return
        } else {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        resolveSignInFlow()
    }

    // Enable Firestore logging

    private fun startSignIn() {
        // Sign in with FirebaseUI
       val intent: Intent = AuthUI.getInstance().createSignInIntentBuilder()
            .setAvailableProviders(
                listOf(
                    AuthUI.IdpConfig.EmailBuilder().build()
                )
            )
            .setIsSmartLockEnabled(false)
            .build()
        startActivityForResult(intent, 1111)
    }

    private fun shouldStartSignIn(): Boolean {
        return FirebaseAuth.getInstance().getCurrentUser() == null
    }
}