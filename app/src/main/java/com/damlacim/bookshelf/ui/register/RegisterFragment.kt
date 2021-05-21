package com.damlacim.bookshelf.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.damlacim.bookshelf.R
import com.damlacim.bookshelf.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private lateinit var binding: FragmentRegisterBinding
    private val viewModel: RegisterViewModel by viewModels()

    private var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentRegisterBinding.inflate(inflater).also { binding = it }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(requireView())
        initViews()
    }

    private fun initViews() {
        binding.buttonRegister.setOnClickListener {
            viewModel.validatePassword(
                binding.editTextTextPassword.text.toString(),
                binding.etConfirmPassword.text.toString()
            )
            if (viewModel.isPasswordValidate) {
                Toast.makeText(activity, "Parola Kontrol Ediniz", Toast.LENGTH_LONG).show()
            } else {
                navController?.navigate(R.id.action_registerFragment_to_homeFragment)
            }
        }
    }
}