package com.orbital.sonic.rentickletask.datamodel

data class TrendingProductItem(
    var productImage: Int,
    var productName: String,
    var productRatingStar: Float,
    var productCountingRating: Int,
    var productCountingReviews: Int,
    var productRentPerMonth: Int,
    var productRefundableDeposit:Int
)
