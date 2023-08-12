import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class RestaurantDatabaseHelper(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "restaurant.db"
        private const val DATABASE_VERSION = 1
        const val TABLE_ORDERS = "orders"
        const val COLUMN_ID = "_id"
        const val COLUMN_ITEM_NAME = "item_name"
        const val COLUMN_QUANTITY = "quantity"
        const val COLUMN_PRICE = "price"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTableQuery = ("CREATE TABLE $TABLE_ORDERS ("
                + "$COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "$COLUMN_ITEM_NAME TEXT, "
                + "$COLUMN_QUANTITY INTEGER, "
                + "$COLUMN_PRICE REAL)")
        db?.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_ORDERS")
        onCreate(db)
    }

    // Add more methods for inserting, updating, and querying the database as needed
}
