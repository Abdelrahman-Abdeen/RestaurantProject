import android.provider.BaseColumns

object RestaurantContract {
    // Define table and column names
    object MenuItemEntry : BaseColumns {
        const val TABLE_NAME = "menu_items"
        const val COLUMN_ITEM_NAME = "item_name"
        const val COLUMN_QUANTITY = "quantity"
        const val COLUMN_PRICE = "price"
    }
}
