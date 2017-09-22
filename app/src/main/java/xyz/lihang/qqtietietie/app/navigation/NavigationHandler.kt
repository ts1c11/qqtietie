package xyz.lihang.qqtietietie.app.navigation

import android.content.Context
import android.support.v4.app.Fragment

/**
 * @author HanikLZ
 * @since 2016/10/27
 */
interface NavigationHandler {
    fun handleNavigate(context: Context, protocol: String, url: String, params: Map<String, String>)
    fun createNavigateFragment(protocol: String, url: String, params: Map<String, String>): Fragment?
}
