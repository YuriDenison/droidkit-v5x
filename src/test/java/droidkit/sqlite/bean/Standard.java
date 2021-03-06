package droidkit.sqlite.bean;

import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.math.BigInteger;

import droidkit.annotation.SQLiteColumn;
import droidkit.annotation.SQLiteObject;
import droidkit.annotation.SQLitePk;

/**
 * @author Daniel Serdyukov
 */
@SQLiteObject(value = "standard", uniqueOn = {"string", "boolean"}, activeRecord = false)
public class Standard {

    public static final String TABLE = "standard";

    public static final String COLUMNS_DEF = "_id INTEGER PRIMARY KEY ON CONFLICT REPLACE, " +
            "long INTEGER, " +
            "int INTEGER, " +
            "short INTEGER, " +
            "string TEXT, " +
            "boolean INTEGER, " +
            "double REAL, " +
            "float REAL, " +
            "big_decimal REAL, " +
            "big_integer INTEGER, " +
            "bytes BLOB, " +
            "role TEXT NOT NULL, " +
            "date INTEGER, " +
            "UNIQUE(string, boolean)";

    public static final String[] COLUMNS = new String[]{
            "_id",
            "long",
            "int",
            "short",
            "string",
            "boolean",
            "double",
            "float",
            "big_decimal",
            "big_integer",
            "bytes",
            "role",
            "date"
    };

    public static final String[] INDICES = new String[]{"role", "date"};

    @SQLitePk
    private long mId;

    @SQLiteColumn
    private long mLong;

    @SQLiteColumn
    private int mInt;

    @SQLiteColumn
    private short mShort;

    @SQLiteColumn
    private String mString;

    @SQLiteColumn
    private boolean mBoolean;

    @SQLiteColumn
    private double mDouble;

    @SQLiteColumn
    private float mFloat;

    @SQLiteColumn
    private BigDecimal mBigDecimal;

    @SQLiteColumn
    private BigInteger mBigInteger;

    @SQLiteColumn("bytes")
    private byte[] mByteArray;

    @SQLiteColumn(index = true)
    private Role mRole = Role.ADMIN;

    @SQLiteColumn(value = "date", index = true)
    private DateTime mDateTime;

    public long getId() {
        return mId;
    }

    public long getLong() {
        return mLong;
    }

    public void setLong(long aLong) {
        mLong = aLong;
    }

    public int getInt() {
        return mInt;
    }

    public void setInt(int anInt) {
        mInt = anInt;
    }

    public short getShort() {
        return mShort;
    }

    public void setShort(short aShort) {
        mShort = aShort;
    }

    public String getString() {
        return mString;
    }

    public void setString(String string) {
        mString = string;
    }

    public boolean isBoolean() {
        return mBoolean;
    }

    public void setBoolean(boolean aBoolean) {
        mBoolean = aBoolean;
    }

    public double getDouble() {
        return mDouble;
    }

    public void setDouble(double aDouble) {
        mDouble = aDouble;
    }

    public float getFloat() {
        return mFloat;
    }

    public void setFloat(float aFloat) {
        mFloat = aFloat;
    }

    public BigDecimal getBigDecimal() {
        return mBigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        mBigDecimal = bigDecimal;
    }

    public BigInteger getBigInteger() {
        return mBigInteger;
    }

    public void setBigInteger(BigInteger bigInteger) {
        mBigInteger = bigInteger;
    }

    public byte[] getByteArray() {
        return mByteArray;
    }

    public void setByteArray(byte[] byteArray) {
        mByteArray = byteArray;
    }

    public Role getRole() {
        return mRole;
    }

    public void setRole(Role role) {
        mRole = role;
    }

    public DateTime getDateTime() {
        return mDateTime;
    }

    public void setDateTime(DateTime dateTime) {
        mDateTime = dateTime;
    }

    public enum Role {USER, ADMIN}

}
