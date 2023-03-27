package com.saugatligal.mobileappchallenge.hotelDetails.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.saugatligal.mobileappchallenge.Constants
import com.saugatligal.mobileappchallenge.R
import com.saugatligal.mobileappchallenge.databinding.FragmentHotelDetailBinding
import dagger.hilt.android.AndroidEntryPoint


/**
 * HotelDetailFragment is the fragment
 * used to show all the details of hotel
 * which is selected by users.
 */
@AndroidEntryPoint
class HotelDetailFragment : Fragment() {
    private lateinit var binding: FragmentHotelDetailBinding
    private val viewModel: HotelDetailViewModel by viewModels()
    var image: String? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHotelDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val hotelId: String? = arguments?.getString(Constants.HOTEL_ID)
        image = arguments?.getString(Constants.IMAGE_URL)
        viewModel.viewState.observe(viewLifecycleOwner) {
            updateUi(it, requireActivity())
        }
        viewModel.loadHotelDetails(hotelId = hotelId)
    }


    private fun updateUi(state: HotelDetailState, activity: FragmentActivity) {
        when (state) {
            is HotelDetailState.Content -> {
                binding.progressbar.visibility = View.GONE
                binding.errorText.visibility = View.GONE
                binding.hotelDetails.visibility = View.VISIBLE
                binding.hotelImageDetail.visibility = View.VISIBLE
                binding.hotelDetails.text = state.hotelDetail.description
                binding.hotelName.text = state.hotelDetail.title
                binding.hotelAddress.text = state.hotelDetail.imageUrl
                binding.hotelRating.text = state.hotelDetail.rating
                Glide.with(activity)
                    .load(image)
                    .placeholder(R.drawable.ic_launcher_foreground)
                    .into(binding.hotelImageDetail)
            }
            is HotelDetailState.Error -> {
                binding.progressbar.visibility = View.GONE
                binding.errorText.visibility = View.VISIBLE
                binding.hotelDetails.visibility = View.GONE
                binding.hotelImageDetail.visibility = View.GONE
                binding.errorText.text = state.error
            }
            is HotelDetailState.Loading -> {
                binding.progressbar.visibility = View.VISIBLE
                binding.errorText.visibility = View.GONE
                binding.hotelDetails.visibility = View.GONE
                binding.hotelImageDetail.visibility = View.GONE
            }
        }
    }
}