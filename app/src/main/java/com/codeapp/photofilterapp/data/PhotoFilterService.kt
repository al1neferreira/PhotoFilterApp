package com.codeapp.photofilterapp.data

interface PhotoFilterService {
    suspend fun applyFilter(imageUrl: String): String
}