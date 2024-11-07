package com.lifestyle.carlo

import android.content.Context
import com.airbnb.lottie.LottieAnimationView
import com.konovalov.vad.silero.Vad
import com.konovalov.vad.silero.VadSilero
import com.konovalov.vad.silero.config.FrameSize
import com.konovalov.vad.silero.config.Mode
import com.konovalov.vad.silero.config.SampleRate



class LottieAnimationProvider(private val context: Context) {
    fun getAnimationView(animationResId: Int): LottieAnimationView {
        val animationView = LottieAnimationView(context)
        animationView.setAnimation(animationResId)
        animationView.playAnimation()
        return animationView
    }
}