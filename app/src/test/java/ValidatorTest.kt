package net.simplifiedcoding.spendtracker

import org.junit.Assert.*
import org.junit.Test
import org.junit.runners.JUnit4
import org.junit.runner.RunWith
import com.google.common.truth.Truth.assertThat

class ValidatorTest{

@RunWith(JUnit4::class)
class ValidatorTest

    @Test
fun whenInputIsValid(){
    val amount = 0
        val desc = "Some desc"

        val result = Validator.validateInput(amount, desc)

        assertThat(result).isEqualTo(true)
    }
}