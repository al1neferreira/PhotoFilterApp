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

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    fun applyFilter(imageUrl: String) {
        viewModelScope.launch {
            _isLoading.value = true
            val result = service.applyFilter(imageUrl)
            _filteredImageUrl.value = result
            _isLoading.value = false
        }
    }
}
