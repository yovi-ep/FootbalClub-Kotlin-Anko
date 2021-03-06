package com.yeputra.footballclub.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.yeputra.footballclub.model.Pagers


/**
 * Created by yovi.putra
 *    on 03/Mar/2019 17:22
 * Company SIEMO - PT. Multipolar Technology, Tbk
 */
class VPagerAdapter(
    private val fragments: MutableList<Pagers>,
    fmManager: FragmentManager
): FragmentPagerAdapter(fmManager){

    override fun getItem(position: Int): Fragment = fragments[position].fragment

    override fun getCount(): Int = fragments.size

    override fun getPageTitle(position: Int): CharSequence? = fragments[position].title
}
