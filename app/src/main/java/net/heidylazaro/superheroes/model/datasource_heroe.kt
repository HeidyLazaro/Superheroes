package net.heidylazaro.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class datasource_heroe(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)
