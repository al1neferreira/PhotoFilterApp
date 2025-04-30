package com.codeapp.photofilterapp.data

import kotlinx.coroutines.delay

class MockPhotoFilterService : PhotoFilterService {
    override suspend fun applyFilter(imageUrl: String): String {
        delay(2000)
        return imageUrl
    }
}
