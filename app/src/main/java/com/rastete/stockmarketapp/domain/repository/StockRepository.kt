package com.rastete.stockmarketapp.domain.repository

import com.rastete.stockmarketapp.domain.model.CompanyListing
import com.rastete.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ) : Flow<Resource<List<CompanyListing>>>
}