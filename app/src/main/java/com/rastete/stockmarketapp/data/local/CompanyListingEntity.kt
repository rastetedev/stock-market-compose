package com.rastete.stockmarketapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class CompanyListingEntity(
    val name: String,
    val symbol: String,
    val exchange: String,
    @PrimaryKey val id: Int? = null
)