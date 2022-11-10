package com.example.bankappclone

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.bankappclone.databinding.LoginButtonBinding

class LoginButton(context: Context, attrs: AttributeSet?) : ConstraintLayout(context, attrs) {

    private val binding: LoginButtonBinding = LoginButtonBinding.inflate(
        LayoutInflater.from(context), this, true
    )

    init {
        val attrs = context.obtainStyledAttributes(attrs, R.styleable.LoginButton)
        this.binding.tvUserName.text = attrs.getString(R.styleable.LoginButton_name)
        this.binding.tvIcon.text = attrs.getString(R.styleable.LoginButton_initials)
        this.binding.tvAccountDetail.text = attrs.getString(R.styleable.LoginButton_account)
    }
}