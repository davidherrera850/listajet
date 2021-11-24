package com.example.balonoro.datos

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.example.balonoro.ui.theme.BalonoroTheme


class ProfileActivity : AppCompatActivity() {
    private val futbolistas: Futbolistas by lazy {
        intent?.getSerializableExtra(FUTBOLISTA_ID) as Futbolistas
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BalonoroTheme {
                ProfileScreen(futbolistas = futbolistas)
                }
            }
        }
    companion object {
        private const val FUTBOLISTA_ID = "futbolista_id"
        fun newIntent(context: Context, futbolistas: Futbolistas) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(FUTBOLISTA_ID, futbolistas)
            }
    }
}


