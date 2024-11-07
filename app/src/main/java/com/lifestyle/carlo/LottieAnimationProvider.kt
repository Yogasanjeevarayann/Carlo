package com.lifestyle.carlo

import android.content.Context
import com.airbnb.lottie.LottieAnimationView

class LottieAnimationProvider(private val context: Context) {
    fun getAnimationView(animationResId: Int): LottieAnimationView {
        val animationView = LottieAnimationView(context)
        animationView.setAnimation(animationResId)
        animationView.playAnimation()
        return animationView
    }
}