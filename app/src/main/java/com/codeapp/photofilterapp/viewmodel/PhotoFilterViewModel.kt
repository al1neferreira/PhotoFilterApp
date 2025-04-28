package com.codeapp.photofilterapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codeapp.photofilterapp.data.PhotoFilterService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PhotoFilterViewModel(
    private val service: PhotoFilterService
): ViewModel() {

    private val _filteredImageUrl = MutableStateFlow<String?>(null)
    val filteredImageUrl: StateFlow<String?> = _filteredImageUrl

    fun applyFilter(imageUrl: String) {
        viewModelScope.launch {
            val result = service.applyFilter(imageUrl)
            _filteredImageUrl.value = result
        }
    }
}