package com.curso.android.app.practica.proyectofinal2.view

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.curso.android.app.practica.proyectofinal2.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
internal class MainActivityTest {

    @get: Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainActivity_testButton(){
        Espresso.onView(
            ViewMatchers.withId(R.id.button)
        ).perform(
            ViewActions.click()
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.textViewResultado)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText("inputs Iguales: ''")
            )
        )
    }
}