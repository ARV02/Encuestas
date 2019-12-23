package com.example.encuestas.kotlin

import android.text.Editable
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

/*override fun afterTextChanged(s: Editable) {
    mon!!.removeTextChangedListener(this)

    try {
        var originalString = s.toString()

        val longval: Long?
        if (originalString.contains(",")) {
            originalString = originalString.replace("," , "")
        }
        longval = java.lang.Long.parseLong(originalString)

        val formatter = NumberFormat.getCurrencyInstance(Locale("es", "MX")) as DecimalFormat
        formatter.applyPattern("#,###,###,###")
        val formattedString = formatter.format(longval)

        mon!!.setText(formattedString)
        mon!!.setSelection(mon!!.text.length)
    } catch (nfe: NumberFormatException) {
        nfe.printStackTrace()
    }

    mon!!.addTextChangedListener(this)
}
}
}*/