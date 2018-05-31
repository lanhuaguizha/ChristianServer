package com.christian

/**                                                                                                                         │~
 * Concrete implementation of a data source as a db.                                                                        │~
 */
class NavsLocalDataSource : NavsDataSource {
    override fun getNavs(callback: NavsDataSource.LoadNavsCallback) {
    }

    override fun getNav(navId: String, callback: NavsDataSource.GetNavCallback) {
    }

    override fun deleteAllNavs() {
    }

    override fun deleteNav(navId: String) {
    }
}