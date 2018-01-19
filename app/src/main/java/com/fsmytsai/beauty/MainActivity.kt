package com.fsmytsai.beauty

import android.annotation.TargetApi
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import android.app.ActivityOptions
import android.content.Intent
import android.os.Build


class MainActivity : AppCompatActivity() {
    private lateinit var mGoogleSignInClient: GoogleSignInClient
    private var mUserData: GoogleSignInAccount? = null
    private lateinit var imageView: ImageView

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).build()
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso)
        mUserData = GoogleSignIn.getLastSignedInAccount(this)
        imageView = findViewById(R.id.imageView)
        imageView.setOnClickListener {
            val intent = Intent(this, VoteActivity::class.java)
            val options = ActivityOptions.makeSceneTransitionAnimation(this, imageView, "test")
            startActivity(intent, options.toBundle())
        }
    }
}
