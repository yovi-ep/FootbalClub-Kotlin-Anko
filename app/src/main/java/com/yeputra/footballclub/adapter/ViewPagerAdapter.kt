package com.yeputra.footballclub.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.yeputra.footballclub.ui.ListMatchFm


/**
 * Created by yovi.putra
 *    on 05/Mar/2019 00:25
 * Company SIEMO - PT. Multipolar Technology, Tbk
 */

class ViewPagerAdapter(
    val fmManager: FragmentManager
): FragmentPagerAdapter(fmManager){

    val fragments = mutableListOf(
        Pagers("List Match",ListMatchFm()),
        Pagers("Next Match",ListMatchFm())
    )

    override fun getItem(p0: Int): Fragment = fragments[p0].fragment

    override fun getCount(): Int = fragments.size

    override fun getPageTitle(position: Int): CharSequence? = fragments[position].title
}

class Pagers(val title: String, val fragment: Fragment)