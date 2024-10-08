/*
 * This file is generated by jOOQ.
 */
package jp.co.sysystem.springWorkout.domain.jooqObject.tables.records;


import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import jp.co.sysystem.springWorkout.domain.jooqObject.tables.Userdetail;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * ユーザーマスタ詳細
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserdetailRecord extends UpdatableRecordImpl<UserdetailRecord> implements Record4<Integer, String, Timestamp, String> {

    private static final long serialVersionUID = 532030880;

    /**
     * Setter for <code>workout.userdetail.NO</code>. 管理番号
     */
    public void setNo(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>workout.userdetail.NO</code>. 管理番号
     */
    public Integer getNo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>workout.userdetail.ID</code>. ユーザーID
     */
    public void setId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>workout.userdetail.ID</code>. ユーザーID
     */
    public String getId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>workout.userdetail.BIRTH</code>. 生年月日
     */
    public void setBirth(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>workout.userdetail.BIRTH</code>. 生年月日
     */
    public Timestamp getBirth() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>workout.userdetail.CLUB</code>. 委員会
     */
    public void setClub(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>workout.userdetail.CLUB</code>. 委員会
     */
    public String getClub() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Timestamp, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, Timestamp, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Userdetail.USERDETAIL.NO;
    }

    @Override
    public Field<String> field2() {
        return Userdetail.USERDETAIL.ID;
    }

    @Override
    public Field<Timestamp> field3() {
        return Userdetail.USERDETAIL.BIRTH;
    }

    @Override
    public Field<String> field4() {
        return Userdetail.USERDETAIL.CLUB;
    }

    @Override
    public Integer component1() {
        return getNo();
    }

    @Override
    public String component2() {
        return getId();
    }

    @Override
    public Timestamp component3() {
        return getBirth();
    }

    @Override
    public String component4() {
        return getClub();
    }

    @Override
    public Integer value1() {
        return getNo();
    }

    @Override
    public String value2() {
        return getId();
    }

    @Override
    public Timestamp value3() {
        return getBirth();
    }

    @Override
    public String value4() {
        return getClub();
    }

    @Override
    public UserdetailRecord value1(Integer value) {
        setNo(value);
        return this;
    }

    @Override
    public UserdetailRecord value2(String value) {
        setId(value);
        return this;
    }

    @Override
    public UserdetailRecord value3(Timestamp value) {
        setBirth(value);
        return this;
    }

    @Override
    public UserdetailRecord value4(String value) {
        setClub(value);
        return this;
    }

    @Override
    public UserdetailRecord values(Integer value1, String value2, Timestamp value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserdetailRecord
     */
    public UserdetailRecord() {
        super(Userdetail.USERDETAIL);
    }

    /**
     * Create a detached, initialised UserdetailRecord
     */
    public UserdetailRecord(Integer no, String id, Timestamp birth, String club) {
        super(Userdetail.USERDETAIL);

        set(0, no);
        set(1, id);
        set(2, birth);
        set(3, club);
    }
}
