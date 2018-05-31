package com.christian

import com.christian.domain.Nav

/**                                                                                                                         │~
 * Main entry point for accessing tasks data.                                                                               │~
 * <p>                                                                                                                      │~
 * For simplicity, only getTasks() and getTask() have callbacks. Consider adding callbacks to other                         │~
 * methods to inform the user of network/database errors or successful operations.                                          │~
 * For example, when a new task is created, it's synchronously stored in cache but usually every                            │~
 * operation on database or network should be executed in a different thread.                                               │~
 */
interface NavsDataSource {

    interface LoadNavsCallback {

        interface LoadNavsCallback {

            fun onNavsLoaded(navs: List<Nav>)

            fun onDataNotAvailable()

        }

    }

    interface GetNavCallback {

        fun onNavLoaded(nav: Nav)

        fun onDataNotAvailable()

    }

    fun getNavs(callback: LoadNavsCallback)

    fun getNav(navId: String, callback: GetNavCallback)

    fun deleteAllNavs()

    fun deleteNav(navId: String)

}