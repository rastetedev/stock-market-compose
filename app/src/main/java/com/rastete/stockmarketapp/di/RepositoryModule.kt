package com.rastete.stockmarketapp.di

import com.rastete.stockmarketapp.data.csv.CSVParser
import com.rastete.stockmarketapp.data.csv.CompanyListingsParser
import com.rastete.stockmarketapp.data.csv.IntradayInfoParser
import com.rastete.stockmarketapp.data.repository.StockRepositoryImpl
import com.rastete.stockmarketapp.domain.model.CompanyListing
import com.rastete.stockmarketapp.domain.model.IntradayInfo
import com.rastete.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ) : CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ) : CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun  bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ) : StockRepository
}