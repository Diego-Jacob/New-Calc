package br.djnovaes.com.new_calc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.djnovaes.com.new_calc.databinding.FragmentHostBinding

class Host_Fragment : Fragment() {

    private var _binding: FragmentHostBinding? = null
    private val binding: FragmentHostBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHostBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCalc.setOnClickListener {
            findNavController().navigate(R.id.host_to_calc)
        }

    }
}