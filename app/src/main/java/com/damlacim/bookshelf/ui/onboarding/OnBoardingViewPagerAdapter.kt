package com.damlacim.bookshelf.ui.onboarding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter
import com.damlacim.bookshelf.R

class OnBoardingViewPagerAdapter(private val context: Context) : PagerAdapter() {
    override fun getCount() = 3

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as LinearLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var view: View? = null
        when (position) {
            0 -> {
                view =
                    (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(
                        R.layout.item_onboarding_first_screen,
                        container,
                        false
                    )
            }
            1 -> {
                view =
                    (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(
                        R.layout.item_onboarding_second_screen,
                        container,
                        false
                    )
            }

            2 -> {
                view =
                    (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(
                        R.layout.item_onboarding_third_screen,
                        container,
                        false
                    )
            }
        }
        container.addView(view)

        return view!!
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }
}
