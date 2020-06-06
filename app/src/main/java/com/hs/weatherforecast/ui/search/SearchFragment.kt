package com.hs.weatherforecast.ui.search

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hs.weatherforecast.core.BaseFragment
import com.hs.weatherforecast.db.entity.CitiesForSearchEntity
import com.hs.weatherforecast.di.Injectable
import com.hs.weatherforecast.ui.main.MainActivity
import com.hs.weatherforecast.utils.extensions.hideKeyboard
import com.hs.weatherforecast.utils.extensions.observeWith
import com.hs.weatherforecast.utils.extensions.tryCatch
import com.hs.weatherforecast.R
import com.hs.weatherforecast.databinding.FragmentSearchBinding
import com.hs.weatherforecast.domain.usecase.SearchCitiesUseCase
import com.hs.weatherforecast.ui.search.result.SearchResultAdapter

class SearchFragment : BaseFragment<SearchViewModel, FragmentSearchBinding>(
    R.layout.fragment_search,
    SearchViewModel::class.java
), Injectable {

    override fun init() {
        super.init()
        initSearchResultsAdapter()
        initSearchView()

        binding.viewModel?.getSearchViewState()?.observeWith(
            viewLifecycleOwner
        ) {
            binding.viewState = it
            it.data?.let { results -> initSearchResultsRecyclerView(results) }
        }

    }

    private fun initSearchView() {
        val searchEditText: EditText = binding.searchView.findViewById(R.id.search_src_text)
        activity?.applicationContext?.let { ContextCompat.getColor(it, R.color.mainTextColor) }
            ?.let { searchEditText.setTextColor(it) }
        activity?.applicationContext?.let {
            ContextCompat.getColor(
                it,
                android.R.color.darker_gray
            )
        }
            ?.let { searchEditText.setHintTextColor(it) }
        binding.searchView.isActivated = true
        binding.searchView.setIconifiedByDefault(false)
        binding.searchView.isIconified = false

        val searchViewSearchIcon = binding.searchView.findViewById<ImageView>(R.id.search_mag_icon)
        searchViewSearchIcon.setImageResource(R.drawable.ic_search)

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(newText: String): Boolean {
                if (newText.isNotEmpty() && newText.count() > 2) {
                    binding.viewModel?.setSearchParams(
                        SearchCitiesUseCase.SearchCitiesParams(
                            newText
                        )
                    )
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText?.isNotEmpty() == true && newText.count() > 2) {
                    binding.relativeCity.visibility = View.GONE
                    binding.relativeList.visibility = View.VISIBLE
                    binding.viewModel?.setSearchParams(
                        SearchCitiesUseCase.SearchCitiesParams(
                            newText
                        )
                    )
                } else {
                    binding.relativeList.visibility = View.GONE
                    binding.relativeCity.visibility = View.VISIBLE
                }
                return true
            }
        })
    }

    private fun initSearchResultsAdapter() {
        val adapter = SearchResultAdapter { item ->
            item.coord?.let {
                binding.viewModel?.saveCoordsToSharedPref(it)
                    ?.subscribe { _, _ ->

                        tryCatch(
                            tryBlock = {
                                binding.searchView.hideKeyboard((activity as MainActivity))
                            }
                        )

                        findNavController().navigate(R.id.action_searchFragment_to_dashboardFragment)
                    }
            }
        }

        binding.recyclerViewSearchResults.adapter = adapter
        binding.recyclerViewSearchResults.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

    private fun initSearchResultsRecyclerView(list: List<CitiesForSearchEntity>) {
        (binding.recyclerViewSearchResults.adapter as SearchResultAdapter).submitList(list.distinctBy { it.getFullName() }.sortedBy { it.importance })
    }
}
