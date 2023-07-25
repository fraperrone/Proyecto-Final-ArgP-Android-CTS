package com.curso.android.app.practica.proyectofinal2

import android.arch.core.executor.testing.InstantTaskExecutorRule
import com.curso.android.app.practica.proyectofinal2.view.InputsViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
class ExampleUnitTest {

    private lateinit var viewModel: InputsViewModel

    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setu(){
        Dispatchers.setMain(dispatcher)
        viewModel = InputsViewModel()
    }

    @After
    fun tearDown(){
        Dispatchers.resetMain()
    }

    @Test
    fun mainViewModel_CheckInitialValue() = runTest {
        val value1 = viewModel.inputsModel.value?.input1
        val value2 = viewModel.inputsModel.value?.input2
        assertEquals("", value1)
        assertEquals("",value2)
    }


}