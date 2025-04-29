package com.codeapp.photofilterapp.data

import kotlinx.coroutines.delay

class MockPhotoFilterService : PhotoFilterService {
    override suspend fun applyFilter(imageUrl: String): String {
        delay(2000) // Simulate network delay(2 seconds)
        return "https://picsum.photos/300"
    }
}