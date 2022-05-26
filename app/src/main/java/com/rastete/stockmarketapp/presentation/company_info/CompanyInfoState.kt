package com.rastete.stockmarketapp.presentation.company_info

import com.rastete.stockmarketapp.domain.model.CompanyInfo
import com.rastete.stockmarketapp.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val companyInfo: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
