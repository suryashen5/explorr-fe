package com.example.explorr.core.data.source

import com.example.explorr.R

object Data {

    fun getAllCategory():ArrayList<CategoryEntity>{
        return arrayListOf(
            CategoryEntity(
                "Nature", R.drawable.categ_nature
            ),
            CategoryEntity(
                "Hotel",R.drawable.categ_hotel
            ),
            CategoryEntity(
                "Nightview",R.drawable.categ_night
            ),
            CategoryEntity(
                "Japan",R.drawable.categ_japan
            ),
            CategoryEntity(
                "Wooden",R.drawable.categ_wooden
            )
        )
    }

    fun getAllPhoto():ArrayList<PhotoEntity>{
        return arrayListOf(
            PhotoEntity(
                R.drawable.categ_hotel
            ),
            PhotoEntity(
                R.drawable.categ_nature
            ),
            PhotoEntity(
                R.drawable.categ_japan
            ),
            PhotoEntity(
                R.drawable.categ_night
            ),
            PhotoEntity(
                R.drawable.categ_wooden
            ),
        )
    }

}