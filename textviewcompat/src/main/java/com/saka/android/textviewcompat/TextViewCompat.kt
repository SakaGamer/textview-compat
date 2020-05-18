package com.saka.android.textviewcompat

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.StringRes
import androidx.appcompat.widget.AppCompatTextView

class TextViewCompat @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    private var textResId = 0

    @StringRes
    var textRes: Int = textResId
        set(value) {
            textResId = value
            text = context.getText(value)
        }
}
