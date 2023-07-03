package com.fastcampus.fcboard2

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SampleService(
    private val sampleRepository: SampleRepository,
) {
    @Transactional
    fun ss(): MutableList<Sample> {
        return sampleRepository.findAll()
    }
}
