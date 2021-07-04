package com.example.explorr.explore

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.explorr.R
import com.example.explorr.databinding.ActivityMoodHotelBinding
import com.example.explorr.databinding.FragmentExploreBinding
import com.example.explorr.databinding.FragmentFavoriteBinding
import com.example.explorr.listhotel.ListHotelActivity
import com.example.explorr.mood.MoodHotelAdapter
import kotlinx.android.synthetic.main.fragment_explore.*
import kotlinx.coroutines.launch
import org.koin.android.ext.android.bind
import retrofit2.Response


class ExploreFragment : Fragment() {

    private val viewModel : ExploreViewModel by viewModels()
    private var _binding: FragmentExploreBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExploreBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val hotelAdapter = ListHotelAdapter(com.example.explorr.core.data.source.response.listhotel.Response())
        with(binding.rvHotels) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = hotelAdapter
        }


        binding.aoLocation.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                true
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                lifecycleScope.launch {
                    viewModel.channel.send(p0.toString())
                }
            }
            override fun afterTextChanged(p0: Editable?) {
                true
            }

        })

        binding.btnExploreMood.setOnClickListener {
            val intent = Intent(requireActivity(),ListHotelActivity::class.java)
            startActivity(intent)
        }

        viewModel.placeResult.observe(viewLifecycleOwner, Observer{
            val name = arrayListOf<String?>()
            it.map{
                name.add(it.placeName)
            }
            val adapter = ArrayAdapter(requireContext(),android.R.layout.select_dialog_item, name)
            adapter.notifyDataSetChanged()
            binding.aoLocation.setAdapter(adapter)
        })

    }

    companion object{
        const val EXTRA_TAGS = "extra_tags"
    }


}