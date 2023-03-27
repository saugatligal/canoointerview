package com.saugatligal.mobileappchallenge.hotels.presentation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.saugatligal.mobileappchallenge.Constants
import com.saugatligal.mobileappchallenge.R
import com.saugatligal.mobileappchallenge.databinding.FragmentHotelListBinding
import com.saugatligal.mobileappchallenge.hotels.data.HotelListViewState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HotelListFragment : Fragment() {
    private lateinit var binding: FragmentHotelListBinding
    private val viewModel: HotelListViewModel by viewModels()
    private val adapter = HotelListAdapter(::onItemClicked)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHotelListBinding.inflate(layoutInflater)
        binding.button.clearFocus()
        binding.button.setOnQueryTextListener(
            object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    viewModel.getHotelList(query)
                    return false
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    return true
                }
            }
        )
        viewModel.viewState.observe(viewLifecycleOwner) {
            updateUI(it)
        }
        return binding.root
    }

    private fun updateUI(viewState: HotelListState) {
        when (viewState) {
            is HotelListState.Error -> {
                binding.progressBar.visibility = View.GONE
                binding.recyclerview.visibility = View.GONE
                binding.errorText.visibility = View.VISIBLE
                binding.errorText.text = viewState.error
                Toast.makeText(activity, viewState.error, Toast.LENGTH_LONG).show()
            }
            is HotelListState.Loading -> {
                binding.progressBar.visibility = View.VISIBLE
                binding.recyclerview.visibility = View.GONE
                binding.errorText.visibility = View.GONE
            }
            is HotelListState.Content -> {
                binding.progressBar.visibility = View.GONE
                binding.recyclerview.visibility = View.VISIBLE
                binding.errorText.visibility = View.GONE
                binding.recyclerview.layoutManager = LinearLayoutManager(activity)
                binding.recyclerview.adapter = adapter
                adapter.setData(viewState.hotelList)
            }
        }
    }

    private fun onItemClicked(viewState: HotelListViewState) {
        val data: Bundle = bundleOf(Constants.HOTEL_ID to viewState.cityId)
        data.putString(Constants.IMAGE_URL, viewState.image)
        findNavController().navigate(R.id.action_hotelListFragment_to_hotelDetailFragment, data)
    }
}