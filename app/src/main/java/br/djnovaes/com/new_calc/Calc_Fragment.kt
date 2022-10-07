package br.djnovaes.com.new_calc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import br.djnovaes.com.new_calc.databinding.FragmentCalcBinding


class Calc_Fragment : Fragment() {

    private var _binding: FragmentCalcBinding? = null
    private val binding: FragmentCalcBinding get() = _binding!!
    private val viewModel: CalcViewModel by viewModels()


   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       _binding = FragmentCalcBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.visor1.observe(viewLifecycleOwner) {linha ->
            binding.textViewVisor1.text = linha
        }

        viewModel.visor2.observe(viewLifecycleOwner) {linha ->
            binding.textViewVisor2.text = linha
        }

        binding.btnUm.setOnClickListener {
            viewModel.digitaNumero("1")
        }
    }

}