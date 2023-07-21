package com.tofa.Villa_1412200037.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.tofa.Villa_1412200037.R
import com.tofa.Villa_1412200037.application.VillaApp
import com.tofa.Villa_1412200037.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!

    private lateinit var applicationContext: Context
    private val villaViewModel: VillaViewModel by viewModels {
        VillaViewModelFactory((applicationContext as VillaApp).repository)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        applicationContext = requireContext().applicationContext
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = VillaListAdapter { villa ->
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(villa)
            findNavController().navigate(action)
        }
        binding.dataRecyclerView.adapter = adapter
        binding.dataRecyclerView.layoutManager = LinearLayoutManager(context)
        villaViewModel.AllVillas.observe(viewLifecycleOwner) { villas ->
            villas.let {
                if (villas.isEmpty()) {
                    binding.emptyTextView.visibility = View.VISIBLE
                    binding.IlustrationImageView.visibility = View.VISIBLE
                } else {
                    binding.emptyTextView.visibility = View.GONE
                    binding.IlustrationImageView.visibility = View.GONE
                }


            }
            adapter.submitList(villas)

        }

        binding.addFAB.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(null)
            findNavController().navigate(action)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
