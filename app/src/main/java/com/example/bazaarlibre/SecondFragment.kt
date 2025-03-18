package com.example.bazaarlibre

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.bazaarlibre.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

private var _binding: FragmentSecondBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    var isValid:Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

      _binding = FragmentSecondBinding.inflate(inflater, container, false)
        setupView()
      return binding.root

    }

    private fun setupView() {
        binding.loginButton.setOnClickListener{
            if (isValid){
                Toast.makeText(activity, "Ingreso valido", Toast.LENGTH_SHORT).show()
            } esle {
                Toast.makeText(activity, "Ingreso valido", Toast.LENGTH_SHORT).show()
            }
        }
        binding.emailTIL.addTextChandgedListener{
            if(binding.emailTIL.text.toString().isEmpty()){
                binding.emailTIL.error = "por favor introduce un correo"
                isValid = false
            } else {
                isValid = true
            }
        }
        binding.passwordlTIL.addTextChandgedListener{
            if(binding.passwordTIL.text.toString().isEmpty()){
                binding.passwordTIL.error = "por favor introduce un correo"
                isValid = false
            } else {
                isValid = true
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }
override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}