package kz.beeline.testapp


import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import kz.beeline.testapp.robots.MainRobot
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    fun login(func: MainRobot.() -> Unit) = MainRobot()
        .apply { func() }

    @Test
    fun  loginMissingPassword() {
        login{
            setName("ibrayevabay1@gmail.com")
            clickSubmit()
            //matchErrorText("some error text - no password")
        }
    }
    @Test
    fun  loginWrongPassword() {
        login{
            setName("123123@gmail.com")
            setPassword("qwerty123")
            clickSubmit()
            //matchErrorText("some error text - invalid password")
        }
    }

    @Test
    fun  loginSuccess() {
        login{
            setName("tuturutututuru@gmail.com")
            setPassword("123123qwerty")
            clickSubmit()
            //matchText()
        }
    }

}