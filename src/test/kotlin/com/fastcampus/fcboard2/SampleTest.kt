package com.fastcampus.fcboard2

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SampleTest(
    private val sampleService: SampleService,
) : BehaviorSpec({
    given("샘플 테스트 생성") {
        When("샘플 테스트 when") {
            then("샘플 테스트 then") {
                println("샘플 테스트 then")
                1 shouldBe 1
            }
        }
    }
})
